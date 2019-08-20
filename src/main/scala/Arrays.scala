
object Arrays {
  /*
    find the missing number in a given integer array of 1 to 100
    assume the array is sorted
   */
  def findMissingNumber(nums: List[Int]): Option[Int] = {

    @scala.annotation.tailrec
    def missing_internal(nums: List[Int], next_number: Int = 1): Option[Int] = nums match {
      case Nil if next_number == 101 => None
      case Nil => Some(next_number)
      case x :: xs => if (x != next_number) Some(next_number) else missing_internal(xs, next_number + 1)
    }

    nums match {
      case Nil => Some(1)
      case _   => missing_internal(nums)
    }
  }

  /*
    find the duplicate number on a given integer array?
   */

  def findDuplicate(nums: List[Int]): Option[Int] = {

    @scala.annotation.tailrec
    def findDupeInternal(nums: List[Int], tracker: Set[Int] = Set.empty): Option[Int] = nums match {
      case Nil => None
      case x::xs => if(tracker.contains(x)) Some(x) else findDupeInternal(xs, tracker + x)
    }

    findDupeInternal(nums)
  }
}
