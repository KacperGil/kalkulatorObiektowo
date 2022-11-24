import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza cyfre");
        double a = scanner.nextDouble();
        System.out.println("Podaj drugą cyfrę");
        double b = scanner.nextDouble();
        System.out.println("Wybierz akcje \ndodawanie(1) \nodejmowanie(2) \nmnożenie(3) \ndzielenie(4)");
        int akcja = scanner.nextInt();

        KalkulatorObiekt liczby = new KalkulatorObiekt(a, b);

        liczby.setA(a);
        liczby.setB(b);

        switch (akcja) {
            case 1:
                System.out.println("Dodawanie: " + liczby.dodawanie());
                break;
            case 2:
                System.out.println("Odejmowanie: " + liczby.odejmowanie());
                break;
            case 3:
                System.out.println("Mnozenie: " + liczby.mnozenie());
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Cholero nie dziel przez zero!");
                    break;
                } else {
                    System.out.println("Dzielenie: " + liczby.dzielenie());
                    break;
                }

        }
    }
}
