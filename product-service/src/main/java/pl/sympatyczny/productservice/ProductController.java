package pl.sympatyczny.productservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Value("${eureka.instance.instance-id}")
    String instanceId;
    @GetMapping
    public String get(){
        return "Product Service " + instanceId;
    }

}
