open class Person(firstname:String,lastname:String){
    var age:Int=-1
    init{
        println("First Name:$firstname")
        println("Last Name:$lastname")
    }
    constructor(firstname: String,lastname: String,age:Int):this(firstname,lastname){
        this.age=age
        println("Age $age")
    }
}
class Student(firstname:String,lastname:String,age: Int,eno:Long,branch:String,Class:String):Person(firstname,lastname,age){
    var batch:String=""
    init{
        println("Branch $branch")
        println("Class $Class")
    }
    constructor(firstname:String,lastname:String,age: Int,eno:Long,branch:String,Class:String,batch:String):this(firstname,lastname,age,eno,branch,Class){
        this.batch=batch
        println("Batch $batch")
        println("--------------")
    }

}
fun main(){
    var s1=Student("Anil","Prajapati",21,20012011139,"CE","C","AB8")
    var s2=Student("Vishnu","Tak",20,20012011181,"CE","C","AB8")
    var s3=Student("Prince","Verma",19,20012011141,"CE","C","AB8")
    var s4=Student("Sahil","Khan",19,20012021056,"IT","B","AB5")
    var s5=Student("Dhruv","Sharma",20,20012531007,"AI","B","AI-2")

}
