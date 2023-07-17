package ticket.entities.concretes;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "flights")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "aircraft")
    private Aircraft aircraft;

    @ManyToOne
    @JoinColumn(name = "departure_airport_id")
    private Airport departureAirport;

    @ManyToOne
    @JoinColumn(name = "arrival_airport_id")
    private Airport arrivalAirport;

    @Column
    private LocalDateTime departureTime;

    @Column
    private LocalDateTime arrivalTime;
}
