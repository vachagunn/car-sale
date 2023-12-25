package vachik.carsale.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import vachik.carsale.entity.Car;
import vachik.carsale.repository.CarRepository;

import java.util.*;

@Slf4j
@Controller
@RequestMapping("/catalog")
@RequiredArgsConstructor
public class CarController {
    private final CarRepository carRepository;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("cars", carRepository.findAll());
        return "catalog";
    }

    @GetMapping("/init")
    public String init() {
        Car car = new Car();
        car.setMake("alfa-romero");
        carRepository.save(car);

        return "/";
    }


//    @GetMapping("/")
//    public String index(Map<String, Object> model) {
//        Random random = new Random();
//        int count = random.nextInt(2, 6);
//
//        List<CarCard> cards = new ArrayList<>();
//
//        for (int i = 0; i < count; i++) {
//            cards.add(
//                    new CarCard(i + 1, "Mercedes-Benz", "GL", "black", 2014, 220000, 3200000)
//            );
//        }
//
//        System.out.println(cards);
//        model.put("cards", cards);
//        return "catalog";
//    }

    @PostMapping("/cards")
    public String cards(@RequestBody MultiValueMap<String, String> formData) {
        log.info("Кол-во карточек {}, пришли карточки {}", formData.size(), formData);
        return "catalog";
    }
}
