fun main() {

    print("Öğrenci misin")
    val student= readLine()!!

   if (student=="Evet"){/**o lovercase  bütün harfleri küçüge cevirir toApperCse bütün harfleri büyüge çevirir*/
    println("Ögrenci")}

    else{
        println("Ögrenci Değil")
    }
    val result:String= if(student=="Evet"){
        "Ögrenci"
    }else
    {
        "Ögrenci Degil"
    }
    println(result)/** kotlinde exprerationdur ifade olarak yazıldıgında ternary operatörü  default olarak oldugu için ternary operatörü yok */

    val isStudent=false
    val name=if (isStudent) "true" else "false"
    println(name)



println("Lütfen notu Girin")
    val not= readLine()!!.toDouble()

     if (not<=100 || not>=85){
        println("AA")
    }
    else if(not<=84 || not>=70){
        println("BB")
    }
    else if (not<=69 || not>=60){
        println("CC")
    }
    else if (not<=59 || not>=50){
        println("DD")
    }
    else println{("Hayırlısı be Gulum")
     }

    }


