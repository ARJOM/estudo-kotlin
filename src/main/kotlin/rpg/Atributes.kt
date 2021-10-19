package rpg

class Atributes(
    var forca: Int,
    var destreza: Int,
    var constituicao: Int,
    var inteligencia: Int,
    var sabedoria: Int,
    var carisma: Int,
){

    private fun getModificador(valor: Int): Int{
        val diferenca = valor - 10
        return if (diferenca >= 0){
            diferenca/2
        } else {
            (diferenca-1)/2
        }
    }

    fun getModificadorDeForca(): Int{
        return getModificador(forca)
    }
    fun getModificadorDeDestreza(): Int{
        return getModificador(destreza)
    }
    fun getModificadorDeConstituicao(): Int{
        return getModificador(constituicao)
    }
    fun getModificadorDeInteligencia(): Int{
        return getModificador(inteligencia)
    }
    fun getModificadorDeSabedoria(): Int{
        return getModificador(sabedoria)
    }
    fun getModificadorDeCarisma(): Int{
        return getModificador(carisma)
    }
}
