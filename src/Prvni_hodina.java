import java.util.Locale;
import java.util.Scanner;
public class Prvni_hodina {
    public static void main(String[] args) {
        System.out.println("Ahoj svete");
        /*toto je komentar*/
        String operace=(args[0]).toLowerCase(Locale.ROOT);
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        switch (operace) {
            case "s" -> System.out.println(a + b);
            case "o" -> System.out.println(a - b);
            case "n" -> System.out.println(a * b);
            case "d" -> System.out.println(a / b);
            default -> System.out.println("What the hell are you doing ?");
        }
        /*System.out.println("Ahoj svete");
        Scanner sc = new Scanner(System.in,"Windows-1250");
        String operace=(args[0]).toLowerCase(Locale.ROOT);
        System.out.println("Zadej 1.cislo");
        int b = Integer.parseInt(args[2]);
        switch (operace){
            case "s": System.out.println(10+b);
                break;
            case "o": System.out.println(10-b);
                break;
            case "n": System.out.println(10*b);
                break;
            case "d": System.out.println(10/b);
                break;
            default:
                System.out.println("What the hell are you doing ?");
        }*/
    }
}
