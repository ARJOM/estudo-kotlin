package command

class ComandoAtaqueEspecial(val alvo: Personagem, val origem: Personagem    ) : Comando {

    override fun executar() {
        alvo.pv -= origem.forca*2
    }


}