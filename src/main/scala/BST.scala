
case class BST[A: Ordering](value: A, left: Option[BST[A]], right: Option[BST[A]])
