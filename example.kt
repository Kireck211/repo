import java.util.*

fun main(args: Array<String>) {
  val numbers = readLine()!!.split(" ").map{ number -> number.toInt() } 

  var i = numbers.size - 1
  while(i > 0) {
    print("${numbers[i]} ")
    i--
  }
  
  println("${numbers[i]}")
}