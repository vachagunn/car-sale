package vachik.carsale.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="car-price")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    private long symbolic;
    private String make;
//    private String brand;
//    private String model;
//    private String color;
//    private int year;
//    private long price;
//    private long mileage;2
}
