fun main() {

    val numbers=1..100//1 ile 100 arası 1 ve 100 dahil
    val numbers2= 1.rangeTo(100) //100 dahil değil
    val alphabet='A'..'Z'

    val resevedNumbers=100..1

    val resevedNumbers2=100.downTo(1)//100den 1e kadar
    val resevedNumbers3=10 downTo 1

    val gradeNumbers=10.until(100)//10 ile 100 arası 100 dahil değil
    val gradeNumbers2=10 until 100

    val stepNumber=1..100 step(2)//1 ile 100 arasındaki sayıları ikşer ikişer geçer
    val stepNumber2=1..100 step 2



    for (char in alphabet){
        print(char)
    }


}