package ticket

import java.time.LocalDateTime

fun main(){
    val gerenciador = GerenciadorTickets()
    val ticket1 = Ticket("Antônio Ricart", "Problemas de conexão",
        "Estou com diversos problemas de conexão no meu sistema de compras. Podem verificar por favor?",
        1, LocalDateTime.now())
    val ticket2 = Ticket("João Neto", "Envio de emails",
        "O envio de emails corporativos não tem funcionado durante todo o dia. Podem verificar o que há de errado?",
        2, LocalDateTime.now())
    gerenciador.abrirTicket(ticket1)
    gerenciador.abrirTicket(ticket2)
    gerenciador.exibirTicketsAbertos()
    gerenciador.fecharTicket(ticket1)
    gerenciador.exibirTicketsFechados()
}