package org.lesson.java;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Excursion extends Vacation{
    // ATTRIBUTI
    private String city;
    private long lasted;
    private BigDecimal price;

    // COSTRUTTORI
    public Excursion(){

    }

    public Excursion(String city, long lasted, BigDecimal price) {
        this.city = city;
        this.lasted = lasted;
        this.price = price;
    }

    // GETTER E SETTER

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getLasted() {
        return lasted;
    }

    public void setLasted(long lasted) {
        this.lasted = lasted;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    // METODI

}
