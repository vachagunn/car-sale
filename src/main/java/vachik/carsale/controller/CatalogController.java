package vachik.carsale.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Slf4j
@Controller
@RequestMapping("/catalog")
public class CatalogController {
    @GetMapping("/")
    public String index(Map<String, Object> model) {
        return "catalog";
    }
}
