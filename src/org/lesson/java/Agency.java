package org.lesson.java;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Agency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        boolean sentinella = false;
        while (!sentinella) {
            System.out.println("Vuoi inserire una nuova vacanza? (y/n)");
            String answer = scanner.nextLine();
            if (answer.equals("y")) {
                //INPUT TIPOLOGIA DI VIAGGIO
                System.out.println("Scegli il tipo di vacanza:");
                System.out.println("1. Vacanza generica");
                System.out.println("2. Viaggio di nozze");
                System.out.println("3. Viaggio di gruppo");
                int choice = scanner.nextInt();
                scanner.nextLine();
                Excursion excursion1 = new Excursion("Napoli", 10, new BigDecimal(100));
                Excursion excursion2 = new Excursion("Milano", 8, new BigDecimal(150));
                Excursion excursion3 = new Excursion("Roma", 5, new BigDecimal(250));
                switch (choice) {
                    case 1:
                        // INPUT DESTINAZIONE
                        System.out.println("Inserisci la tua destinazione: ");
                        boolean flagDestinationAnswer = false;
                        String destinationAnswer = null;
                        while (!flagDestinationAnswer) {
                            try {
                                destinationAnswer = scanner.nextLine();
                                flagDestinationAnswer = true;
                            } catch (Exception e) {

                                System.err.println("Invalid type!");
                            }
                        }
                        // INPUT DATA PARTENZA
                        System.out.println("Inserisci la data di partenza (formato YYYY-MM-DD):");
                        boolean flagStartDateAnswer = false;
                        LocalDate startDateAnswer = null;
                        while (!flagStartDateAnswer) {
                            try {
                                startDateAnswer = LocalDate.parse(scanner.nextLine());
                                flagStartDateAnswer = true;
                            } catch (Exception e) {
                                System.err.println("La data non è corretta!");
                            }
                        }

                        // INPUT DATA RITORNO
                        System.out.println("Inserisci la data di ritorno (formato YYYY-MM-DD):");
                        boolean flagFinishDateAnswer = false;
                        LocalDate finishDateAnswer = null;
                        while (!flagFinishDateAnswer) {
                            try {
                                finishDateAnswer = LocalDate.parse(scanner.nextLine());
                                flagFinishDateAnswer = true;
                            } catch (Exception e) {
                                System.out.println("La data non è corretta!");
                            }
                        }
                        try {
                            ArrayList<Excursion> excursions = new ArrayList<>();
                            Vacation vacantion = new Vacation(destinationAnswer, startDateAnswer, finishDateAnswer, excursions);
                            vacantion.addExcursion(excursion1);
                            vacantion.addExcursion(excursion2);
                            vacantion.addExcursion(excursion3);
                            String printVacation = vacantion.toString();
                            System.out.println(printVacation);
                        } catch (Exception e){
                            System.err.println(e.getMessage());
                        }

                        break;
                    case 2:
                        System.out.println("Inserisci la tua destinazione: ");
                        boolean flagDestinationAnswer2 = false;
                        String destinationAnswer2 = null;
                        while (!flagDestinationAnswer2) {
                            try {
                                destinationAnswer2 = scanner.nextLine();
                                flagDestinationAnswer2 = true;
                            } catch (Exception e) {
                                System.err.println("Invalid type!");
                            }
                        }
                        // INPUT DATA PARTENZA
                        System.out.println("Inserisci la data di partenza (formato YYYY-MM-DD):");
                        boolean flagStartDateAnswer2 = false;
                        LocalDate startDateAnswer2 = null;
                        while (!flagStartDateAnswer2) {
                            try {
                                startDateAnswer2 = LocalDate.parse(scanner.nextLine());
                                flagStartDateAnswer2 = true;
                            } catch (Exception e) {
                                System.err.println("La data non è corretta!");
                            }
                        }

                        // INPUT DATA RITORNO
                        System.out.println("Inserisci la data di ritorno (formato YYYY-MM-DD):");
                        boolean flagFinishDateAnswer2 = false;
                        LocalDate finishDateAnswer2 = null;
                        while (!flagFinishDateAnswer2) {
                            try {
                                finishDateAnswer2 = LocalDate.parse(scanner.nextLine());
                                flagFinishDateAnswer2 = true;
                            } catch (Exception e) {
                                System.err.println("La data non è corretta!");
                            }
                        }
                        System.out.println("Inserisci i trattamenti aggiuntivi (separati da virgola):");
                        String trattamentiInput = scanner.nextLine();
                        ArrayList<String> trattamenti = new ArrayList<>();
                        ArrayList<Excursion> excursions2 = new ArrayList<>();
                        TravelOfWedding travelOfWedding = new TravelOfWedding(destinationAnswer2, startDateAnswer2, finishDateAnswer2, excursions2, trattamenti);
                        travelOfWedding.addTrattamento(trattamentiInput);
                        travelOfWedding.addExcursion(excursion1);
                        travelOfWedding.addExcursion(excursion2);
                        travelOfWedding.addExcursion(excursion3);
                        String printTravel = travelOfWedding.toString();
                        System.out.println(printTravel);
                        break;
                    case 3:
                        System.out.println("Inserisci la tua destinazione: ");
                        boolean flagDestinationAnswer3 = false;
                        String destinationAnswer3 = null;
                        while (!flagDestinationAnswer3) {
                            try {
                                destinationAnswer3 = scanner.nextLine();
                                flagDestinationAnswer3 = true;
                            } catch (Exception e) {
                                System.err.println("Invalid type!");
                            }
                        }
                        // INPUT DATA PARTENZA
                        System.out.println("Inserisci la data di partenza (formato YYYY-MM-DD):");
                        boolean flagStartDateAnswer3 = false;
                        LocalDate startDateAnswer3 = null;
                        while (!flagStartDateAnswer3) {
                            try {
                                startDateAnswer3 = LocalDate.parse(scanner.nextLine());
                                flagStartDateAnswer3 = true;
                            } catch (Exception e) {
                                System.err.println("La data non è corretta!");
                            }
                        }

                        // INPUT DATA RITORNO
                        System.out.println("Inserisci la data di ritorno (formato YYYY-MM-DD):");
                        boolean flagFinishDateAnswer3 = false;
                        LocalDate finishDateAnswer3 = null;
                        while (!flagFinishDateAnswer3) {
                            try {
                                finishDateAnswer3 = LocalDate.parse(scanner.nextLine());
                                flagFinishDateAnswer3 = true;
                            } catch (Exception e) {
                                System.err.println("La data non è corretta!");
                            }
                        }
                        System.out.println("Inserisci il numero di partecipanti:");
                        int numberOfPartecipants = scanner.nextInt();
                        scanner.nextLine(); // Consuma la riga vuota dopo l'input dell'utente
                        System.out.println("Inserisci la fascia d'età:");
                        int ageOfPartecipants = scanner.nextInt();
                        ArrayList<Excursion> excursions3 = new ArrayList<>();
                        GroupTravel groupTravel = new GroupTravel(destinationAnswer3, startDateAnswer3, finishDateAnswer3, excursions3, numberOfPartecipants, ageOfPartecipants);
                        groupTravel.addExcursion(excursion1);
                        groupTravel.addExcursion(excursion2);
                        groupTravel.addExcursion(excursion3);
                        String printGroutTravel = groupTravel.toString();
                        System.out.println(printGroutTravel);
                        break;
                }
            }
            else if (answer.equals("n")){
                System.out.println("Arrivederci!");
                sentinella = true;
            } else {
                System.err.println("Scelta non valida!");
            }
        }
        scanner.close();
    }
}





