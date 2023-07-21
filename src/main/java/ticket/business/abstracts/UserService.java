package ticket.business.abstracts;


import ticket.core.entities.Userr;
import ticket.core.utilities.results.DataResult;
import ticket.core.utilities.results.Result;

public interface UserService {

    Result add(Userr userr);
    DataResult<Userr> findByEmail(String email);
}
