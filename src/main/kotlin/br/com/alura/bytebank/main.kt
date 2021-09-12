import br.com.alura.bytebank.exception.SaldoInsuficienteException

fun main() {
    println("início main")
//    funcao1()
    testaComportamentosConta()
    println("fim main")
}

fun funcao1(){
    println("início funcao1")
    try {
        funcao2()
    }catch (e: SaldoInsuficienteException){
        e.printStackTrace()//vai conter a pilha de exception
        println("foi pego a SaldoInsuficienteException.")
    }
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5){
        println(i)
        throw SaldoInsuficienteException()
    }
    println("fim funcao2")
}


