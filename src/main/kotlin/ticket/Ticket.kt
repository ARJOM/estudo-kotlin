package ticket

import java.time.LocalDateTime


class Ticket(var usuario: String, var titulo: String, var mensagem: String, private val id: Int, val data: LocalDateTime) {

    fun formatado(): String{
        return "Ticket #$id - $titulo \n " +
                "$mensagem \n " +
                "$usuario - ${this.formataData()}"
    }

    private fun formataData(): String{
        return "${data.dayOfMonth}/${data.monthValue}/${data.year} ${data.hour}:${data.minute}"
    }
}