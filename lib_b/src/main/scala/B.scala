package example

object B {
  def f(a: lib.A): Int = a match {
    case lib.A.A1 => 1
    case lib.A.A2 => 2
  }
}
