import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yıl;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Yılı Giriniz : ");
        yıl = scanner.nextInt();

        if (yıl % 400 == 0 || (yıl % 4 == 0 && yıl % 100 != 0)){
            System.out.println(yıl + " bir atık yıldır !" );
        } else {
            System.out.println(yıl + " bir atık yıl değildir !" );
        }
    }
}
