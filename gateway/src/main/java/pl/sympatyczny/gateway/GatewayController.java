package pl.sympatyczny.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayController {

    @GetMapping
    public String get(){
        return "Gateway";
    }

}
