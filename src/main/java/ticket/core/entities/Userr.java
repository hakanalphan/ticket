package ticket.core.entities;





import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.Collection;


@Entity // Biizm için veritabanı nesnesidir
@Data
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Userr {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private int id;

  @Column(name = "email")
  @Email
  @NonNull
  @NotBlank
  private String email;

  @Column(name = "password")
  @NonNull
  @NotBlank
  private String password;
  private boolean enabled;
  @Column(name = "username")
  private String username;
  @ManyToMany(fetch = FetchType.EAGER)
  @JoinTable(joinColumns = @JoinColumn(name = "user_id"),
          inverseJoinColumns = @JoinColumn(name = "role_id"))

  private Collection<Role> roles;

}