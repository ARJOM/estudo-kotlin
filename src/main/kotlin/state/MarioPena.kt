package state

class MarioPena : MarioState {

    override fun levarDano(): MarioState {
        println("Mario grande")
        return MarioGrande()
    }

    override fun pegarCogumelo(): MarioState {
        println("Mario continua grande e com capa")
        return this
    }

    override fun pegarFlor(): MarioState {
        println("Mario grande com fogo")
        return MarioFogo()
    }

    override fun pegarPena(): MarioState {
        println("Mario continua grande e com capa")
        return this
    }

}