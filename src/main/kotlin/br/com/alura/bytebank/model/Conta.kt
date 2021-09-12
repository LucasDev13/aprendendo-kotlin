package br.com.alura.bytebank.model

var totalContas = 0
    private set

abstract  class Conta(
    var titular: Cliente,
    val numero: Int
    ){
    var saldo = 0.0
        protected set

    init {
        println("Criando conta...")
        totalContas++
    }

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    abstract fun sacar(valor: Double)

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}