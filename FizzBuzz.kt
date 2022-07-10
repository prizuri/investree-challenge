fun main() {
    println("Input your number")
    val number = readLine()?.toInt()
    val arrayNum = 1..(number?:1)
    for (num in arrayNum){
        if (num%3==0 && num%5==0){
            println("FizzBuzz")
        }
        else if (num%3==0){
            println("Fizz")
        }
        else if(num%5==0){
            println("Buzz")
        }
        else{
            println(num)
        }
    }
}