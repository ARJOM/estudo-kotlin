package strategy

class OrdenaPorAno : EstrategiaOrdenacao {
    override fun ordenaLivros(livros: MutableList<Livro>) {
        livros.sortBy { livro -> livro.publicacao }
        for(livro: Livro in livros){
            println(livro.titulo)
        }
    }
}