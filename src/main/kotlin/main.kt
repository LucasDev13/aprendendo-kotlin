fun main() {
    print("Bem vindo ao bytebank: ")

    //cria uma conta corrente
     val contaCorrente = ContaCorrente(
         titular = "ALex",
         numero = 1000
     )
    //cria uma conta poupança
    val contaPoupanca = ContaPoupanca(
        titular = "Fran",
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("---- Saldo conta corrente ${contaCorrente.saldo}")
    println("Saldo conta poupanca ${contaPoupanca.saldo}")

    contaCorrente.sacar(100.0)
    contaPoupanca.sacar(100.0)

    println("Saldo conta corrente, sacado -> ${contaCorrente.saldo}")
    println("Saldo conta poupanca, sacado -> ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)
    println("Saldo conta corrente, menos -> ${contaCorrente.saldo}")
    println("Saldo conta poupanca, ganhou -> ${contaPoupanca.saldo}")

    contaPoupanca.transfere(100.0, contaCorrente)
    println("Saldo conta poupanca, menos -> ${contaPoupanca.saldo}")
    println("Saldo conta corrente, ganhou -> ${contaCorrente.saldo}")


}



