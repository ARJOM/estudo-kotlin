package recursividade

fun produto(x: Int, y: Int):Int{
    if (y == 1){
        return x
    }
    return x + produto(x, y-1)
}

fun main(){
    print(produto(-1, 2))
}