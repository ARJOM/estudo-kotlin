package recursividade

fun soma_entre_dois_numeros(numero1: Int, numero2: Int):Int {
    if (numero1 == numero2) {
        return numero1
    }
    return numero1 + soma_entre_dois_numeros(numero1+1, numero2)
}


fun main(){
    println(soma_entre_dois_numeros(1, 100))
}