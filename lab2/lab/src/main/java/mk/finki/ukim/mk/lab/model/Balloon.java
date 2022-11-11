package mk.finki.ukim.mk.lab.model;

import lombok.Data;

@Data
public class Balloon {

    private Long id;
    public String name;
    public String description;
    public Manufacturer manufacturer;


    public Balloon(String name, String description, Manufacturer manufacturer) {
        this.id = (long)(Math.random() * 1000);
        this.name = name;
        this.description = description;
        this.manufacturer = manufacturer;
    }
}