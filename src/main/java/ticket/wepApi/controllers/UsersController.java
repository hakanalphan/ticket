package ticket.wepApi.controllers;


import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.*;
import ticket.business.abstracts.UserService;
import ticket.core.entities.Userr;
import ticket.core.utilities.results.Result;
import ticket.core.utilities.results.SuccessDataResult;


@RestController
@RequestMapping(value="/api/users")
public class UsersController {

    private UserService userService;


    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/add")
    public Result add (@RequestBody Userr userr){
        return

                new SuccessDataResult(this.userService.add(userr),"user added");

    }



}
