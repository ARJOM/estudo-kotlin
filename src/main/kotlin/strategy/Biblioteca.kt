package strategy

class Biblioteca (var livros: MutableList<Livro>, var estrategiaOrnecao: EstrategiaOrdenacao){

    fun ordena_livros(){
        if (livros.isNotEmpty()) {
            estrategiaOrnecao.ordenaLivros(livros)
        }
    }
}