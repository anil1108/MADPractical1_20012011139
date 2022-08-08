fun op(o:Char, vararg numArray : Int ):Int {
    val a = 0
    var num : Int
    when (o) {
        '+' -> {
            for (num in numArray) {
                val a =  a + num
            }
            println("Addition of ")
        }
        '-' -> {
            for (num in numArray) {
                val a = a - num
            }
        }
        '*' -> {
            for(num in numArray) {
                val a = a * num
            }
        }
        '/' -> {


        }
    }
    return 0
}


fun main(){
    val numArray = arrayOf(111,2222,-222)
    println("Enter the operation to b performed : '+' , '-' , '*' , '/' : ")
    var o = readLine()!!.toCharArray()
    //println(op(o,numArray))
}