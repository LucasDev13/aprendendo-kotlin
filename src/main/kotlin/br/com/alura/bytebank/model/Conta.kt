package br.com.alura.bytebank.model

abstract  class Conta(
    var titular: Cliente,
    val numero: Int
    ){
    var saldo = 0.0
        protected set

    init {
        println("Criando conta...")
        Contador.total++
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