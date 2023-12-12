package org.lesson.java;

import java.time.LocalDate;
import java.util.ArrayList;

public class GroupTravel extends Vacation{
    // ATTRIBUTI
    private int partecipants;
    private int age;

    // COSTRUTTORI

    public GroupTravel(String destination, LocalDate dateStart, LocalDate dateFinish, ArrayList<Excursion> excursion, int partecipants, int age) {
        super(destination, dateStart, dateFinish, excursion);
        this.partecipants = partecipants;
        this.age = age;
    }


    // GETTER E SETTER

    public int getPartecipants() {
        return partecipants;
    }

    public void setPartecipants(int partecipants) {
        this.partecipants = partecipants;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    // METODI

    @Override
    public String toString() {
        return super.toString() + " numero partecipanti: " + partecipants + " fascia d'età: " + age;
    }
}
