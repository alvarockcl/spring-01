package cl.fuentes.app;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Saludo {
    
    @RequestMapping("/")
    public String index() {
        return "Hola mundo!";
    }
    
}
