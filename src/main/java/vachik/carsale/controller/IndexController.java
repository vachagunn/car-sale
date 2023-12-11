package vachik.carsale.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;
import java.util.Objects;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(Map<String, Object> model) {
        model.put("key1", 15);
        model.put("key2", 200);
        model.put("key3", "Строка");

        return "index";
    }
}
