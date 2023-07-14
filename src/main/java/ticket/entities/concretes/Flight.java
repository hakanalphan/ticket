package ticket.entities.concretes;

import jakarta.persistence.*;


@Entity
    public class Flight {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        private Airport departureAirport;

        @ManyToOne
        private Airport arrivalAirport;

        @ManyToOne
        private Aircraft aircraft;
}
