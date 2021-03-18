import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class Main
{
    public static void main(String[] args) {
        produkty produkty = new produkty();
        dane dane = new dane();
        Scanner sc = new Scanner(System.in);
        boolean programIsRunning = true;

        produkty.cennik();
        produkty.pieczywo();
        produkty.warzywny();
        produkty.mięsny();
        produkty.nabial();
        produkty.napoje();

        List<String> produktdodwkoszyku = new ArrayList<>(5);
        List<Double> cenywkoszyku = new ArrayList<>(5);

        Scanner scanner = new Scanner(System.in);


        while (programIsRunning) {
            System.out.print("Zadeklaruj swoja klase");
            System.out.print("\n 1.Złodziej \n 2.Obywatel\n ");
            String userInput = sc.next();

            switch (userInput) {
                case "1": {
                    do {
                        try {

                            System.out.println("Witamy w LadyBird! Ile pieniędzy masz na zakupy?");
                            dane.pieniadze = Math.abs(sc.nextDouble());
                            System.out.println("Na zakupy możesz wydać " + dane.pieniadze + " zł");
                            dane.run = false;
                        } catch (Exception exception) {
                            System.out.println("Błedne dane spróbuj ponownie");
                            sc.next();
                        }
                    } while (dane.run);

                    do {
                        try {


                            while (dane.pobieradan) {

                                produkty.przerwynik();
                                produkty.menudzial();

                                dane.opcja = sc.next();
                                produkty.przerwynik();
                                dane.cenazazakupy = 0;
                                switch (dane.opcja) {
                                    case "0": {
                                        try {
                                            produkty.pokazaniepieczywo();
                                            System.out.println("Który produkt chcesz dodać?");
                                            dane.c = sc.nextInt();

                                            System.out.println("Ile " + produkty.produktpieczywo.get(dane.c) + " chcesz dodać do koszyka?");
                                            dane.x = sc.nextInt();

                                            if (dane.x > 0) {
                                                produktdodwkoszyku.add(produkty.produktpieczywo.get(dane.c));
                                                cenywkoszyku.add(produkty.cenypieczywo.get(dane.c) * dane.x);
                                                System.out.println("Dodałeś " + produkty.produktpieczywo.get(dane.c) + " w cenie " + produkty.cenypieczywo.get(dane.c) + " zł");
                                            }

                                            if (dane.x == 0) {
                                                System.out.println("Nie możesz dodać 0 produktów do koszyka!");
                                            }
                                        } catch (Exception exception) {
                                            System.out.println("Błedne dane spróbuj ponownie");
                                            sc.next();
                                        }


                                        break;
                                    }
                                    case "1": {
                                        try {
                                            produkty.pokazaniewarzywny();
                                            System.out.println("Który produkt chcesz dodać?");
                                            dane.c = sc.nextInt();

                                            System.out.println("Ile " + produkty.produktwarzywny.get(dane.c) + " chcesz dodać do koszyka?");
                                            dane.x = sc.nextInt();

                                            if (dane.x > 0) {
                                                produktdodwkoszyku.add(produkty.produktwarzywny.get(dane.c));
                                                cenywkoszyku.add(produkty.cenywarzywny.get(dane.c) * dane.x);
                                                System.out.println("Dodałeś " + produkty.produktwarzywny.get(dane.c) + " w cenie " + produkty.cenywarzywny.get(dane.c) + " zł");
                                            }

                                            if (dane.x == 0) {
                                                System.out.println("Nie możesz dodać 0 produktów do koszyka!");
                                            }


                                            break;
                                        } catch (Exception exception) {
                                            System.out.println("Błedne dane spróbuj ponownie");
                                            sc.next();
                                        }
                                    }
                                    case "2": {
                                        try {
                                            produkty.pokazaniemięsny();
                                            System.out.println("Który produkt chcesz dodać?");
                                            dane.c = sc.nextInt();

                                            System.out.println("Ile " + produkty.produktmięsny.get(dane.c) + " chcesz dodać do koszyka?");
                                            dane.x = sc.nextInt();

                                            if (dane.x > 0) {
                                                produktdodwkoszyku.add(produkty.produktmięsny.get(dane.c));
                                                cenywkoszyku.add(produkty.cenymięsny.get(dane.c) * dane.x);
                                                System.out.println("Dodałeś " + produkty.produktmięsny.get(dane.c) + " w cenie " + produkty.cenymięsny.get(dane.c) + " zł");
                                            }

                                            if (dane.x == 0) {
                                                System.out.println("Nie możesz dodać 0 produktów do koszyka!");
                                            }
                                        } catch (Exception exception) {
                                            System.out.println("Błedne dane spróbuj ponownie");
                                            sc.next();
                                        }


                                        break;
                                    }
                                    case "3": {
                                        produkty.pokazanienabiał();
                                        System.out.println("Który produkt chcesz dodać?");
                                        dane.c = sc.nextInt();

                                        System.out.println("Ile " + produkty.produktnabiał.get(dane.c) + " chcesz dodać do koszyka?");
                                        dane.x = sc.nextInt();

                                        if (dane.x > 0) {
                                            produktdodwkoszyku.add(produkty.produktnabiał.get(dane.c));
                                            cenywkoszyku.add(produkty.cenynabiał.get(dane.c) * dane.x);
                                            System.out.println("Dodałeś " + produkty.produktnabiał.get(dane.c) + " w cenie " + produkty.cenynabiał.get(dane.c) + " zł");
                                        }

                                        if (dane.x == 0) {
                                            System.out.println("Nie możesz dodać 0 produktów do koszyka!");
                                        }


                                        break;
                                    }
                                    case "4": {
                                        produkty.pokazanienapoj();
                                        System.out.println("Który produkt chcesz dodać?");
                                        dane.c = sc.nextInt();

                                        System.out.println("Ile " + produkty.produktnapoj.get(dane.c) + " chcesz dodać do koszyka?");
                                        dane.x = sc.nextInt();

                                        if (dane.x > 0) {
                                            produktdodwkoszyku.add(produkty.produktnapoj.get(dane.c));
                                            cenywkoszyku.add(produkty.cenynapoj.get(dane.c) * dane.x);
                                            System.out.println("Dodałeś " + produkty.produktnapoj.get(dane.c) + " w cenie " + produkty.cenynapoj.get(dane.c) + " zł");
                                        }

                                        if (dane.x == 0) {
                                            System.out.println("Nie możesz dodać 0 produktów do koszyka!");
                                        }


                                        break;
                                    }
                                    case "5": {

                                        for (int i = 0; i < cenywkoszyku.size(); i++) {
                                            dane.cenazazakupy = dane.cenazazakupy + cenywkoszyku.get(i);
                                        }

                                        System.out.println("Cena za zakupy wynosi " + dane.cenazazakupy + "zł \nCzy chcesz przejść dalej? [tak][nie]");

                                        dane.sd = sc.next();


                                        if (dane.sd.equals("tak")) {
                                            System.out.println("Sprzedawca: Zapraszam do kasy");
                                            System.out.println("Masz dwie opcje: zapłacić lub uciec.");
                                            System.out.println("1. Uciec" + "\n" + "2. Zapłaćic");
                                            int wybor = scanner.nextInt();
                                            System.out.println("Wybrałes -> " + wybor);
                                            if (wybor == 1) {
                                                System.out.println("Wybrałeś opcję by uciec ze sklepu, co ty na to że rzucimy monetą o to czy udało Ci się uciec?");
                                                System.out.println("Wybierz liczbę 1 lub 2");
                                                int moneta = scanner.nextInt();
                                                Random rand = new Random();
                                                int n = rand.nextInt(3);


                                                if (moneta == n) {

                                                    System.out.println("Uciekłeś bezpiecznie ze sklepu.");
                                                } else {
                                                    System.out.println("Zostałeś złapany!" + "\n" + "Trafiasz do aresztu!");

                                                }
                                            } else {

                                                System.out.println("Płacisz");
                                            }
                                            dane.pobieradan = false;
                                            programIsRunning = false;

                                            break;
                                        }


                                    }

                                }
                            }
                        }catch (Exception exception) {
                            System.out.println("Błedne dane spróbuj ponownie");
                            sc.next();
                        }



                    } while (dane.pobieradan);

                    System.out.println("Wyszedłeś ze sklepu");
                    break;

                }
                case "2": {
                    do {
                        try {

                            System.out.println("Witamy w LadyBird! Ile pieniędzy masz na zakupy?");
                            dane.pieniadze = Math.abs(sc.nextDouble());
                            System.out.println("Na zakupy możesz wydać " + dane.pieniadze + " zł");
                            dane.run = false;
                        } catch (Exception exception) {
                            System.out.println("Błedne dane spróbuj ponownie");
                            sc.next();
                        }
                    } while (dane.run);

                    do {
                        try {


                            while (dane.pobieradan) {

                                produkty.przerwynik();
                                produkty.menudzial();

                                dane.opcja = sc.next();
                                produkty.przerwynik();
                                dane.cenazazakupy = 0;
                                switch (dane.opcja) {
                                    case "0": {
                                        produkty.pokazaniepieczywo();
                                        System.out.println("Który produkt chcesz dodać?");
                                        dane.c = sc.nextInt();

                                        System.out.println("Ile " + produkty.produktpieczywo.get(dane.c) + " chcesz dodać do koszyka?");
                                        dane.x = sc.nextInt();

                                        if (dane.x > 0) {
                                            produktdodwkoszyku.add(produkty.produktpieczywo.get(dane.c));
                                            cenywkoszyku.add(produkty.cenypieczywo.get(dane.c) * dane.x);
                                            System.out.println("Dodałeś " + produkty.produktpieczywo.get(dane.c) + " w cenie " + produkty.cenypieczywo.get(dane.c) + " zł");
                                        }

                                        if (dane.x == 0) {
                                            System.out.println("Nie możesz dodać 0 produktów do koszyka!");
                                        }


                                        break;
                                    }
                                    case "1": {
                                        produkty.pokazaniewarzywny();
                                        System.out.println("Który produkt chcesz dodać?");
                                        dane.c = sc.nextInt();

                                        System.out.println("Ile " + produkty.produktwarzywny.get(dane.c) + " chcesz dodać do koszyka?");
                                        dane.x = sc.nextInt();

                                        if (dane.x > 0) {
                                            produktdodwkoszyku.add(produkty.produktwarzywny.get(dane.c));
                                            cenywkoszyku.add(produkty.cenywarzywny.get(dane.c) * dane.x);
                                            System.out.println("Dodałeś " + produkty.produktwarzywny.get(dane.c) + " w cenie " + produkty.cenywarzywny.get(dane.c) + " zł");
                                        }

                                        if (dane.x == 0) {
                                            System.out.println("Nie możesz dodać 0 produktów do koszyka!");
                                        }


                                        break;
                                    }
                                    case "2": {
                                        produkty.pokazaniemięsny();
                                        System.out.println("Który produkt chcesz dodać?");
                                        dane.c = sc.nextInt();

                                        System.out.println("Ile " + produkty.produktmięsny.get(dane.c) + " chcesz dodać do koszyka?");
                                        dane.x = sc.nextInt();

                                        if (dane.x > 0) {
                                            produktdodwkoszyku.add(produkty.produktmięsny.get(dane.c));
                                            cenywkoszyku.add(produkty.cenymięsny.get(dane.c) * dane.x);
                                            System.out.println("Dodałeś " + produkty.produktmięsny.get(dane.c) + " w cenie " + produkty.cenymięsny.get(dane.c) + " zł");
                                        }

                                        if (dane.x == 0) {
                                            System.out.println("Nie możesz dodać 0 produktów do koszyka!");
                                        }


                                        break;
                                    }
                                    case "3": {
                                        produkty.pokazanienabiał();
                                        System.out.println("Który produkt chcesz dodać?");
                                        dane.c = sc.nextInt();

                                        System.out.println("Ile " + produkty.produktnabiał.get(dane.c) + " chcesz dodać do koszyka?");
                                        dane.x = sc.nextInt();

                                        if (dane.x > 0) {
                                            produktdodwkoszyku.add(produkty.produktnabiał.get(dane.c));
                                            cenywkoszyku.add(produkty.cenynabiał.get(dane.c) * dane.x);
                                            System.out.println("Dodałeś " + produkty.produktnabiał.get(dane.c) + " w cenie " + produkty.cenynabiał.get(dane.c) + " zł");
                                        }

                                        if (dane.x == 0) {
                                            System.out.println("Nie możesz dodać 0 produktów do koszyka!");
                                        }


                                        break;
                                    }
                                    case "4": {
                                        produkty.pokazanienapoj();
                                        System.out.println("Który produkt chcesz dodać?");
                                        dane.c = sc.nextInt();

                                        System.out.println("Ile " + produkty.produktnapoj.get(dane.c) + " chcesz dodać do koszyka?");
                                        dane.x = sc.nextInt();

                                        if (dane.x > 0) {
                                            produktdodwkoszyku.add(produkty.produktnapoj.get(dane.c));
                                            cenywkoszyku.add(produkty.cenynapoj.get(dane.c) * dane.x);
                                            System.out.println("Dodałeś " + produkty.produktnapoj.get(dane.c) + " w cenie " + produkty.cenynapoj.get(dane.c) + " zł");
                                        }

                                        if (dane.x == 0) {
                                            System.out.println("Nie możesz dodać 0 produktów do koszyka!");
                                        }


                                        break;
                                    }
                                    case "5": {

                                        for (int i = 0; i < cenywkoszyku.size(); i++) {
                                            dane.cenazazakupy = dane.cenazazakupy + cenywkoszyku.get(i);
                                        }
                                        {
                                            System.out.println("Cena za zakupy wynosi " + dane.cenazazakupy + " zł \nCzy chcesz przejść dalej? [tak][nie]");

                                            dane.sd = sc.next();


                                            if (dane.sd.equals("tak")) {
                                                System.out.println("Sprzedawca: Zapraszam do kasy.");
                                                System.out.println("Podchodzisz do kasy i płacisz.");

                                                dane.pobieradan = false;
                                                programIsRunning = false;

                                                break;
                                            }
                                        }

                                    }

                                }
                            }
                        }catch (Exception exception) {
                            System.out.println("Błedne dane spróbuj ponownie");
                            sc.next();
                        }



                    } while (dane.pobieradan);

                    System.out.println("Wyszedłeś ze sklepu");
                    break;

                }
            }
        }

    }



}