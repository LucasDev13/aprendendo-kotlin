package br.com.alura.bytebank.model

class CalculadoraBonificacao {
    var total: Double = 0.0
    private set

    fun registra(funcionario: Any){
        //fazendo um cast de Any para Funcionario
//        val funcionarioNovo: Funcionario = funcionario as Funcionario
        //só esse trecho abaixo já é suficiente.No geral é trabalhado desta forma.
        //as -> faz o cast
        //is -> faz o cast e verifica se é igual os objetos
        //isso é chamado no kotlin de smart cast
        if(funcionario is Funcionario)
        this.total += funcionario.bonificacao;
    }

    fun registra(gerente: Gerente){
        this.total += gerente.bonificacao;
    }
    fun registra(diretor: Diretor){
        this.total += diretor.bonificacao;
    }
}