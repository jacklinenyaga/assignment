//n a class of 57 students the teacher was collecting data of her students,
//* The data she required was:
//* The gender of the students
//* The course they are doing
//* the feedback on boys playing football
//* the feedback on the ladies playing hockey
//* the feedback on the curriculum
//* Using inheritance, represent the gender and the course as
//* properties and the feedback as methods*/
fun main() {
    var Learner= Students ()
    Learner.gender="29 males and 32 females"
    Learner.course="tourism"
    println("there are ${Learner.gender} pursuing a course in ${Learner.course}")
    Learner.feedback()

    var girls= Ladies ()
    girls.gender="female"
    girls.quantity=32
    println("the class has ${girls.quantity} ${girls.gender} students")
    girls.feedback()

    var male= Boys ()
    male.gender="male"
    male.quantity=16
    println("the class has ${male.quantity} ${male.gender} students")
    male.feedback()

}
class Students{
    var gender:String = ""
    var course:String = ""
    fun feedback(){
        println("the students are taking the CBET curriculum")
    }
}
class Ladies{
    var gender:String = ""
    var quantity: Int = 0
    fun feedback(){
        println("6 ladies play hockey")
    }

}
class Boys{
    var gender:String = ""
    var quantity: Int = 0
    fun feedback(){
        println("26 boys play hockey")
    }

}