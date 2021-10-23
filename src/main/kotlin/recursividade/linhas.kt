package recursividade

fun salto(numeroLinhas: Int) {
    if (numeroLinhas >= 0){
        println()
        salto(numeroLinhas-1)
    }
}

fun main(){
    print("Opa")
    salto(3)
    print("E aí")
}