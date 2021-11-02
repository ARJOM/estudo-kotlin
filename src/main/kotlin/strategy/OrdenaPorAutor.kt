package strategy

class OrdenaPorAutor : EstrategiaOrdenacao {
    override fun ordenaLivros(livros: MutableList<Livro>) {
        livros.sortBy { livro -> livro.autor.toLowerCase().split(" ")[1] }
        for (livro: Livro in livros){
            println(livro.titulo)
        }
    }
}