package ticket.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import ticket.business.abstracts.UserService;
import ticket.core.dataAccess.RoleRepository;
import ticket.core.dataAccess.UserRepository;
import ticket.core.entities.Userr;
import ticket.core.utilities.results.DataResult;
import ticket.core.utilities.results.Result;
import ticket.core.utilities.results.SuccessDataResult;
import ticket.core.utilities.results.SuccessResult;

import java.util.Arrays;
import java.util.List;


@Service
public class UserManager implements UserService {


    private UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;


    @Autowired
    public UserManager(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }




    @Override
    public Result add(Userr userr) {
        this.userRepository.save(userr);
        return new SuccessResult("User added");
    }

    @Override
    public DataResult<Userr> findByEmail(String email) {
        return new SuccessDataResult<Userr>(this.userRepository.findByEmail(email),"user found");
    }

    @Override
    public DataResult<Userr> findByUsername(String username) {
        return new SuccessDataResult<>(userRepository.findByUsername(username));
    }

    @Override
    public Result update(Userr user) {
        userRepository.save(user);

        return  new SuccessResult("User uptated") ;
    }

    @Override
    public DataResult<Userr> getById(Long userId) {
        Userr user = userRepository.findById(userId).orElse(null);

           return new SuccessDataResult<>(user, "User retrieved");
    }

    @Override
    public DataResult<List<Userr>> getAll() {
       List<Userr> users = userRepository.findAll();
        return new SuccessDataResult<>(users, "All users retrieved");
    }

    @Override
    public Result delete(Long userId) {
        userRepository.deleteById(userId);

        return new SuccessResult("User deleted");
    }

    public void saveUser(Userr user) {
        user.setRoles(Arrays.asList(roleRepository.findByRole("USER")));
        user.setEnabled(true);
        userRepository.save(user);
    }
}
