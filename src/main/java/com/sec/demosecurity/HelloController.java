package com.sec.demosecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/public")
    public String publicEndpoint() {
        return "Ceci est un endpoint PUBLIC. Pas besoin d'être connecté.";
    }

    @GetMapping("/user/home")
    public String userHome() {
        return "Bienvenue USER ! Vous êtes authentifié.";
    }

    @GetMapping("/admin/dashboard")
    public String adminDashboard() {
        return "Bienvenue ADMIN !";
    }
}


