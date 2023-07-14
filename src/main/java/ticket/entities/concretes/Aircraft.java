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
public class Aircraft {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="aircraft_id")
    private int aircraftId;

    @Column(name="name")
    private String name;
    @Column(name="capacity")
    private int capacity;
}
