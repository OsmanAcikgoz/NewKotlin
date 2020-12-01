fun main() {

    val studentArray= arrayOf(43,56,213,672,366,6)
    val studentNames= arrayOf("Ali","Mehmet","Veli","Eyşan")
    val firstCharOfNames= arrayOf('A','M','V','E')
    val mixedArray= arrayOf('A',43,"Veli",'E')
    val arrayOfNulls= arrayOfNulls<String>(4)//degerler henüz belli degilse tipi belli olacak ve belirli bir size'a kadar eleman hakkı veriyor

    val carNames=Array<String>(5){"Mercedes"}

    val carNumber=Array<String>(5){
        (it*it).toString()
    }
    val numberArray= arrayOf(1,2,3,4,5,6,7,8,9,0)
    val squareNumberArray=arrayOfNulls<Int>(numberArray.size)

    val index=0
    for (numberValue in numberArray){
        squareNumberArray[index]=numberValue*numberValue
    }

    val firstCharOfCountrys=CharArray(4)

    firstCharOfCountrys[0]='T'
    firstCharOfCountrys.set(1,'B')
    firstCharOfCountrys.set(2,'C')
    firstCharOfCountrys[3] = 'A'
    println("firstCharOfCountrys:"+firstCharOfCountrys.get(1))
    println("firstCharOfCountrys:"+ firstCharOfCountrys[1])

    


}