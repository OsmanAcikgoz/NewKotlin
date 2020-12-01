fun main() {

    val FirstCharofName:Char='A'
    val charNumber:Char='3'

    val convertedCharNumber=charNumber.toInt()


    println("charNumber$convertedCharNumber")
    println("FirstChar$FirstCharofName")

    val escapeChar:Char='\t'
    val escapeChar1:Char='\n'
    val escapeChar2:Char='\b'
    val escapeCharA:Char='\r'
    val escapeCharB:Char='\''
    val escapeCharC:Char='\"'
    val escapeCharD:Char='\\'
    val escapeChar3:Char='\$'

    val LoremIpsum=
        "Lorem IpsumT"+escapeChar+
        "Lorem Ipsum1"+escapeChar1+
        "Lorem Ipsum2"+escapeChar2+
        "Lorem IpsumA"+escapeCharA+
        "Lorem IpsumB"+escapeCharB+
        "Lorem IpsumC"+escapeCharC+
        "Lorem IpsumD"+escapeCharD+
        "Lorem Ipsum3"+escapeChar3
    println(LoremIpsum)

    val uniCode='\u1F61'
    println("UniCode $uniCode")


}