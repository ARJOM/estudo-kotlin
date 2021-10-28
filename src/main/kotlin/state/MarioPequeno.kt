package state

import kotlin.system.exitProcess

class MarioPequeno : MarioState {

    override fun levarDano(): MarioState {
        println("Mario morto")
        exitProcess(0)
    }

    override fun pegarCogumelo(): MarioState {
        println("Mario grande")
        return MarioGrande()
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