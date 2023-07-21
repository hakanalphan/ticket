package ticket.entities.concretes;


import lombok.*;

import javax.persistence.*;

@Table(name="airports")
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
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="city")
    private String city;
    @Column(name="country")
    private String country;

}
