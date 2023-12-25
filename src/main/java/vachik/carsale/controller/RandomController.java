package vachik.carsale.controller;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import vachik.carsale.entity.RandomRequest;

import java.util.Random;
import java.util.stream.Collectors;

@Slf4j
@Controller
@RequestMapping("/random")
public class RandomController {
    @GetMapping("/random")
    public String random(@ModelAttribute @Valid RandomRequest request, Model model) {
        log.info("{}", request);
        if (request.getLen() == null) {
            request.setLen(10);
        }

        model.addAttribute(
                "random",
                new Random().ints(request.getLen(), request.getFrom(), request.getTo())
                        .boxed()
                        .collect(Collectors.toList())
        );
        model.addAttribute("request", request);
        return "random";
    }
}
