package rpg

fun main(){
    val atributos = Atributes(16, 12, 14, 9, 14, 13)
    val guerreiro = RpgClass("Guerreiro", 20, 3, 4)
    val personagem = Character("Arthur", guerreiro, atributos, 3)
    println(personagem.ficha())
}