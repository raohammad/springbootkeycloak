package eu.nglab.sensors.web;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAccessTest {

    @GetMapping("/admin/hello")
    public String sayHelloToAdmin() {
        System.out.println("ADMIN ACCESS");
        return "Hello Admin";
    }

    @GetMapping("/user/hello")
    public String sayHelloToUser() {
        System.out.println("USER ACCESS ACCESS");
        return "Hello User";
    }

}