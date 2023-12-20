package vachik.carsale.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Slf4j
@Controller
@RequestMapping("/application")
public class ApplicationController {
    @GetMapping("/")
    public String index(Map<String, Object> model) {
        return "application";
    }

    @PostMapping("/application")
    public String application(@RequestBody MultiValueMap<String, String> formData) {
        return "application";
    }
}
