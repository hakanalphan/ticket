package ticket.business.abstracts;


import ticket.core.entities.Userr;
import ticket.core.utilities.results.DataResult;
import ticket.core.utilities.results.Result;

import java.util.List;

public interface UserService {

    Result add(Userr userr);
    DataResult<Userr> findByEmail(String email);

   Result update(Userr user);

    DataResult<Userr> getById(Long userId);

    DataResult<List<Userr>> getAll();

    Result delete(Long userId);
}
