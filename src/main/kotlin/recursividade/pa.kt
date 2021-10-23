package recursividade

fun enesimo_pa(termoInicial: Int, razao: Int, n: Int): Int{
    if (n == 0){
        return termoInicial
    }
    return razao + enesimo_pa(termoInicial, razao, n-1)
}

fun main(){
    print(enesimo_pa(0, 3, 1))
}