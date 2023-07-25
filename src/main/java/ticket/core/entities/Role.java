package ticket.core.entities;

import jakarta.persistence.*;
import lombok.*;

import javax.persistence.GenerationType;
import java.util.Collection;

import static javax.persistence.GenerationType.IDENTITY;

@Table(name = "roles")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private long id;
    @Column(unique = true)
    private String role;
    @ManyToMany(mappedBy = "roles", fetch = FetchType.LAZY)
    private Collection<Userr> users;
}
