import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class dane
{
    public static void main(String[] args) {
        produkty produkty = new produkty();
        dana dana = new dana();
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
                            dana.pieniadze = Math.abs(sc.nextDouble());
                            System.out.println("Na zakupy możesz wydać " + dana.pieniadze + " zł");
                            dana.run = false;
                        } catch (Exception exception) {
                            System.out.println("Błedne dane spróbuj ponownie");
                            sc.next();
                        }
                    } while (dana.run);

                    do {


                        while (dana.pobieradan) {

                            produkty.przerwynik();
                            produkty.menudzial();

                            dana.opcja = sc.next();
                            produkty.przerwynik();
                            dana.cenazazakupy = 0;
                            switch (dana.opcja) {
                                case "0": {
                                    produkty.pokazaniepieczywo();
                                    System.out.println("Który produkt chcesz dodać?");
                                    dana.c = sc.nextInt();

                                    System.out.println("Ile " + produkty.produktpieczywo.get(dana.c) + " chcesz dodać do koszyka?");
                                    dana.x = sc.nextInt();

                                    if (dana.x > 0) {
                                        produktdodwkoszyku.add(produkty.produktpieczywo.get(dana.c));
                                        cenywkoszyku.add(produkty.cenypieczywo.get(dana.c) * dana.x);
                                        System.out.println("Dodałeś " + produkty.produktpieczywo.get(dana.c) + " w cenie " + produkty.cenypieczywo.get(dana.c) + " zł");
                                    }

                                    if (dana.x == 0) {
                                        System.out.println("Nie możesz dodać 0 produktów do koszyka!");
                                    }


                                    break;
                                }
                                case "1": {
                                    produkty.pokazaniewarzywny();
                                    System.out.println("Który produkt chcesz dodać?");
                                    dana.c = sc.nextInt();

                                    System.out.println("Ile " + produkty.produktwarzywny.get(dana.c) + " chcesz dodać do koszyka?");
                                    dana.x = sc.nextInt();

                                    if (dana.x > 0) {
                                        produktdodwkoszyku.add(produkty.produktwarzywny.get(dana.c));
                                        cenywkoszyku.add(produkty.cenywarzywny.get(dana.c) * dana.x);
                                        System.out.println("Dodałeś " + produkty.produktwarzywny.get(dana.c) + " w cenie " + produkty.cenywarzywny.get(dana.c) + " zł");
                                    }

                                    if (dana.x == 0) {
                                        System.out.println("Nie możesz dodać 0 produktów do koszyka!");
                                    }


                                    break;
                                }
                                case "2": {
                                    produkty.pokazaniemięsny();
                                    System.out.println("Który produkt chcesz dodać?");
                                    dana.c = sc.nextInt();

                                    System.out.println("Ile " + produkty.produktmięsny.get(dana.c) + " chcesz dodać do koszyka?");
                                    dana.x = sc.nextInt();

                                    if (dana.x > 0) {
                                        produktdodwkoszyku.add(produkty.produktmięsny.get(dana.c));
                                        cenywkoszyku.add(produkty.cenymięsny.get(dana.c) * dana.x);
                                        System.out.println("Dodałeś " + produkty.produktmięsny.get(dana.c) + " w cenie " + produkty.cenymięsny.get(dana.c) + " zł");
                                    }

                                    if (dana.x == 0) {
                                        System.out.println("Nie możesz dodać 0 produktów do koszyka!");
                                    }


                                    break;
                                }
                                case "3": {
                                    produkty.pokazanienabiał();
                                    System.out.println("Który produkt chcesz dodać?");
                                    dana.c = sc.nextInt();

                                    System.out.println("Ile " + produkty.produktnabiał.get(dana.c) + " chcesz dodać do koszyka?");
                                    dana.x = sc.nextInt();

                                    if (dana.x > 0) {
                                        produktdodwkoszyku.add(produkty.produktnabiał.get(dana.c));
                                        cenywkoszyku.add(produkty.cenynabiał.get(dana.c) * dana.x);
                                        System.out.println("Dodałeś " + produkty.produktnabiał.get(dana.c) + " w cenie " + produkty.cenynabiał.get(dana.c) + " zł");
                                    }

                                    if (dana.x == 0) {
                                        System.out.println("Nie możesz dodać 0 produktów do koszyka!");
                                    }


                                    break;
                                }
                                case "4": {
                                    produkty.pokazanienapoj();
                                    System.out.println("Który produkt chcesz dodać?");
                                    dana.c = sc.nextInt();

                                    System.out.println("Ile " + produkty.produktnapoj.get(dana.c) + " chcesz dodać do koszyka?");
                                    dana.x = sc.nextInt();

                                    if (dana.x > 0) {
                                        produktdodwkoszyku.add(produkty.produktnapoj.get(dana.c));
                                        cenywkoszyku.add(produkty.cenynapoj.get(dana.c) * dana.x);
                                        System.out.println("Dodałeś " + produkty.produktnapoj.get(dana.c) + " w cenie " + produkty.cenynapoj.get(dana.c) + " zł");
                                    }

                                    if (dana.x == 0) {
                                        System.out.println("Nie możesz dodać 0 produktów do koszyka!");
                                    }


                                    break;
                                }
                                case "5": {

                                    for (int i = 0; i < cenywkoszyku.size(); i++) {
                                        dana.cenazazakupy = dana.cenazazakupy + cenywkoszyku.get(i);
                                    }
                                    {
                                        System.out.println("Cena za zakupy wynosi " + dana.cenazazakupy +"zł \nCzy chcesz przejść dalej? [tak][nie]");

                                        dana.sd = sc.next();


                                        if (dana.sd.equals("tak")) {
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


                                                if (moneta == n)
                                                {

                                                    System.out.println("Uciekłeś bezpiecznie ze sklepu.");
                                                } else
                                                {
                                                    System.out.println("Zostałeś złapany!" + "\n" + "Trafiasz do aresztu!");

                                                }
                                            } else {

                                                System.out.println("Płacisz");
                                            }
                                            dana.pobieradan=false;
                                            programIsRunning=false;

                                            break;
                                        }
                                    }

                                }

                            }
                        }



                    } while (dana.pobieradan);

                    System.out.println("Wyszedłeś ze sklepu");
                    break;

                }
                case "2": {
                    do {
                        try {

                            System.out.println("Witamy w LadyBird! Ile pieniędzy masz na zakupy?");
                            dana.pieniadze = Math.abs(sc.nextDouble());
                            System.out.println("Na zakupy możesz wydać " + dana.pieniadze + " zł");
                            dana.run = false;
                        } catch (Exception exception) {
                            System.out.println("Błedne dane spróbuj ponownie");
                            sc.next();
                        }
                    } while (dana.run);

                    do {


                        while (dana.pobieradan) {

                            produkty.przerwynik();
                            produkty.menudzial();

                            dana.opcja = sc.next();
                            produkty.przerwynik();
                            dana.cenazazakupy = 0;
                            switch (dana.opcja) {
                                case "0": {
                                    produkty.pokazaniepieczywo();
                                    System.out.println("Który produkt chcesz dodać?");
                                    dana.c = sc.nextInt();

                                    System.out.println("Ile " + produkty.produktpieczywo.get(dana.c) + " chcesz dodać do koszyka?");
                                    dana.x = sc.nextInt();

                                    if (dana.x > 0) {
                                        produktdodwkoszyku.add(produkty.produktpieczywo.get(dana.c));
                                        cenywkoszyku.add(produkty.cenypieczywo.get(dana.c) * dana.x);
                                        System.out.println("Dodałeś " + produkty.produktpieczywo.get(dana.c) + " w cenie " + produkty.cenypieczywo.get(dana.c) + " zł");
                                    }

                                    if (dana.x == 0) {
                                        System.out.println("Nie możesz dodać 0 produktów do koszyka!");
                                    }


                                    break;
                                }
                                case "1": {
                                    produkty.pokazaniewarzywny();
                                    System.out.println("Który produkt chcesz dodać?");
                                    dana.c = sc.nextInt();

                                    System.out.println("Ile " + produkty.produktwarzywny.get(dana.c) + " chcesz dodać do koszyka?");
                                    dana.x = sc.nextInt();

                                    if (dana.x > 0) {
                                        produktdodwkoszyku.add(produkty.produktwarzywny.get(dana.c));
                                        cenywkoszyku.add(produkty.cenywarzywny.get(dana.c) * dana.x);
                                        System.out.println("Dodałeś " + produkty.produktwarzywny.get(dana.c) + " w cenie " + produkty.cenywarzywny.get(dana.c) + " zł");
                                    }

                                    if (dana.x == 0) {
                                        System.out.println("Nie możesz dodać 0 produktów do koszyka!");
                                    }


                                    break;
                                }
                                case "2": {
                                    produkty.pokazaniemięsny();
                                    System.out.println("Który produkt chcesz dodać?");
                                    dana.c = sc.nextInt();

                                    System.out.println("Ile " + produkty.produktmięsny.get(dana.c) + " chcesz dodać do koszyka?");
                                    dana.x = sc.nextInt();

                                    if (dana.x > 0) {
                                        produktdodwkoszyku.add(produkty.produktmięsny.get(dana.c));
                                        cenywkoszyku.add(produkty.cenymięsny.get(dana.c) * dana.x);
                                        System.out.println("Dodałeś " + produkty.produktmięsny.get(dana.c) + " w cenie " + produkty.cenymięsny.get(dana.c) + " zł");
                                    }

                                    if (dana.x == 0) {
                                        System.out.println("Nie możesz dodać 0 produktów do koszyka!");
                                    }


                                    break;
                                }
                                case "3": {
                                    produkty.pokazanienabiał();
                                    System.out.println("Który produkt chcesz dodać?");
                                    dana.c = sc.nextInt();

                                    System.out.println("Ile " + produkty.produktnabiał.get(dana.c) + " chcesz dodać do koszyka?");
                                    dana.x = sc.nextInt();

                                    if (dana.x > 0) {
                                        produktdodwkoszyku.add(produkty.produktnabiał.get(dana.c));
                                        cenywkoszyku.add(produkty.cenynabiał.get(dana.c) * dana.x);
                                        System.out.println("Dodałeś " + produkty.produktnabiał.get(dana.c) + " w cenie " + produkty.cenynabiał.get(dana.c) + " zł");
                                    }

                                    if (dana.x == 0) {
                                        System.out.println("Nie możesz dodać 0 produktów do koszyka!");
                                    }


                                    break;
                                }
                                case "4": {
                                    produkty.pokazanienapoj();
                                    System.out.println("Który produkt chcesz dodać?");
                                    dana.c = sc.nextInt();

                                    System.out.println("Ile " + produkty.produktnapoj.get(dana.c) + " chcesz dodać do koszyka?");
                                    dana.x = sc.nextInt();

                                    if (dana.x > 0) {
                                        produktdodwkoszyku.add(produkty.produktnapoj.get(dana.c));
                                        cenywkoszyku.add(produkty.cenynapoj.get(dana.c) * dana.x);
                                        System.out.println("Dodałeś " + produkty.produktnapoj.get(dana.c) + " w cenie " + produkty.cenynapoj.get(dana.c) + " zł");
                                    }

                                    if (dana.x == 0) {
                                        System.out.println("Nie możesz dodać 0 produktów do koszyka!");
                                    }


                                    break;
                                }
                                case "5": {

                                    for (int i = 0; i < cenywkoszyku.size(); i++) {
                                        dana.cenazazakupy = dana.cenazazakupy + cenywkoszyku.get(i);
                                    }
                                    {
                                        System.out.println("Cena za zakupy wynosi " + dana.cenazazakupy +" zł \nCzy chcesz przejść dalej? [tak][nie]");

                                        dana.sd = sc.next();


                                        if (dana.sd.equals("tak")) {
                                            System.out.println("Sprzedawca: Zapraszam do kasy.");
                                            System.out.println("Podchodzisz do kasy i płacisz.");

                                            dana.pobieradan=false;
                                            programIsRunning=false;

                                            break;
                                        }
                                    }

                                }

                            }
                        }



                    } while (dana.pobieradan);

                    System.out.println("Wyszedłeś ze sklepu");
                    break;

                }
            }
        }

    }



}
