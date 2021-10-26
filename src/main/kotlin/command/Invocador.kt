package command

class Invocador(val listaDeComandos: MutableList<Comando> = mutableListOf<Comando>()) {

    fun adiciona_comando(comando: Comando){
        listaDeComandos.add(comando)
    }

    fun remove_comando(comando: Comando){
        listaDeComandos.remove(comando)
    }

    fun ativar(){
        for (comando: Comando in listaDeComandos){
            comando.executar()
        }
    }
}