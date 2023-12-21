package vachik.carsale.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import vachik.carsale.entity.CarCard;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Slf4j
@Controller
@RequestMapping("/catalog")
public class CatalogController {
    @GetMapping("/")
    public String index(Map<String, Object> model) {
        Random random = new Random();
        int count = random.nextInt(2, 6);

        List<CarCard> cards = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            cards.add(
                    new CarCard(i + 1, "Mercedes-Benz", "GL", "black", 2014, 220000, 3200000)
            );
        }

        System.out.println(cards);
        model.put("cards", cards);

        return "catalog";
    }

    @PostMapping("/cards")
    public String cards(@RequestBody MultiValueMap<String, String> formData) {
        log.info("Пришли карточки {}", formData);
        return "catalog";
    }
}
