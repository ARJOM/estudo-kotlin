package state

class MarioGrande : MarioState {

    override fun levarDano(): MarioState {
        println("Mario pequeno")
        return MarioPequeno()
    }

    override fun pegarCogumelo(): MarioState {
        println("Mario continua grande")
        return this
    }

    override fun pegarFlor(): MarioState {
        println("Mario grande com fogo")
        return MarioFogo()
    }

    override fun pegarPena(): MarioState {
        println("Mario grande com capa")
        return MarioPena()
    }

}