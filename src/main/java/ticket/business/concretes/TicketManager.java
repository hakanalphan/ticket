package ticket.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ticket.business.abstracts.TicketService;
import ticket.core.utilities.results.DataResult;
import ticket.core.utilities.results.Result;
import ticket.core.utilities.results.SuccessDataResult;
import ticket.core.utilities.results.SuccessResult;
import ticket.dataaccess.abstracts.TicketRepository;
import ticket.entities.concretes.Ticket;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;


@Service
public class TicketManager implements TicketService {

    private final TicketRepository ticketRepository;



    @Autowired
    public TicketManager(TicketRepository ticketRepository) {

        this.ticketRepository = ticketRepository;
    }

    @Override
    public Result  addTicket(Ticket ticket) {


        ticketRepository.save(ticket);
        return new SuccessResult("customer aded");




    }

    @Override
    public DataResult<Ticket> updateTicket(Ticket ticket) {



        return new SuccessDataResult<>(ticketRepository.save(ticket),"ticket updated");
    }

    @Override
    public DataResult<Ticket> deleteTicket(Ticket ticketId) {


        Ticket    ticket1 = ticketRepository.delete(id);
        return new SuccessDataResult<>(ticket1,"");
    }

    @Override
    public DataResult<List<Ticket>> getAllTickets() {
        return new SuccessDataResult<List<Ticket>>(ticketRepository.findAll(),"flight retrieved"
        );
    }


    @Override
    public DataResult<Ticket> getTicketById(Long id) {

        Ticket ticket = ticketRepository.getTicketById(id).getData();

                return new SuccessDataResult<>(ticket, "ticket found.");
            }
        }














