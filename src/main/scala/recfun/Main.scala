package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println(args)
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }



  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if(c == 0) 1 //leftmost
    else if(c == r) 1 //rightmost
    else pascal(c - 1, r - 1) + pascal(c, r -1) //recurrence relation
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {

    def se(chars: List[Char],cnt: Int): Boolean = { //to send cnt parameter
      if(cnt < 0) false //if ) goes first

      else if(chars.isEmpty && cnt == 0) true //if searched all and balanced
      else if(chars.isEmpty && cnt != 0) false //if searched all but unbalanced

      else if(chars.head == '(') se(chars.tail,cnt+1) //counts increase if (
      else if(chars.head == ')') se(chars.tail,cnt-1) //counts decrease if )
      else se(chars.tail, cnt) //if not parentheses, skip

    }
    se(chars,0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if (money == 0) 1
    else if (money < 0 || coins.isEmpty) 0 //if money is not divided or coins are empty
    else countChange(money - coins.head, coins) + countChange(money, coins.tail) //take head's coin or take next coin
  }

}
