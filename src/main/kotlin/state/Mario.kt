package state

class Mario(private var estadoAtual: MarioState = MarioPequeno()) {

    fun levarDano(){
        estadoAtual = estadoAtual.levarDano()
    }

    fun pegarCogumelo(){
        estadoAtual = estadoAtual.pegarCogumelo()
    }

    fun pegarFlor(){
        estadoAtual = estadoAtual.pegarFlor()
    }

    fun pegarPena(){
        estadoAtual = estadoAtual.pegarPena()
    }

}