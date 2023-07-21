package ticket.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import ticket.business.abstracts.UserService;
import ticket.core.dataAccess.UserRepository;
import ticket.core.entities.Userr;
import ticket.core.utilities.results.DataResult;
import ticket.core.utilities.results.Result;
import ticket.core.utilities.results.SuccessDataResult;
import ticket.core.utilities.results.SuccessResult;


@Service
public class UserManager implements UserService {


    private UserRepository userRepository;



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
}
