import br.com.alura.bytebank.model.*

fun testaContasDiferentes() {
    //cria uma conta corrente
    val contaCorrente = ContaCorrente(
        titular = Cliente(nome = "Alex", cpf = "", senha = 1),
        numero = 1000
    )
    //cria uma conta poupança
    val contaPoupanca = ContaPoupanca(
        titular = Cliente(nome = "Fran", cpf = "", senha = 2),
        numero = 1001
    )

    println("titular")
    println("nome do titular ${contaCorrente.titular.nome}")
    println("cpf do titular ${contaCorrente.titular.cpf}")

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