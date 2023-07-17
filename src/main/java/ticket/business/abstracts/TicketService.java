package ticket.business.abstracts;

import ticket.core.utilities.results.DataResult;
import ticket.core.utilities.results.Result;
import ticket.entities.concretes.Ticket;

import java.util.List;

public interface TicketService {

    Result addTicket(Ticket ticket);
    DataResult<Ticket> updateTicket(Ticket ticket);

    DataResult<Ticket> deleteTicket(Ticket ticketId);
    DataResult<List<Ticket>> getAllTickets();
    DataResult<Ticket>getTicketById(Long id);


}
