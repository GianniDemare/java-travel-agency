package org.lesson.java;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;

public class Vacation {
    // ATTRIBUTI
    private String destination;
    private LocalDate dateStart;
    private LocalDate dateFinish;
    private ArrayList<Excursion> excursion;


    // COSTRUTTORE DI DEFAULT
    public Vacation(){

    }

    // COSTRUTTORE PERSONALE

    public Vacation(String destination, LocalDate dateStart, LocalDate dateFinish) {
        setDestination(destination);
        setDateStart(dateStart);
        setDateFinish(dateFinish);
    }

    public Vacation(String destination, LocalDate dateStart, LocalDate dateFinish, ArrayList<Excursion> excursion) {
        setDestination(destination);
        setDateStart(dateStart);
        setDateFinish(dateFinish);
        this.excursion = excursion;
    }



    // GETTER E SETTER

    public String getDestination() {
        return destination;
    }


    public void setDestination(String destination) throws IllegalArgumentException{
        if (destination.isEmpty()){
            throw new IllegalArgumentException("Il valore non può essere nullo");
        }
        this.destination = destination;
    }


    public LocalDate getDateStart() {
        return dateStart;
    }

    public void setDateStart(LocalDate dateStart) throws IllegalArgumentException{
        if (dateStart == null){
            throw new IllegalArgumentException("Il valore inserito nomn è valido");
        } else if (dateStart.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("La data inserita non è valida");
        }
        this.dateStart = dateStart;
    }

    public LocalDate getDateFinish() {
        return dateFinish;
    }

    public void setDateFinish(LocalDate dateFinish) throws IllegalArgumentException{
        if (dateFinish == null){
            throw new IllegalArgumentException("Il valore inserito non è valido");
        } else if (dateFinish.isBefore(dateStart)) {
            throw new IllegalArgumentException("La data inserita non è valida");

        }
        this.dateFinish = dateFinish;
    }

    public ArrayList<Excursion> getExcursion() {
        return excursion;
    }

    public void setExcursion(ArrayList<Excursion> excursion) {
        this.excursion = excursion;
    }

    // METODI
    public void addExcursion(Excursion e){
        this.excursion.add(e);
    }


    // METODO PER CALCOLARE LA DURATA DI GIORNI DELLA VACANZA
    public int calculateDays(){
        long daysBetween = Duration.between(dateStart.atStartOfDay(), dateFinish.atStartOfDay()).toDays();
        return (int) daysBetween;
    }

    // METODO PER CALCOLARE LA SOMMA DELLE ESCURSIONI
    public BigDecimal calculateTotalPrice() {
        BigDecimal total = BigDecimal.valueOf(0);
        for (Excursion element : excursion) {
            total = total.add(element.getPrice());
        }
        return total;
    }

    // STAMPA VACANZA
    public String toString(){
        return "Hai prenotato una vacanza di " + calculateDays() + " giorni a " + destination + " dal " + dateStart + " al "+ dateFinish + " con aggiunta di escursioni al prezzo di: " + calculateTotalPrice() +"€";
    }




}
