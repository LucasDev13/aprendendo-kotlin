fun testaFuncoes() {
    val titular: String = "Lucas"
    val numeroConta: Int = 1000
    var saldo: Double = 10.0
    saldo = 100 + 2.0
    saldo += 200
    saldo -= 10000

    //println("titular " + titular) //o intellij vai demarcar onde pode ser melhorado código.
    println("titular $titular") // utilizando string template
    println("Numero da conta $numeroConta")
    println("saldo da conta $saldo")

    println("chamando as funções de if")
    funcaoIf(saldo)
    println("chamando as funções de when")
    funcaoWhen(saldo)

    var i = 1
    while (i < 5) {
        println("Executando o while")
        val titular: String = "Lucas $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0
        //println("titular " + titular) //o intellij vai demarcar onde pode ser melhorado código.
        println("titular $titular") // utilizando string template
        println("Numero da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
        println("chamando as funções de if")
        funcaoIf(saldo)
        println("chamando as funções de when")
        funcaoWhen(saldo)
        println()
        i++
    }

    for (i in 1..5) {
        println("executando o for loop")
        val titular: String = "Lucas $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
    }

    for (i in 5 downTo 1) {
        println("executando o for loop com downTo")
        val titular: String = "Lucas $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
    }

    for (i in 1..6 step 2) {
        println("executando o for loop com o step")
        val titular: String = "Lucas $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
    }
}