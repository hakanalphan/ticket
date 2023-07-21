package ticket.core.entities;





import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.Email;


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