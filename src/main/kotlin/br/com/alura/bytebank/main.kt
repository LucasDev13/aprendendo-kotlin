import br.com.alura.bytebank.model.Endereco

fun main() {
    //chamada encadeada do salfe call ou um safe call combinado com um let
    var enderecoNulo: Endereco? = Endereco(logradouro = "Rua do nada")
    val logradouroNovo: String? = enderecoNulo?.logradouro
    enderecoNulo?.let {
        println(it.logradouro.length)
//        println(endereco.logradouro.length)
        val tamanhoCompleto: Int =
            it.complemento?.length ?: throw IllegalStateException("Complemento não pode ser vazio")
        println(tamanhoCompleto)
    }

    teste("")
    teste(1)
}

fun teste(valor: Any){
    val numero: Int? = valor as? Int
}



