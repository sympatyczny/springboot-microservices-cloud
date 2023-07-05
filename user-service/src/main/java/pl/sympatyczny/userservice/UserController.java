package pl.sympatyczny.userservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Value("${app.user}")
    private String appUser;

    @GetMapping
    public String get(){
        return "User Service; @" + appUser;
    }

}
