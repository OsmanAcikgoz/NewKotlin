fun main() {
    val name="Osman"
    val char1='O'
    val char2='s'
    val char3='m'
    val char4='a'
    val char5='n'
    val nameArray= charArrayOf(char1,char2,char3,char4,char5)

    for (char in name){
        print(char)
    }
     val numberValue="value"+(4+3+2)
    println("Değer $numberValue")

    val rawTree="""
         *
        * *
       * * *
    """.trimIndent()

    println(rawTree)
}