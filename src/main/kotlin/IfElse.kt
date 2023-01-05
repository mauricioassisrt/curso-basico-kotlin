fun main(args: Array<String>) {
//    println("Digite um numero ")
//    val i = readLine()?.toInt()!!
//
//    if ((i % 2) == 0)
//        println("Par")
//    else
//        println("impar")

    println("Digite sua nota ")
    val i = readLine()?.toInt()!!

    if (i <= 5)
        println("Reprovado")
    else if (i > 11 && i < 20)
        println("Aprovado")
    else if (i >= 5 && i <= 9)
        println("Exame")

}
