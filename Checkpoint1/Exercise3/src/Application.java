import nl.saxion.app.SaxionApp;

import java.awt.*;
import java.util.ArrayList;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {

        SaxionApp.print("Block size? (In pixels, must be dividable by two) ");
        int blockSize = SaxionApp.readInt();

        int max = (int) (800 / blockSize);

        SaxionApp.print("Amount of rows? (Cannot be > " + max + ") ");
        int blocks = SaxionApp.readInt();
        if(blocks > max) {
            blocks = max;
        }
        int startblocks = blocks;

        int size = blocks * blockSize;

        int posx = (size / 2) - (blockSize / 2);
        int posy = 0;
        int posx1 = posx;
        int posx2 = posx;

        int posx3 = 0;

        int between = 0;

        SaxionApp.clear();

        SaxionApp.resize(size, size + 30);

        while (blocks > 0) {
            if(startblocks == blocks) {
                SaxionApp.drawRectangle(posx, posy, blockSize, blockSize);
            } else {
                SaxionApp.drawRectangle(posx2, posy, blockSize, blockSize);
                SaxionApp.drawRectangle(posx1, posy, blockSize, blockSize);
            }

            between = ((posx1 - posx2 + blockSize)  / blockSize);

            posx3 = posx2;

            while (between > 1) {
                posx3 = posx3 + blockSize;
                SaxionApp.drawRectangle(posx3, posy, blockSize, blockSize);
                between--;
            }
            posy = (posy + blockSize);
            posx1 = (posx1 + (blockSize / 2));
            posx2 = (posx2 - (blockSize / 2));
            blocks--;
        }
    }
}
