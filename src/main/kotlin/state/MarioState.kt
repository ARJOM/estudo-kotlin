package state

interface MarioState {

    fun levarDano(): MarioState
    fun pegarCogumelo(): MarioState
    fun pegarFlor(): MarioState
    fun pegarPena(): MarioState

}