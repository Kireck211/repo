
fun greeting(name:String) {
  println("Hello $name")
}

fun greet(name:String) = println("Hello $name") 

fun eat(food: String = "Pizza", amount: Int) {
  println("Eating $amount $food")
}

fun calculateCost(indirect: Int, direct: Int) : Int {
  return indirect + direct
}

fun calcCosts(indirect: Int, direct: Int, investment: Int) : Int = indirect + direct + investment

fun calculateBudget(partners: Int, budget: Int = 0) = partners * budget

fun main(args: Array<String>) {
  greeting("Student")
  greet("Intelligent student")
  eat(amount = 2)
  println("Costs: ${calculateCost(150, 200)}")
  println("Costs: ${calcCosts(150, 200, 10000)}")
  println("Costs: ${calculateBudget(5, 1000000000)}")
}



