fun main() {
     val countryCode= readLine()!!

    when(countryCode.toLowerCase()){
        "tr" -> println("Tc Vatandasi")
        "ar" -> println("Arap Vatandasi")
        "ge" -> println("Alman Vatandasi")
        "gb" -> println("Britanya Vatandasi")
        "us" -> println("Amariga Vatandasi")
        "ru" -> println("Rus Vatandasi")

    }

    when {
        countryCode.toLowerCase()=="tr" -> println("TC Vatandasi")
        countryCode.toLowerCase()=="ar" -> println("Arab Vatandasi")
        countryCode.toLowerCase()=="ge" -> println("Alman Vatandasi")
        countryCode.toLowerCase()=="gb" -> println("Britanya Vatandasi")
        countryCode.toLowerCase()=="us" -> println("Amerika Vatandasi")
        countryCode.toLowerCase()=="ru" -> println("Rus Vatandasi")
    }

    if (countryCode.toLowerCase()=="tr") println("TC Vatandasi")
    else if (countryCode.toLowerCase()=="ar") println("Arab Vatandasi")
    else if (countryCode.toLowerCase()=="ge") println("Alman Vatandasi")
    else if (countryCode.toLowerCase()=="gb") println("Britanya Vatandasi")
    else if (countryCode.toLowerCase()=="us") println("Amariga Vatandasi")
    if (countryCode.toLowerCase()=="ru") println("Rus Vatandasi")

    val phoneNumber:Long=443300022

    if (phoneNumber is Long){
        println("Long Value")
    }
    else{
        println("Short value")
    }

    when(phoneNumber){
        is Long ->{
            println("Long value")
        }
    }

}