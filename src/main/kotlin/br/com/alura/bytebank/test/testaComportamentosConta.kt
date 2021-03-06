import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.model.*

fun testaComportamentosConta() {
    val alex = Cliente(nome = "Alex", cpf = "", senha = 1)
    val fran = Cliente(nome = "Fran", cpf = "", senha = 2)

    println()
    val conta1 = ContaCorrente(titular = alex, numero = 1000)
//    conta1.setSaldo(300.0)

    val conta2 = ContaPoupanca(numero = 1001, titular = fran)
//    conta2.setSaldo(400.0)

    println(conta1.titular)
    println(conta1.numero)
    println(conta1.saldo)
    println()
    println(conta2.titular)
    println(conta2.numero)
    println(conta2.saldo)

    println("Depositando na conta 1:")
    conta1.deposita(50.0)
    println("Realizado o deposito conta1 ${conta1.saldo}")
    println()
    println("Depositando na conta 2:")
    conta2.deposita(70.0)
    println("Realizado o deposito conta2 ${conta2.saldo}")
    println()
    //fazer a parte do sacar
    println("Sacando da conta 1: ${conta1.sacar(valor = 350.0)}")
    println("Sacando da conta 2: ${conta2.sacar(valor = 470.0)}")

    println()

    println("Saldo conta 1 : ${conta1.saldo}")
    println("Saldo conta 2 : ${conta2.saldo}")
    println()

    println("Transferência da conta2 para a conta1")
    try {
        conta2.transfere(valor = 50.0, conta1, 2)
        println("Transferencia sucedida")
    }catch (e: SaldoInsuficienteException) {
        println("Falha na transferencia, sem saldo")
        println("Saldo insuficiente")
        e.printStackTrace()
    }catch (e: FalhaAutenticacaoException){
        println("Falha na transferencia")
        println("Falha na autenticação")
        e.printStackTrace()
    }catch (e: Exception){
        println("Erro desconhecido.")
        e.printStackTrace()
    }

    println(conta1.saldo)
    println(conta2.saldo)
}