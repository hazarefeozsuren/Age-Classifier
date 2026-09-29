import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Yaşınızı girin: ");
        int yas = scanner.nextInt();

        if (yas < 13) {
            System.out.println("Çocuksunuz.");
        } else if (yas < 18) {
            System.out.println("Ergenlik dönemindesiniz.");
        } else if (yas < 65) {
            System.out.println("Yetişkinsiniz.");
        } else {
            System.out.println("Yaşlısınız.");
        }

        scanner.close();
    }
}