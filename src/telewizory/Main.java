package telewizory;

import telewizory.Philips.P43PU6523;
import telewizory.Philips.P55PUS7334;
import telewizory.Samsung.UE43RU7172;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
  //      obslugaTelewizora();
        obslugaPilota();
    }

    private static void obslugaTelewizora() {
        Scanner scanner = new Scanner(System.in);
        //UE43RU7172 tv = new UE43RU7172("Unikalneid123");
        //P43PU6523 tv = new P43PU6523("Unikalneid12345");
        //P55PUS7334 tv = new P55PUS7334("Unikalneid1234567");
        Telewizor tv = new P55PUS7334("Unikalneid1234567");


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
        scanner.close();
    }

    private static void obslugaPilota() {
        Pilot pilot = new PilotNoName();
        //Telewizor telewizor = new UE43RU7172("Unikalneid1234");
        Telewizor telewizor = new P55PUS7334("Unikalneid1234");

        pilot.sparujTelewizor(telewizor);

        Scanner scanner = new Scanner(System.in);
        int opcja;

        System.out.println("0. Naciśnij czerwony; 1. Naciśnij 1; 2. Naciśnij 2; 3. Naciśnij 3; 4. Zakończ; ");
        do{
            opcja = scanner.nextInt();

            switch (opcja){
                case 0:
                    pilot.nacisnijCzerwony();
                    break;
                case 1:
                    pilot.nacisnijJeden();
                    break;
                case 2:
                    pilot.nacisnijDwa();
                    break;
                case 3:
                    pilot.nacisnijTrzy();
                    break;
            }
        }while (opcja != 4);

        scanner.close();
    }
}
