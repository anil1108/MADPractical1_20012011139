fun main(){
    print("Enter the Number:")
    var num = readLine()!!.toInt()
    println(if(num%2==0)
        "$num is Even"
    else
        "$num is Odd"
        )

}