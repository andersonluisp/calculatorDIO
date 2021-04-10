/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

/* Operações disponíveis:
 * 1 - Soma
 * 2 - Subtração - n1 - n2
 * 3 - Multiplicação
 * 4 - Divisão
 */

const val OPERADOR = 3 //Variável corresponde à operação

fun main() {
	var a:Float? = 4f
    var b:Float? = 0f
    
    //Verifica se os valores digitados são nulos
    if(a == null || b == null){
        println("O valor não pode ser null")
    }
    else{
    var n1 = a ?: 0f  //Converte primeiro número de Float? para Float
    var n2 = b ?: 0f  //Converte segundo número de Float? para Float
        
    calculate(n1,n2,OPERADOR)
    }
}

fun calculate(n1:Float, n2:Float, operation:Int):Float{
    var result:Float = 0f
    
    //Verifica se é uma divisão e se o denominador é 0
    if ((n2 == 0f) and (operation == 4)){
        println("ERRO\nUm número não pode ser divisível por 0")
    }
    else{
        when{
            operation == 1 -> {
                result = n1 + n2
                println("O resultado de $n1 + $n2 é igual a $result")
            }
            operation == 2 -> {
                result = n1 - n2
                println("O resultado de $n1 - $n2 é igual a $result")
            }
            operation == 3 -> {
                result = n1 * n2
                println("o resultado de $n1 x $n2 é igual a $result")        
            }
            operation == 4 -> {
                result = n1 / n2
                println("O resultado de $n1 / $n2 é igual a $result")
            }
        }
    }
    return result
    
}


 

