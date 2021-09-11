import br.com.alura.bytebank.model.*

fun testaFuncionarios() {
    val alex = Analista(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("nome: ${alex.nome}")
    println("cpf: ${alex.cpf}")
    println("salario: ${alex.salario}")
    println("bonificaçao: ${alex.bonificacao}")

    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 123456
    )

    println("nome: ${fran.nome}")
    println("cpf: ${fran.cpf}")
    println("salario: ${fran.salario}")
    println("bonificaçao: ${fran.bonificacao}")

    if (fran.autentica(123456)) {
        println("Autenticou com sucesso.")
    } else {
        println("Não autenticou")
    }

    val gui: Diretor = Diretor(
        "Gui",
        "333.333.333-33",
        4000.0,
        456,
        200.0
    )

    println("nome: ${gui.nome}")
    println("cpf: ${gui.cpf}")
    println("salario: ${gui.salario}")
    println("bonificaçao: ${gui.bonificacao}")
    println("plr: ${gui.plr}")

    if (gui.autentica(456)) {
        println("${gui.nome} - Autenticou com sucesso.")
    } else {
        println("${gui.nome} -Não autenticou")
    }

    val maria = Analista(
        "Maria",
        "444.444.444",
        3000.0
    )

    println("nome: ${maria.nome}")
    println("cpf: ${maria.cpf}")
    println("salario: ${maria.salario}")
    println("bonificaçao: ${maria.bonificacao}")

    val calculadoraBonificacao = CalculadoraBonificacao()
    calculadoraBonificacao.registra(alex)
    calculadoraBonificacao.registra(fran)
    calculadoraBonificacao.registra(gui)
    calculadoraBonificacao.registra(maria)
    println("total de bonificação: ${calculadoraBonificacao.total}")
}