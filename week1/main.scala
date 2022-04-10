package scalaCoursera.week1.main
import common._

object Main {
  def main(args: Array[String]) {
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }
val x : Int = 7/2
  println(x)
  /*val x: Int = Random.nextInt(10)

  x match {
    case 0 => "zero"
    case 1 => "one"
    case 2 => "two"
    case _ => "many" _ ловит все оставшиеся варианты */

    //Треугольник Паскаля

    // c - столбец, r - строка
    def pascal(c: Int, r: Int): Int =
      if (c == 0 || c == r) 1
      else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
   * Exercise 2
   */
def balance(chars: List[Char]): Boolean = {
  def balanceWithCounter(chars: List[Char], openParen: Int): Boolean = {
  if (chars.isEmpty) openParen == 0
  else {
  val num =
  if (chars.head == '(') openParen + 1
  else if (chars.head == ')') openParen - 1
  else openParen
  if (num >= 0) balanceWithCounter(chars.tail, num)
  else false
  }
  }
  balanceWithCounter(chars, 0)
  }

  /**
   * Exercise 3
   */
  // money - деньги, coins - это достоинства монет
  // сдача 4: 1+1+1+1, 1+1+2, 2+2
  def countChange(money: Int, coins: List[Int]): Int =
  if (money < 0 || coins.isEmpty) 0
  else if (money == 0) 1
  else countChange(money - coins.head, coins) + countChange(money, coins.tail)
  }
}