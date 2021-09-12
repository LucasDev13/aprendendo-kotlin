import br.com.alura.bytebank.model.Endereco

fun main() {
    //chamada encadeada do salfe call ou um safe call combinado com um let
    var enderecoNulo: Endereco? = Endereco(logradouro = "Rua do nada")
    val logradouroNovo: String? = enderecoNulo?.logradouro
    enderecoNulo?.let { endereco: Endereco ->
//        println(it.logradouro.length)
        println(endereco.logradouro.length)
    }


}



