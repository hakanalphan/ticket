package ticket.entities.concretes;



import lombok.*;

import javax.persistence.*;

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
