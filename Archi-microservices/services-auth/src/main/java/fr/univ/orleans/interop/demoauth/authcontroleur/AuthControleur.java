package fr.univ.orleans.interop.demoauth.authcontroleur;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class AuthControleur {

    @PostMapping(value = "/login")
    public ResponseEntity connexion(
            @RequestParam(required = true) String login,
            @RequestParam(required = true) String password){
        if (login.equals(password)){
            // ok genérer un token encrypté
            String token=login.toUpperCase();
            return ResponseEntity.ok().header(HttpHeaders.AUTHORIZATION,"Bearer"+token).build();
        }

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }
}
