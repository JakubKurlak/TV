package telewizory;

import telewizory.Philips.P43PU6523;
import telewizory.Samsung.UE43RU7172;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        obslugaTelewizora();
    }

    private static void obslugaTelewizora() {
        Scanner scanner = new Scanner(System.in);
        //UE43RU7172 tv = new UE43RU7172("Unikalneid123");
        //P43PU6523 tv = new P43PU6523("Unikalneid12345");
        Telewizor tv = new UE43RU7172("Unikalneid123");


        int opcja = 0;
        System.out.println("1. Włącz; 2. Wyłącz; 3. Zmień program; 4. Zakończ program;");
        while (opcja != 4) {
            opcja = scanner.nextInt();

            switch (opcja) {
                case 1:
                    tv.wlacz();
                    break;
                case 2:
                    tv.wylacz();
                    break;
                case 3:
                    System.out.println("Podaj numer programu");
                    int numer = scanner.nextInt();
                    tv.przelaczProgram(numer);
                    break;
            }
        }
    }
}
