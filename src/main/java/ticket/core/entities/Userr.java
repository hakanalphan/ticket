package ticket.core.entities;





import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hibernate.validator.constraints.NotBlank;




@Entity // Biizm için veritabanı nesnesidir
@Data
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
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
}