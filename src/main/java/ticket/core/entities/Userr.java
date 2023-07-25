package ticket.core.entities;





import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;




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