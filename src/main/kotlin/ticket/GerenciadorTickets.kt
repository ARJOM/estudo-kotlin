package ticket

class GerenciadorTickets(var ticketsAbertos: MutableList<Ticket> = mutableListOf(),
                         var ticketsFechados: MutableList<Ticket> = mutableListOf()) {

    fun abrirTicket(ticket: Ticket){
        ticketsFechados.remove(ticket)
        ticketsAbertos.add(ticket)
    }

    fun fecharTicket(ticket: Ticket){
        ticketsAbertos.remove(ticket)
        ticketsFechados.add(ticket)
    }

    private fun exibirTickets(ticketList: MutableList<Ticket>){
        for (ticket: Ticket in ticketList){
            println("-------------------------")
            println(ticket.formatado())
        }
        println("-------------------------")
    }

    fun exibirTicketsAbertos(){
        this.exibirTickets(ticketsAbertos)
    }

    fun exibirTicketsFechados(){
        this.exibirTickets(ticketsFechados)
    }
}