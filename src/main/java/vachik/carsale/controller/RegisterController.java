package vachik.carsale.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/register")
@RequiredArgsConstructor
public class RegisterController {
    @GetMapping
    public String registerForm() {
        return "register";
    }

    @PostMapping
    public String register() {
        return "redirect:/login";
    }
}
