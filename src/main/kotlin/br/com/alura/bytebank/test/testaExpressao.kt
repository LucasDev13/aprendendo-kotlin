package br.com.alura.bytebank.test

import java.lang.NumberFormatException

fun testaExpressao() {
    val entrada: String = "1.0"
    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na conversão!")
        e.printStackTrace()
        null
    }

    //if com expressão
    val valorComTaxa: Double? = if (valorRecebido != null) {
        valorRecebido + 0.1
    } else {
        null
    }

    //if sem expressão.
    if (valorComTaxa != null) {
        println("valor recebido: $valorComTaxa")
    } else {
        println("valor inválido")
    }
}