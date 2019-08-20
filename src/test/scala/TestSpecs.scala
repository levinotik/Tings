import org.scalatest._
import Matchers._


class TestSpecs extends FlatSpec {
  import Arrays._
  "findMissingNumber" should "return the first missing number from 1 to 100" in {

    val nums = List(1)
    val result = findMissingNumber(nums)
    result shouldEqual Some(2)

    val nums_1 = (1 to 99).toList
    val result_1 = findMissingNumber(nums_1)
    result_1 shouldEqual Some(100)

  }

  "findDuplicate" should "return the first duplicate int in a list" in {
    val nums = List(1, 1)
    val result = findDuplicate(nums)
    result shouldEqual Some(1)

    val nums_1 = List(1)
    val result_1 = findDuplicate(nums_1)
    result_1 shouldEqual None

    val nums_2 = (1 to 100).toList :+ 100
    val result_2 = findDuplicate(nums_2)
    result_2 shouldEqual Some(100)

  }
}
