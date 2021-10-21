package estacionamento

fun main(){
    val estacionamento = Estacionamento()
    val palio = Carro("A3C3SA2")
    val harley = Moto("ELBRABO")
    estacionamento.add(palio)
    estacionamento.add(harley)
    estacionamento.exibir()

}