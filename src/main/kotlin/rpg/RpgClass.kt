package rpg

//Classe para praticar OO com kotlin

class RpgClass(
    var nome: String,
    var pvInicial: Int,
    var pm: Int,
    var pvPorNivel: Int
) {

    fun calculaPV(nivel: Int, modificadorConstituicao: Int): Int{
        val pvsExtra = modificadorConstituicao * nivel
        return pvInicial + (nivel-1) * pvPorNivel + pvsExtra
    }

    fun calculaPM(nivel: Int): Int{
        return nivel * pm
    }

}