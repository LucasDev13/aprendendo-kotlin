fun main() {
    print("Bem vindo ao bytebank: ")

    val alex = Funcionario(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("nome: ${alex.nome}")
    println("cpf: ${alex.cpf}")
    println("salario: ${alex.salario}")
    println("bonificaçao: ${alex.bonificacao()}")

    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 123456
    )

    println("nome: ${fran.nome}")
    println("cpf: ${fran.cpf}")
    println("salario: ${fran.salario}")
    println("bonificaçao: ${fran.bonificacao()}")

    if (fran.autentica(123456)){
        println("Autenticou com sucesso.")
    }else{
        println("Não autenticou")
    }
}
