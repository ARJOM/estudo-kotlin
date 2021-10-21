package estacionamento

class Estacionamento(
    var veiculos: MutableList<Veiculo> = mutableListOf<Veiculo>()
) {

    fun add(veiculo: Veiculo){
        veiculos.add(veiculo)
    }

    fun remove(veiculo: Veiculo) {
        veiculos.remove(veiculo)
    }

    fun exibir(){
        for (veiculo : Veiculo in veiculos){
            veiculo.ligar()
        }
    }

}