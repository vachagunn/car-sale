package vachik.carsale.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Slf4j
@Controller
public class IndexController {
    @GetMapping("/")
    public String index(Map<String, Object> model) {
        return "index";
    }
}
