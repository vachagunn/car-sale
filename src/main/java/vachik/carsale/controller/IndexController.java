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
        model.put("key1", 15);
        model.put("key2", 200);
        model.put("key3", "Строка");

        return "index";
    }

    @PostMapping(value = "/check")
    public String check(String answer) {
        log.info("{}", answer);
        return "index";
    }
}
