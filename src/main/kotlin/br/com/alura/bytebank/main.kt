import br.com.alura.bytebank.model.Endereco
import br.com.alura.bytebank.test.testaAny
import br.com.alura.bytebank.test.testaExpressao
import java.lang.ClassCastException
import java.lang.NumberFormatException

fun main() {
    println("início main")
    funcao1()
    println("fim main")
}

fun funcao1(){
    println("início funcao1")
    try {
        funcao2()
    }catch (e: ClassCastException){
        e.printStackTrace()//vai conter a pilha de exception
        println("vai pego a ClassCastException.")
    }
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5){
        println(i)
        val endereco = Any()
        throw ClassCastException()
    }
    println("fim funcao2")
}


