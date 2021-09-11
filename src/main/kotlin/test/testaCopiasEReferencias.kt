import model.ContaCorrente

fun testaCopiasEReferencias() {
    val num1 = 10
    var num2 = num1 // recebe uma cópia do valor do num1
    num2++ //incrementa essa cópia recebido

    println("num1: $num1")
    println("num2: $num2")

    val contaLucas = ContaCorrente("Lucas",1002)
    contaLucas.titular = "Lucas"

    val conta3 = ContaCorrente("Maria", 1003)//aponta para um objeto em memória.
    //conta3.titular = "Maria"//atribui um nome para o titular da variável de referencia conta3
    var conta4 = conta3 //a variável conta4 aponta para a mesma referencia/objeto da conta3
    conta4.titular =
        "Fredo"//modifica o valor do titular da vraiável conta3. de Maria passa a ser Fredo. Altera o mesmo objeto.

    println("conta3: ${conta3.titular}")
    println("conta4: ${conta4.titular}")

}