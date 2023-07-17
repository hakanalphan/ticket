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
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;
    @Column(name="capacity")
    private int capacity;


}
