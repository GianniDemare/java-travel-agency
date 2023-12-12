package org.lesson.java;

import java.time.LocalDate;
import java.util.ArrayList;

public class TravelOfWedding extends Vacation {
    // ATTRIBUTI
    private ArrayList<String> trattamentiAggiuntivi;

    // COSTRUTTORI

    public TravelOfWedding(){

    }

    public TravelOfWedding(String destination, LocalDate dateStart, LocalDate dateFinish, ArrayList<Excursion> excursion, ArrayList<String> trattamentiAggiuntivi) {
        super(destination, dateStart, dateFinish, excursion);
        this.trattamentiAggiuntivi = trattamentiAggiuntivi;
    }

    // GETTER E SETTER

    public ArrayList<String> getTrattamentiAggiuntivi() {
        return trattamentiAggiuntivi;
    }

    public void setTrattamentiAggiuntivi(ArrayList<String> trattamentiAggiuntivi) {
        this.trattamentiAggiuntivi = trattamentiAggiuntivi;
    }

    // METODI

    public void addTrattamento(String s){
        this.trattamentiAggiuntivi.add(s);

    }

    @Override
    public String toString() {
        return super.toString() + " inoltre hai anche questi trattamenti: " + trattamentiAggiuntivi;
    }
}


