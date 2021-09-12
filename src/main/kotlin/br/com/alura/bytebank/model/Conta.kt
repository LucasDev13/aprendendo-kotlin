package br.com.alura.bytebank.model

import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException

abstract  class Conta(
    var titular: Cliente,
    val numero: Int
    ): Autenticavel{
    var saldo = 0.0
        protected set

    //temos uma instancia com seu próprio escopo
    //quem vai poder acessar são apenas os membros do contador
    //precisamos configurar esse object para que ele comportilhe o acesso dos seus membros
    // utilizando o recurso de companion objects eu consigo acessar ele como sendo um membro da classe mesmo sendo com private
    //ele é private e restrito somente a classe Conta
//    companion object Contador {
    companion object{
        var total = 0
            private set
    }

    init {
        println("Criando conta...")
//        Contador.total++
//        total++
        Companion.total++
    }

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    abstract fun sacar(valor: Double)

    fun transfere(valor: Double, destino: Conta, senha: Int){
        if (saldo < valor) {
            throw SaldoInsuficienteException(
                mensagem = "O saldo é insuficiente, saldo atual: " +
                        "$saldo, valor para ser transferido: $valor")
        }
        if (!autentica(senha)){
            throw FalhaAutenticacaoException()
        }

        saldo -= valor
        destino.deposita(valor)
    }
}