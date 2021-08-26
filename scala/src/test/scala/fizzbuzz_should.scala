import org.scalatest.OptionValues.convertOptionToValuable
import org.scalatest.flatspec.AnyFlatSpec

class fizzbuzz_should extends AnyFlatSpec {
  it should "return the given number" in {
    assertFizzBuzzValue(1, 67, 82)(i => i.toString)
  }

  it should "return Fizz for multiples of 3" in {
    assertFizzBuzzValue(3, 66, 99)(_ => "Fizz")
  }

  it should "return Fizz for multiples of 5" in {
    assertFizzBuzzValue(5, 50, 85)(_ => "Buzz")
  }

  it should "return FizzBuzz for multiples of 3 and 5 (multiples of 15)" in {
    assertFizzBuzzValue(15, 30, 45)(_ => "FizzBuzz")
  }

  it should "return None because it is out of range [1, 100]" in {
    assertFizzBuzzEmpty(0, 101, -1)
  }

  private def assertFizzBuzzValue(sample: Int*)(expectedValue: Int => String): Unit = {
    sample.foreach(i => assert(FizzBuzz.convert(i).value == expectedValue(i)))
  }

  private def assertFizzBuzzEmpty(sample: Int*): Unit = {
    sample.foreach(i => assert(FizzBuzz.convert(i).isEmpty))
  }
}