
fun getCustomerInfo(name: String, phone: String): Pair<String, String>{
    return Pair(name, phone)
}

fun getCustomerInfo(businessName: String, name: String, phone: String): Triple<String, String, String>{

    return Triple(businessName, name, phone)
}


//fun addSomeNumbers(x: Int, y: Int): Int{
//    return x+y
//}
//
//fun addSomeNumbers(x: Int, y:Int, z: Int): Int{
//    var ans = x+ y+ z
//    return ans
//
//}

fun main(){
    var selectionNum = 0
    print("please indicate which type of customer you are\n" +
            "1. Residential\n" +
            "2. Business\n")
    selectionNum = readLine()!!.toInt()
    if (selectionNum == 1){
        print("name:\n")
        var name = readLine()!!.toString()
        print("phone:\n")
        var phone = readLine()!!.toString()
        println(getCustomerInfo(name, phone))
    } else if (selectionNum == 2) {
        print("Business Name:\n")
        var businessName = readLine()!!.toString()
        print("name:\n")
        var name = readLine()!!.toString()
        print("phone:\n")
        var phone = readLine()!!.toString()
        println(getCustomerInfo(businessName, name, phone))
    }
}
