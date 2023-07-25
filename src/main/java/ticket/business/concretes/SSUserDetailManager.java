package ticket.business.concretes;

import jakarta.transaction.Transactional;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ticket.business.abstracts.SSUserDetailsService;
import ticket.core.dataAccess.UserRepository;
import ticket.core.entities.Role;
import ticket.core.entities.Userr;

import java.util.HashSet;
import java.util.Set;

@Transactional
@Service
public class SSUserDetailManager implements SSUserDetailsService {

    private UserRepository userRepository;

    public SSUserDetailManager(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        try {
            Userr user = userRepository.findByEmail(email);
            if (user == null) {
                return null;
            }
            return new org.springframework.security.core.userdetails.User(
                    user.getUsername(),
                    user.getPassword(),
                    getAuthorities(user));

        } catch (Exception e) {
            throw new UsernameNotFoundException("User not found");
        }
    }

    private Set<GrantedAuthority> getAuthorities(Userr user) {
        Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
        for (Role role : user.getRoles()) {
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(role.getRole());
            authorities.add(grantedAuthority);
        }
        return authorities;

    }
}
