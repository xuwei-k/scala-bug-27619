package example

object Main {
  def main(args: Array[String]): Unit = {
    println(B.f(lib.A.A3)) // expect MatchError
  }
}
