package ticket.entities.concretes;



import jakarta.persistence.*;
import lombok.*;



@Entity
@Table(name = "tickets")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "flightid")
    private Flight flight;

    @ManyToOne
    @JoinColumn(name = "customerid")
    private Customer customer;



}
