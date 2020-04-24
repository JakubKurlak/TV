package telewizory.Philips;

import telewizory.Telewizor;

public abstract class TelewizorPhilips implements Telewizor {

    private boolean statusWlaczony = false;

    private int obecnyProgram = 3;

    @Override
    public void wlacz() {
        statusWlaczony = true;
        emitujSygnalNaEkran();
        System.out.println("Witaj!");

    }

    @Override
    public void wylacz() {
        statusWlaczony = false;
        System.out.println("CZARNOŚĆ");

    }

    @Override
    public void przelaczProgram(int numer) {
        if (statusWlaczony) {
            obecnyProgram = numer;
        }
    }

    private void emitujSygnalNaEkran() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (statusWlaczony) {
                    try {
                        System.out.println("Program: " + obecnyProgram);
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
