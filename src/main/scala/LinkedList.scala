
case class LinkedList[A](head: Option[Node[A]]) {
  override def toString: String = head.toString
}

case class Node[A](data: A, next: Option[Node[A]]) {
  override def toString: String = s"Node, data = $data, next = ${next.toString}"
}

object LinkedList {
  def reverse[A](list: LinkedList[A]): LinkedList[A] = {

    @scala.annotation.tailrec
    def go(curr: Option[Node[A]], prev: Option[Node[A]]): Option[Node[A]] = curr match  {
      case None => prev
      case Some(n) =>

      val next = n.next
      val currUpdated = n.copy(next = prev)
      go(next, Some(currUpdated))

    }

    list.head match {
      case None => list
      case node => LinkedList(go(node, None))
    }

  }

  def test(): Unit = {
    val ll = LinkedList(Some(Node("node 1", Some(Node("node 2", None)))))
    println(ll)
    print(reverse(ll))

  }
}




