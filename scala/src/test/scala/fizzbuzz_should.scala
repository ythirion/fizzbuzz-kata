import org.scalatest.OptionValues.convertOptionToValuable
import org.scalatest.flatspec.AnyFlatSpec

import scala.language.postfixOps

class fizzbuzz_should extends AnyFlatSpec {
  it should "return the given number" in {
    assert(FizzBuzz.convert(1).value == "1")
    assert(FizzBuzz.convert(67).value == "67")
    assert(FizzBuzz.convert(82).value == "82")
  }

  //TODO : parameterize them
  it should "return Fizz for multiples of 3" in {
    assert(FizzBuzz.convert(3).value == "Fizz")
    assert(FizzBuzz.convert(66).value == "Fizz")
    assert(FizzBuzz.convert(99).value == "Fizz")
  }

  it should "return Fizz for multiples of 5" in {
    assert(FizzBuzz.convert(5).value == "Buzz")
    assert(FizzBuzz.convert(50).value == "Buzz")
    assert(FizzBuzz.convert(85).value == "Buzz")
  }

  it should "return FizzBuzz for multiples of 3 and 5 (multiples of 15)" in {
    assert(FizzBuzz.convert(15).value == "FizzBuzz")
    assert(FizzBuzz.convert(30).value == "FizzBuzz")
    assert(FizzBuzz.convert(45).value == "FizzBuzz")
  }

  it should "return None because it is out of range [1, 100]" in {
    assert(FizzBuzz.convert(0).isEmpty)
    assert(FizzBuzz.convert(101).isEmpty)
    assert(FizzBuzz.convert(-1).isEmpty)
  }
}