import nl.saxion.app.SaxionApp;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Michiel implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Michiel());
    }

    public void run() {
        SaxionApp.print("Wachtwoord: ");
        String ww = SaxionApp.readString();

        if(ww.equalsIgnoreCase("hallo123")){
            SaxionApp.printLine("Login succesful!");
        } else {
            SaxionApp.printLine("Nope.. geen toegang.");
        }
    }
}
