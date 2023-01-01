import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        double x= scanner.nextDouble();
        System.out.println("podaj druga liczbe");
        double y= scanner.nextDouble();

        System.out.println("wibierz dzialanie");
        System.out.println("1 Dodawanie");
        System.out.println("2 Odejmowanie");
        System.out.println("3 Mnozenie");
        System.out.println("4 Dzielenie");
        byte n= scanner.nextByte();
        switch (n) {
            case 1 :
                System.out.println(x+y);
                break;
            case  2 :
                System.out.println(x-y);
                break;
            case 3:
                System.out.println(x*y);
                break;
            case 4:
                System.out.println(x/y);
                break;


        }
    }


        }

















