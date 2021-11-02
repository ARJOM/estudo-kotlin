package strategy

fun main(){
    val livro1 = Livro("1DBA45E9", "Yellow Tanabe", 2006, "Kekkaishi: Volume 1")
    val livro2 = Livro("5DSA4F5SD", "Jefferson Ferreira", 2021, "Rei de Lata: Volume 1")
    val livro3 = Livro("8ZXCV8E4F", "Rick Riordan", 2020, "As Provações de Apolo: A Torre de Nero")

    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3)

//    val estrategiaOrdenecao = OrdenaPorAno()
    val estrategiaOrdenecao = OrdenaPorAutor()


    val biblioteca = Biblioteca(livros, estrategiaOrdenecao)
    biblioteca.ordena_livros()
}