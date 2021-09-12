import br.com.alura.bytebank.model.*

fun testaContasDiferentes() {
    //cria uma conta corrente
    val contaCorrente = ContaCorrente(
        titular = Cliente(
            nome = "Alex",
            cpf = "",
            senha = 1,
            endereco = Endereco(logradouro = "Testa logradouro.")
        ),
        numero = 1000
    )
    //cria uma conta poupança
    val contaPoupanca = ContaPoupanca(
        titular = Cliente(
            nome = "Fran",
            cpf = "",
            senha = 2,
            endereco = Endereco(logradouro = "Testa logradouro.")
        ),
        numero = 1001
    )

    println("titular - endereço do objeto ${contaCorrente.titular}")
    println("nome do titular ${contaCorrente.titular.nome}")
    println("cpf do titular ${contaCorrente.titular.cpf}")
    println("logradouro do titular ${contaCorrente.titular.endereco.logradouro}")
    println("logradouro do titular - endereço do objeto ${contaCorrente.titular.endereco}")

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("---- Saldo conta corrente ${contaCorrente.saldo}")
    println("Saldo conta poupanca ${contaPoupanca.saldo}")

    contaCorrente.sacar(100.0)
    contaPoupanca.sacar(100.0)

    println("Saldo conta corrente, sacado -> ${contaCorrente.saldo}")
    println("Saldo conta poupanca, sacado -> ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca, 2)
    println("Saldo conta corrente, menos -> ${contaCorrente.saldo}")
    println("Saldo conta poupanca, ganhou -> ${contaPoupanca.saldo}")

    contaPoupanca.transfere(100.0, contaCorrente, 1)
    println("Saldo conta poupanca, menos -> ${contaPoupanca.saldo}")
    println("Saldo conta corrente, ganhou -> ${contaCorrente.saldo}")
}