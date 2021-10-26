package command

fun main(){
    val personagem1 = Personagem(10, 2)
    val personagem2 = Personagem(12, 1)
    val invocador = Invocador()
    val p1AtacaP2Comando = ComandoAtaqueEspecial(personagem2, personagem1)
    val p2AtacaP1Comando = ComandoAtaqueEspecial(personagem1, personagem2)
    invocador.adiciona_comando(p1AtacaP2Comando)
    invocador.adiciona_comando(p1AtacaP2Comando)
    invocador.adiciona_comando(p1AtacaP2Comando)
    invocador.adiciona_comando(p2AtacaP1Comando)
    invocador.adiciona_comando(p2AtacaP1Comando)
    invocador.adiciona_comando(p2AtacaP1Comando)

    invocador.ativar()

    println("Personagem 1: ${personagem1.pv} pontos de vida")
    println("Personagem 2: ${personagem2.pv} pontos de vida")
}