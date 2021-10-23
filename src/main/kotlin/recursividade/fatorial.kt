package recursividade

fun fatorial(numero: Int): Int{
    if (numero == 0){
        return 1
    }
    return numero * fatorial(numero-1)
}

fun main(){
    println(fatorial(10))
}