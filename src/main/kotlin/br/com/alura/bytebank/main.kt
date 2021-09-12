import br.com.alura.bytebank.model.Endereco

fun main() {
    println()
    println(1)
    println(1.0)
    println(true)
    println("teste")

    val endereco = Endereco()

    println(endereco)

    imprime()
    imprime(1)
    imprime(1.0)
    imprime(endereco)
}

fun imprime(){
}

fun imprime(numero: Int){
}

fun imprime(numero: Double){
}

fun imprime(endereco: Endereco){
}