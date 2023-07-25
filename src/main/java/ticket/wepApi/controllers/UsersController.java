package ticket.wepApi.controllers;


import ch.qos.logback.core.model.Model;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ticket.business.abstracts.UserService;
import ticket.core.entities.Userr;
import ticket.core.utilities.results.DataResult;
import ticket.core.utilities.results.Result;
import ticket.core.utilities.results.SuccessDataResult;
import ticket.core.utilities.results.SuccessResult;

import java.util.List;


@RestController
@RequestMapping(value="/api/users")
public class UsersController {

    private UserService userService;


    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }
    @RequestMapping(value="/register" ,method= RequestMethod.GET)
    public String registerPage(Model model){
        model.addText("user");
        return "register";
    }

    @RequestMapping(value="/register" ,method= RequestMethod.POST)
    public String saveRegisterPage(@Valid @ModelAttribute("user") Userr user, BindingResult result, Model model){
        model.addText("user");

        if (result.hasErrors()){
            return "register";
        } else {
            userService.add(user);

        }
        return "index";
    }
    @PostMapping(value = "/add")
    public Result add (@RequestBody Userr userr){
        return

                new SuccessDataResult(this.userService.add(userr),"user added");

    }

    @GetMapping("/{userId}")
    public DataResult<Userr> getUserById(@PathVariable Long userId) {
        Userr user = userService.getById(userId).getData();
        return new SuccessDataResult<>(user, "User retrieved");
    }

    @PutMapping("/{userId}")
    public Result updateUser(@PathVariable Long userId, @RequestBody Userr user) {
        userService.update(user);
        return new SuccessResult("User updated successfully");
    }

    @DeleteMapping("/{userId}")
    public Result deleteUser(@PathVariable Long userId) {
        userService.delete(userId);
        return new SuccessResult("User deleted successfully");
    }

    @GetMapping("/all")
    public DataResult<List<Userr>> getAllUsers() {
        List<Userr> users = userService.getAll().getData();
        return new SuccessDataResult<>(users, "All users retrieved");
    }
}
