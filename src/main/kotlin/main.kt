fun main() {
    print("Bem vindo ao bytebank")
    println()
    val conta1 = Conta()
    conta1.titular = "Lucas"
    conta1.numero = 1000
    conta1.setSaldo(300.0)

    val conta2 = Conta()
    conta2.titular = "Thais"
    conta2.numero = 1001
    conta2.setSaldo(400.0)

    println(conta1.titular)
    println(conta1.numero)
    println(conta1.getSaldo())
    println()
    println(conta2.titular)
    println(conta2.numero)
    println(conta2.getSaldo())

    println("Depositando na conta 1:")
    conta1.deposita(50.0)
    println("Realizado o deposito conta1 ${conta1.getSaldo()}")
    println()
    println("Depositando na conta 2:")
    conta2.deposita(70.0)
    println("Realizado o deposito conta2 ${conta2.getSaldo()}")
    println()
    //fazer a parte do sacar
    println("Sacando da conta 1: ${conta1.sacar(350.0)}")
    println("Sacando da conta 2: ${conta2.sacar(470.0)}")

    println()

    println("Saldo conta 1 : ${conta1.getSaldo()}")
    println("Saldo conta 2 : ${conta2.getSaldo()}")
    println()

    println("Transferência da conta2 para a conta1")
    if(conta2.transfere(100.0, conta1)){
        println("Transferencia sucedida")
    }else{
        println("Falha na transferencia, sem saldo")
    }

    println(conta1.getSaldo())
    println(conta2.getSaldo())

}

class Conta(){
    var titular = ""
    var numero = 0
    private var saldo = 0.0

    fun getSaldo(): Double{
        return saldo
    }

    fun setSaldo(valor: Double){
        this.saldo = valor
    }

    fun deposita(valor: Double){
        this.saldo += valor
    }

    fun sacar(valor: Double): Boolean{
        if(saldo >= valor) {
            saldo -= valor
            return true
        }
        return false
    }

    fun transfere(valor: Double, destino: Conta): Boolean{
        if(saldo >= valor){
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}

fun testaCopiasEReferencias(){
    val num1 = 10
    var num2 = num1 // recebe uma cópia do valor do num1
    num2++ //incrementa essa cópia recebido

    println("num1: $num1")
    println("num2: $num2")

    val conta3 = Conta()//aponta para um objeto em memória.
    conta3.titular = "Maria"//atribui um nome para o titular da variável de referencia conta3
    var conta4 = conta3 //a variável conta4 aponta para a mesma referencia/objeto da conta3
    conta4.titular = "Fredo"//modifica o valor do titular da vraiável conta3. de Maria passa a ser Fredo. Altera o mesmo objeto.

    println("conta3: ${conta3.titular}")
    println("conta4: ${conta4.titular}")

}

fun testaFuncoes(){
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

fun funcaoIf(saldo: Double) {
    if (saldo > 0.0) {
        println("Conta é positiva")
    } else if (saldo == 0.0) {
        println("conta é neutra")
    } else {
        println("conta é negativa")
    }
}

fun funcaoWhen(saldo: Double) {
    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }
}
