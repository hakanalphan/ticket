package ticket.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import ticket.entities.concretes.Airport;
import ticket.entities.concretes.Ticket;

public interface TicketRepository extends JpaRepository<Ticket,Integer > {
}
