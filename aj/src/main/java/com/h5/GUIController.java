package com.h5;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

@Controller
public class GUIController {

    @GetMapping("/main")
    public String mainPage() {
        return "main"; // Nome del template Thymeleaf per la main.html
    }
 
    @GetMapping("/login")
    public String loginPage() {
        return "login"; // Nome del template Thymeleaf per la login.html
    }

    @GetMapping("/registrazione")
    public String SignUpPage() {
        return "registrazione"; // Nome del template Thymeleaf per la registrazione.html
    }

    @GetMapping("/area_personale_pt")
    public String areaPersonalePTPage() {
        return "area_personale_pt"; // Nome del template Thymeleaf per la area_personale_pt.html
    }
}
