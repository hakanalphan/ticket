package ticket.wepApi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ticket.business.abstracts.TicketService;
import ticket.core.utilities.results.DataResult;
import ticket.core.utilities.results.Result;
import ticket.core.utilities.results.SuccessDataResult;
import ticket.entities.concretes.Ticket;

import java.util.List;




@RestController
@RequestMapping("/tickets")
public class TicketsController {


    private final TicketService ticketService;

    @Autowired
    public TicketsController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping
    public Result addTicket(@RequestBody Ticket ticket) {

      return new SuccessDataResult<>(ticketService.addTicket(ticket),"Tickets added");
    }

    @GetMapping("/{id}")
    public DataResult<Ticket> getTicketById(@PathVariable Long id) {
        Ticket tickets = ticketService.getTicketById(id).getData();
        return new SuccessDataResult<>(tickets,"Tickets retrieved");
    }

    @PutMapping("/{id}")
    public Result  updateTicket(@PathVariable Long id, @RequestBody Ticket ticket) {
        Ticket tickets = ticketService.getTicketById(id).getData();

       return new SuccessDataResult<>(tickets,"Tickets retrieved");
    }

    @DeleteMapping("/{id}")
    public Result deleteTicket(@PathVariable Long id) {
        Ticket ticket = ticketService.getTicketById(id).getData();

        return new SuccessDataResult<Ticket>(ticket,"");
    }

    @GetMapping
    public DataResult<List<Ticket>> getAllTickets() {
        List<Ticket> tickets = ticketService.getAllTickets().getData();
        return new SuccessDataResult<>(tickets,"Tickets retrieved");
    }
}
