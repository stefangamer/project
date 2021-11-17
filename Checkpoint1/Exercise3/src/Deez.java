import nl.saxion.app.SaxionApp;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Deez implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Deez());
    }

    public void run() {
        ArrayList<String> images = new ArrayList<>();
        images.add("hans");
        images.add("rick");
        images.add("ronald");
        images.add("ruud");


        int bal = 100;

        boolean cont = true;

        int size = 1000;

        int random = 0;

        String name = "eee";

        SaxionApp.resize(size, size);

        SaxionApp.printLine("Saxion Slots. Designer: Stefan. *Emotional* support: Thomas.");

        SaxionApp.pause();

        while (cont && bal > 0) {
            SaxionApp.clear();
            SaxionApp.drawText("Slot Machine ", 385, 100, 40);

            bal -= 2;

            random = SaxionApp.getRandomValueBetween(5, 10);

            SaxionApp.print("Balance: " + bal);

            while (random > 0) {
                name = images.get(SaxionApp.getRandomValueBetween(0, images.size()));
                SaxionApp.drawImage( name + ".jpg", 325, 200, 100, 100);
                name = images.get(SaxionApp.getRandomValueBetween(0, images.size()));
                SaxionApp.drawImage(name + ".jpg", 450, 200, 100, 100);
                name = images.get(SaxionApp.getRandomValueBetween(0, images.size()));
                SaxionApp.drawImage(name + ".jpg", 575, 200, 100, 100);

                random--;

                try {
                    TimeUnit.MILLISECONDS.sleep(SaxionApp.getRandomValueBetween(100,300));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            String roll1 = images.get(SaxionApp.getRandomValueBetween(0, images.size()));
            String roll2 = images.get(SaxionApp.getRandomValueBetween(0, images.size()));
            String roll3 = images.get(SaxionApp.getRandomValueBetween(0, images.size()));



            SaxionApp.drawImage(roll1 + ".jpg", 325, 200, 100, 100);
            SaxionApp.drawImage(roll2 + ".jpg", 450, 200, 100, 100);
            SaxionApp.drawImage(roll3 + ".jpg", 575, 200, 100, 100);

            if(roll1.equals("ronald") && roll2.equals("ronald") && roll3.equals("ronald")) {
                SaxionApp.drawText("HAH DE LUL! ", 440 , 350, 20);
                cont = false;
            } else if(roll1.equals(roll2) && roll2.equals(roll3)) {
                SaxionApp.drawText("You got 3 in a row! x3 coins! ", 375, 350, 20);
                bal = bal * 3;
            } else if (roll1.startsWith("r") && roll2.startsWith("r") && roll1.startsWith("r")) {
                SaxionApp.drawText("You got 3 names with an r! x2 coins! ", 340 , 350, 20);
                bal = bal * 2;
            } else {
                SaxionApp.drawText("No luck today :( ", 440 , 350, 20);
            }
            SaxionApp.pause();
        }
        SaxionApp.clear();
        SaxionApp.print("Game over, score: " + bal);
    }
}
