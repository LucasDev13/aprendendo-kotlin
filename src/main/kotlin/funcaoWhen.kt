fun funcaoWhen(saldo: Double) {
    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }
}