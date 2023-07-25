package ticket.business.abstracts;

import org.springframework.security.core.userdetails.UserDetails;

public interface SSUserDetailsService {

   UserDetails loadUserByUsername(String email);
}
