import br.com.alura.bytebank.model.Endereco
import br.com.alura.bytebank.test.testaAny
import java.lang.ClassCastException
import java.lang.NumberFormatException

fun main() {
    println("início main")
    val entrada: String = "1.0"
    val valorRecebido: Double? = try{
        entrada.toDouble()
    }catch (e: NumberFormatException){
        println("Problema na conversão!")
        e.printStackTrace()
        null
    }

    //if com expressão
    val valorComTaxa: Double? = if (valorRecebido != null){
        valorRecebido + 0.1
    }else{
        null
    }

    //if sem expressão.
    if(valorComTaxa != null){
        println("valor recebido: $valorComTaxa")
    }else{
        println("valor inválido")
    }

    funcao1()
    println("fim main")
}

fun funcao1(){
    println("início funcao1")
    try {
        funcao2()
    }catch (e: ClassCastException){
        println(e.message)
        println(e.stackTrace)
        println(e.cause)//não tem um causa porque aconteceu a exception. vai aparecer null
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
        endereco as Endereco
    }
    println("fim funcao2")
}


