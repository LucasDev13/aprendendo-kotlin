import br.com.alura.bytebank.model.Endereco

fun main() {
    val endereco = Endereco()
    val enderecoNovo = endereco
    println(endereco.equals(enderecoNovo))
    //hashCode gera um hash que faz a identificação do objeto.
    //então o objeto sempre vai ter esse hash independente de quantas vezes chamar
    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    //toString é chamado sempre que precisamos imprimir um objeto
    println(enderecoNovo.toString())
    println(enderecoNovo.toString())

    //outro forma de mostrar o nome do objeto
    println("${endereco.javaClass}@${Integer.toHexString(endereco.hashCode())}")
}

fun imprime(valor: Any): Any {
    println(valor)
    return valor
}
