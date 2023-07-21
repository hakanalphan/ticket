package ticket.dataaccess.abstracts;



import jakarta.persistence.metamodel.SingularAttribute;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ticket.core.utilities.results.DataResult;
import ticket.entities.concretes.Ticket;

import java.io.Serializable;


@Repository
public interface TicketRepository extends JpaRepository<Ticket,Long > {

    DataResult<Ticket>getTicketById(long id);

    DataResult<Ticket> findById(long id);


    Ticket delete(SingularAttribute<AbstractPersistable, Serializable> id);
}
