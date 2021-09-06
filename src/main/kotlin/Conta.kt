class Conta(
    var titular: String,
    val numero: Int
    ){
    var saldo = 0.0
        private set

    fun setSaldo(valor: Double) {
        if (valor > 0) {
            this.saldo = valor
        }
    }

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun sacar(valor: Double): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            return true
        }
        return false
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}