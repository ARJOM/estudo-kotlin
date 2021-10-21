package estacionamento

open class Veiculo (
    open var placa: String,
){

    open fun ligar(){
        println("Ligando veículo")
    }
}

class Moto(
    override var placa: String
) : Veiculo(placa) {

    override fun ligar() {
        println("Ligando moto de placa $placa")
    }

}

class Carro(
    override var placa: String
) : Veiculo(placa) {

    override fun ligar() {
        println("Ligando carro de placa $placa")
    }
}