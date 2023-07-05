package LabSheet_04
import scala.io.StdIn

object Q2 {
  def main(args: Array[String]): Unit = {
    println("Enter the number : ")
    val number = StdIn.readInt()
    println("Your number > " + patternMatching(number))
  }

  def patternMatching(number:Int) : String = number match{
    case x if number <= 0 => "Negative/Zero"
    case x if number%2 == 0 => "Even"
    case x if number%2 != 0 => "Odd"
  }
}

