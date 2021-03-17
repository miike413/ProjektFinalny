import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Sklep gdzie musimy zrobić zakupy. Trzeba wybrac 5 produktów by wyjść ze sklepu. Jak weźmiemy produkt to ma on zniknąć z pocji
        String[] klasa = {"Złodziej", "Obywatel"};
        // produkty w sklepie
        String[] shop = {"Bananas", "Orange", "Bread", "Yogurt", "CornFlakes", "Chicken"};
        // koszyk o pojemności 5
        String[] basket = new String[5];

        Scanner scanner = new Scanner(System.in);
//test

   //test

        int x = 0;
        boolean fullBasket = false;
        int numberOfItemsInBasket = 0;
        //klasa postaci

        {
        try {
            System.out.println("Przed wejsciem do sklepu wybierz swoją postać od 0 - 1 : ");
            for (int i = 0; i < klasa.length; i++) {
                System.out.println("[" + i + "] = " + klasa[i]);
            }
            int yourklasa = scanner.nextInt();
            {System.out.println("Wybrałes postać:"+ yourklasa);}
        }
        catch(InputMismatchException inputMismatchException)
            {
                System.out.println("zły typ danych");

            }
        }

        {
            //lista rzeczy
            int y;
            Scanner myObj = new Scanner(System.in);
            System.out.print("Po ile produktow przyszedles: ");
            y = myObj.nextInt();
        }

        do
            {
            try {
                System.out.println("\n Wybierz produkt ze sklepu : ");
                for (int i = 0; i < shop.length; i++)
                {
                    System.out.println("[" + i + "] = " + shop[i]);
                }
                int yourChoice = scanner.nextInt();


                if (yourChoice <= shop.length && yourChoice >= 0)
                {

                    if (!shop[yourChoice].equals("empty"))
                    {
                        basket[numberOfItemsInBasket] = shop[yourChoice];
                        shop[yourChoice] = "empty";
                        numberOfItemsInBasket++;
                    }
                    else
                        {
                        System.out.println("Nie ma takiego produktu");
                        }

                }
                else
                    {
                    System.out.println("Nie ma takiej opcji w sklepie");
                    }

                if (numberOfItemsInBasket == 1) fullBasket = true;
                System.out.println("Twój koszyk:");
                for (int i = 0; i < numberOfItemsInBasket; i++) System.out.println("[" + i + "] = " + basket[i]);
            }
            catch (InputMismatchException inputMismatchException)
            {
                System.out.println("zły typ danych");
                scanner.next();
            }
        }
        while (!fullBasket);
        {

            if (!"0".equals(klasa));

            {

                System.out.println("Sprzedawca: Zapraszam do kasy");
                System.out.println("Masz dwie opcje: zapłacić lub uciec: ");
                System.out.println("1. Uciec" +"\n" + "2. Zapłaćic" );
                int wybor = scanner.nextInt();
                System.out.println("Wybrałes" + wybor);
                {
                    if (!"1".equals(wybor));
                    System.out.println("Wybrałeś opcje by uciec z sklepu, co ty na to że rzucimy monetą o to czy udało Ci się uciec");
                    System.out.println("Wybierz liczbe 1 lub 2");
                    int moneta = scanner.nextInt();
                    Random rand = new Random();
                    int n = rand.nextInt(3);
                    // pokazuje jaka liczbe wylosowal ale nie pokazemy mu tego  // System.out.println(n += 1);
                    
                    {
                        if (moneta == n)
                        System.out.println("Uciekles bezpiecznie z sklepu");

                        else
                            System.out.println("Zostałeś złapany");
                    }

                }
            }


            System.out.println("wychodzisz z sklepu");
        }
        //while and case can we use here?

        //  dodac tu trzeba wyszedles ze sklepu
        }

}