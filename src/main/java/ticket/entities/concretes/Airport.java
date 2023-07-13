package ticket.entities.concretes;

import jakarta.persistence.*;
import lombok.*;

@Table(name="customers")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Airport {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int airportId;
    @Column(name="name")
    private String name;
    @Column(name="city")
    private String city;
    @Column(name="country")
    private String country;

}
