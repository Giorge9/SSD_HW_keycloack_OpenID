package com.h5;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GUIController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    /*@GetMapping("/main")
    public String mainPage() {
        return "main"; // Nome del template Thymeleaf per la main.html
    }*/

    @GetMapping("/login")
    public String loginPage() {
        return "login"; // Nome del template Thymeleaf per la login.html
    }

    @GetMapping("/area_personale_pt")
    public String areaPersonalePTPage(Model model, @AuthenticationPrincipal OidcUser user) {
        model.addAttribute("email", user.getEmail());
        return "area_personale_pt"; // Nome del template Thymeleaf per la area_personale_pt.html
    }

    @GetMapping("/area_personale_cliente")
    public String areaPersonaleCustomerPage(Model model, @AuthenticationPrincipal OidcUser user) {
        model.addAttribute("email", user.getEmail());
        return "area_personale_cliente"; // Nome del template Thymeleaf per la area_personale_cliente.html
    }

    @GetMapping("/area_comune")
    public String adminAndUserPage(Model model, @AuthenticationPrincipal OidcUser user) {
        model.addAttribute("email", user.getEmail());
        return "area_comune"; // Nome del template Thymeleaf per la area_comune.html
    }

}