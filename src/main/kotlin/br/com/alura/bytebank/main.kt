import br.com.alura.bytebank.model.Endereco

fun main() {
    var enderecoNulo: Endereco? = null
    val enderecoNaoNulo: Endereco = enderecoNulo!!
    enderecoNaoNulo.logradouro
}



