package rpg

class Character (
    var nome: String,
    var classe: RpgClass,
    var atributos: Atributes,
    var nivel: Int
){

    fun ficha(): String{
        return "Nome: $nome \n" +
                "Classe: ${classe.nome} $nivel \n" +
                "PV: ${classe.calculaPV(nivel, atributos.getModificadorDeConstituicao())} \n" +
                "PM: ${classe.calculaPM(nivel)} \n" +
                "Atributos: \n" +
                "Força: ${atributos.forca} | ${atributos.getModificadorDeForca()} \n" +
                "Destreza: ${atributos.destreza} | ${atributos.getModificadorDeDestreza()} \n" +
                "Constituição: ${atributos.constituicao} | ${atributos.getModificadorDeConstituicao()} \n" +
                "Inteligência: ${atributos.inteligencia} | ${atributos.getModificadorDeInteligencia()} \n" +
                "Sabedoria: ${atributos.sabedoria} | ${atributos.getModificadorDeSabedoria()} \n" +
                "Carisma: ${atributos.carisma} | ${atributos.getModificadorDeCarisma()} \n"
    }
}