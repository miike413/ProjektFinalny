import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class produkty {
    List<String> produktpieczywo = new ArrayList<>(5);
    List<Double> cenypieczywo=new ArrayList<>(5);
    List<String> produktwarzywny = new ArrayList<>(5);
    List<Double> cenywarzywny=new ArrayList<>(5);
    List<String> produktmięsny = new ArrayList<>(5);
    List<Double> cenymięsny=new ArrayList<>(5);
    List<String> produktnabiał = new ArrayList<>(5);
    List<Double> cenynabiał=new ArrayList<>(5);
    List<String> produktnapoj = new ArrayList<>(5);
    List<Double> cenynapoj=new ArrayList<>(5);
    public void pokazaniepieczywo(){

        for (int i=0;i<produktpieczywo.size();i++) {
            System.out.println("naciśnij "+i+" "+produktpieczywo.get(i)+" "+cenypieczywo.get(i)+" zł");

        }
    }

    public void pokazaniewarzywny(){

        for (int i=0;i<produktwarzywny.size();i++) {
            System.out.println("naciśnij "+i+" "+produktwarzywny.get(i)+" "+cenywarzywny.get(i)+" zł");

        }
    }

    public void pokazaniemięsny(){

        for (int i=0;i<produktmięsny.size();i++) {
            System.out.println("naciśnij "+i+" "+produktmięsny.get(i)+" "+cenymięsny.get(i)+" zł");

        }
    }

    public void pokazanienabiał(){

        for (int i=0;i<produktnabiał.size();i++) {
            System.out.println("naciśnij "+i+" "+produktnabiał.get(i)+" "+cenynabiał.get(i)+" zł");

        }
    }

    public void pokazanienapoj(){

        for (int i=0;i<produktnapoj.size();i++) {
            System.out.println("naciśnij "+i+" "+produktnapoj.get(i)+" "+cenynapoj.get(i)+" zł");

        }
    }

    public void warzywny(){

        produktwarzywny.add("Ogórek");
        produktwarzywny.add("Pomidor");
        produktwarzywny.add("Sałata");
        produktwarzywny.add("Ziemniak");
        produktwarzywny.add("Papryka");
        produktwarzywny.add("Cytryna");
    }
    public void mięsny(){

        produktmięsny.add("Pierś z kurczaka 500g");
        produktmięsny.add("Wołowina 500g");
        produktmięsny.add("Śledź 500g");
        produktmięsny.add("Karp 500g");
        produktmięsny.add("Indyk 500g");
        produktmięsny.add("Salami 500g");
    }
    public void nabial(){

        produktnabiał.add("Mleko 1l");
        produktnabiał.add("Jogurt");
        produktnabiał.add("Ser biały");
        produktnabiał.add("Ser żółty");
        produktnabiał.add("Ser pleśniowy");
        produktnabiał.add("Twaróg");
    }
    public void napoje(){

        produktnapoj.add("Pepsi 1l");
        produktnapoj.add("Woda 1l");
        produktnapoj.add("Kuflowe mocne 0.33l");
        produktnapoj.add("Stock Wódka 0.5l");
        produktnapoj.add("Sok pomarańczowy 1l");
        produktnapoj.add("Oranżada 1l");
    }

    public void cennik(){
        cenypieczywo.add(3.0);
        cenypieczywo.add(3.0);
        cenypieczywo.add(0.5);
        cenypieczywo.add(4.5);
        cenypieczywo.add(2.0);
        cenypieczywo.add(4.5);
        cenywarzywny.add(1.0);
        cenywarzywny.add(1.0);
        cenywarzywny.add(2.0);
        cenywarzywny.add(0.3);
        cenywarzywny.add(2.0);
        cenywarzywny.add(2.0);
        cenymięsny.add(10.0);
        cenymięsny.add(15.0);
        cenymięsny.add(7.0);
        cenymięsny.add(9.0);
        cenymięsny.add(15.0);
        cenymięsny.add(5.0);
        cenynabiał.add(3.0);
        cenynabiał.add(1.5);
        cenynabiał.add(2.0);
        cenynabiał.add(4.0);
        cenynabiał.add(4.0);
        cenynabiał.add(2.0);
        cenynapoj.add(5.0);
        cenynapoj.add(2.0);
        cenynapoj.add(1.99);
        cenynapoj.add(24.5);
        cenynapoj.add(3.0);
        cenynapoj.add(3.0);
    }

    public void pieczywo(){

        produktpieczywo.add("Chleb razowy");
        produktpieczywo.add("Chleb pszenny");
        produktpieczywo.add("Kajzerka");
        produktpieczywo.add("Zapiekanka");
        produktpieczywo.add("Pączek");
        produktpieczywo.add("Bagietka czosnkowa");
    }

    public void menudzial(){
        List<String> menu = new ArrayList<>(6);
        menu.add(0, "[0] Pieczywo");
        menu.add(1, "[1] Warzywny");
        menu.add(2, "[2] Mięsny");
        menu.add(3, "[3] Nabiał");
        menu.add(4, "[4] Napoje");
        menu.add(5, "[5] Idź do kasy");
        System.out.println("Wybierz dział:");
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(menu.get(i));
        }
    }

    public void przerwynik() {
        System.out.println("-----------------------------------------------------------");
    }
}