fun funcaoIf(saldo: Double) {
    if (saldo > 0.0) {
        println("br.com.alura.bytebank.model.Conta é positiva")
    } else if (saldo == 0.0) {
        println("conta é neutra")
    } else {
        println("conta é negativa")
    }
}