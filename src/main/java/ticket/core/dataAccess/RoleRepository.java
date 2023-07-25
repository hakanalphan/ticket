package ticket.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import ticket.core.entities.Role;

public interface RoleRepository extends JpaRepository<Role,Long> {

    Role findByRole(String role);
}
