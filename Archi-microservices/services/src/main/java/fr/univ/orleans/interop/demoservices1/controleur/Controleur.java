package fr.univ.orleans.interop.demoservices1.controleur;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controleur {

    @GetMapping("/")
    public String greeting(){
        return "Bonjour tous le monde du service1 !";
    }

    @GetMapping("/{name}")
    public String greeting(@PathVariable String name){
        return "Bonjour de service1 à "+name;
    }



}
