package state

class MarioFogo : MarioState {

    override fun levarDano(): MarioState {
        println("Mario grande")
        return MarioGrande()
    }

    override fun pegarCogumelo(): MarioState {
        println("Mario continua grande e coom fogo")
        return this
    }

    override fun pegarFlor(): MarioState {
        println("Mario continua grande e coom fogo")
        return this
    }

    override fun pegarPena(): MarioState {
        println("Mario grande com capa")
        return MarioPena()
    }

}