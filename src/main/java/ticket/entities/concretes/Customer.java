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
public class Customer {

     @Id
     @GeneratedValue(strategy= GenerationType.IDENTITY)
     @Column(name="id")
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="surname")
    private String surname;

    @Column(name="email")
    private String email;
    @Column(name="number")
    private String phoneNumber;

}
