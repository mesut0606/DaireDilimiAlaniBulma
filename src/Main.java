import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r,a;
        double pi= 3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Yarı çapı giriniz :");
        r = input.nextInt();

        System.out.print("Açıyı giriniz :");
        a = input.nextInt();

       double c = (pi*(r*r)* a )/360;

        System.out.println("Açının alanı =" +c);

    }
}