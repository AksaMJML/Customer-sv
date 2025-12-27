package edu.icet.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping("/get-name")
    public String getName(){
        return "Aksa";
    }

    @GetMapping("/get-age")
    public int getAge(){
        return 28;
    }
}
