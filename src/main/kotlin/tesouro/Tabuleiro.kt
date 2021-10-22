package tesouro

class Tabuleiro (
    val tabs: Array<IntArray> = Array(10){ IntArray(10) {0} },
    var pos_x_1: Int = 0,
    var pos_y_1: Int = 0,
    var pos_x_2: Int = 9,
    var pos_y_2: Int = 9,
) {

    init {
        val x = (0..9).random()
        val y = (0..9).random()
        tabs[x][y] = 1
    }

    fun mostrar(){
        for (i in (0..9)){
            for (j in (0..9)){
                if ((pos_x_1==i) and (pos_y_1==j)){
                    print("J1 ")
                } else if ((pos_x_2==i) and (pos_y_2==j)){
                    print("J2 ")
                } else {
                    val value = tabs[i][j]
                    print("$value  ")
                }
            }
            println()
        }
    }

    fun mover_jogador(jogador: Int, opcao: String){
        if (jogador == 1){
            if (opcao == "cima"){
                pos_y_1 += 1
            } else if (opcao == "baixo"){
                pos_y_1 -= 1
            } else if (opcao == "direita"){
                pos_x_1 += 1
            } else if (opcao == "esquerda") {
                pos_x_1 -= 1
            } else {
                print("opcao invalida")
            }

        } else if (jogador == 2){
            if (opcao == "cima"){
                pos_y_2 += 1
            } else if (opcao == "baixo"){
                pos_y_2 -= 1
            } else if (opcao == "direita"){
                pos_x_2 += 1
            } else if (opcao == "esquerda") {
                pos_x_2 -= 1
            } else {
                print("opcao invalida")
            }
        } else {
            println("Jogador inválido")
        }
        verifica_vencedor()
    }

    fun verifica_vencedor(){
        if (tabs[pos_x_1][pos_y_1]==1){
            print("Jogador 1 ganhou")
        } else if (tabs[pos_x_2][pos_y_2] == 1){
            print("Jogador 2 ganhou")
        } else {
            println("Proxima rodada")
        }
    }

}