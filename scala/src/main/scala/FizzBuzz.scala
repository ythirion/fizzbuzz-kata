object FizzBuzz {
  private final val lowerBound: Int = 1
  private final val upperBound: Int = 100

  def convert(i: Int): Option[String] = {
    if (inRange(i)) Some(convertToString(i))
    else None
  }

  private def inRange(i: Int): Boolean = i >= lowerBound && i <= upperBound

  private def convertToString(i: Int): String = (i % 3, i % 5) match {
    case (0, 0) => "FizzBuzz"
    case (0, _) => "Fizz"
    case (_, 0) => "Buzz"
    case _ => i.toString
  }
}