package tesouro

fun main(){
    val tabuleiro = Tabuleiro()
    while(true){
        tabuleiro.mostrar()
        tabuleiro.mover_jogador(1, "cima")
        tabuleiro.mover_jogador(2, "baixo")
    }

}