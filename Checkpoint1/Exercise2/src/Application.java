import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 640, 400);
    }

    public void run() {
        SaxionApp.print("Hoe veel tosses? ");
        int tosses = SaxionApp.readInt();
        int een = 0;
        int twee = 0;
        int drie = 0;
        int vier = 0;
        int vijf = 0;
        int zes = 0;
        int tossvalue = 0;

        while (tosses > 0) {
            tossvalue = SaxionApp.getRandomValueBetween(1,7);
            if(tossvalue == 1) een++;
            else if(tossvalue == 2) twee++;
            else if(tossvalue == 3) drie++;
            else if(tossvalue == 4) vier++;
            else if(tossvalue == 5) vijf++;
            else if(tossvalue == 6) zes++;

            tosses--;
        }

        SaxionApp.printLine("Éénen: " + een);
        SaxionApp.printLine("Tween " + twee);
        SaxionApp.printLine("Drieen " + drie);
        SaxionApp.printLine("Vieren " + vier);
        SaxionApp.printLine("Vijfen " + vijf);
        SaxionApp.printLine("Zessen " + zes);
    }

}
