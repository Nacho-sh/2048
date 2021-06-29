package nacho.dos;
import javax.swing.*;
import java.util.Random;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main {
    static ImageIcon two = new ImageIcon("src\\main\\java\\nacho\\dos\\images\\2.png");
    static ImageIcon four = new ImageIcon("src\\main\\java\\nacho\\dos\\images\\4.png");
    static ImageIcon eight = new ImageIcon("src\\main\\java\\nacho\\dos\\images\\8.png");
    static ImageIcon sixteen = new ImageIcon("src\\main\\java\\nacho\\dos\\images\\16.png");
    static ImageIcon thirty2 = new ImageIcon("src\\main\\java\\nacho\\dos\\images\\32.png");
    static ImageIcon sixty4 = new ImageIcon("src\\main\\java\\nacho\\dos\\images\\64.png");
    static ImageIcon onehundred = new ImageIcon("src\\main\\java\\nacho\\dos\\images\\128.png");
    static ImageIcon twohundred = new ImageIcon("src\\main\\java\\nacho\\dos\\images\\256.png");
    static ImageIcon fivehundred = new ImageIcon("src\\main\\java\\nacho\\dos\\images\\512.png");
    static ImageIcon onethousand = new ImageIcon("src\\main\\java\\nacho\\dos\\images\\1024.png");
    static ImageIcon twothousand = new ImageIcon("src\\main\\java\\nacho\\dos\\images\\2048.png");
    static ImageIcon fourthousand = new ImageIcon("src\\main\\java\\nacho\\dos\\images\\4096.png");
    static ImageIcon eightthousand = new ImageIcon("src\\main\\java\\nacho\\dos\\images\\8192.png");
    static ImageIcon sixteenthousand = new ImageIcon("src\\main\\java\\nacho\\dos\\images\\16384.png");
    static ImageIcon blank = new ImageIcon("src\\main\\java\\nacho\\dos\\images\\blank.png");
    static Random random = new Random();
    public static int location;
    public static int number;
    static ImageIcon newlabel;
    public static int[] numbers = new int[16];
    public static int newnum;
    public static int score = 0;

    public static void MoveLeft() {
        int i = 1;

        boolean moved = false;
        while (i < 16) {
            if (i == 1 & numbers[0] == 0 & numbers[1] != 0) {
                switch (numbers[i]) {
                    case 2:
                        Label(0).setIcon(two);
                        Label(0).setText("2");
                        Label(0).setForeground(Color.BLACK);
                        break;
                    case 4:
                        Label(0).setIcon(four);
                        Label(0).setText("4");
                        Label(0).setForeground(Color.BLACK);
                        break;
                    case 8:
                        Label(0).setIcon(eight);
                        Label(0).setText("8");
                        Label(0).setForeground(Color.WHITE);
                        break;
                    case 16:
                        Label(0).setIcon(sixteen);
                        Label(0).setText("16");
                        Label(0).setForeground(Color.WHITE);
                        break;
                    case 32:
                        Label(0).setIcon(thirty2);
                        Label(0).setText("32");
                        Label(0).setForeground(Color.WHITE);
                        break;
                    case 64:
                        Label(0).setIcon(sixty4);
                        Label(0).setText("64");
                        Label(0).setForeground(Color.WHITE);
                        break;
                    case 128:
                        Label(0).setIcon(onehundred);
                        Label(0).setText("128");
                        Label(0).setForeground(Color.WHITE);
                        break;
                    case 256:
                        Label(0).setIcon(twohundred);
                        Label(0).setText("256");
                        Label(0).setForeground(Color.WHITE);
                        break;
                    case 512:
                        Label(0).setIcon(fivehundred);
                        Label(0).setText("512");
                        Label(0).setForeground(Color.WHITE);
                        break;
                    case 1024:
                        Label(0).setIcon(onethousand);
                        Label(0).setText("1024");
                        Label(0).setForeground(Color.WHITE);
                        break;
                    case 2048:
                        Label(0).setIcon(twothousand);
                        Label(0).setText("2048");
                        Label(0).setForeground(Color.WHITE);
                        break;
                    case 4096:
                        Label(0).setIcon(fourthousand);
                        Label(0).setText("4096");
                        Label(0).setForeground(Color.WHITE);
                        break;
                    case 8192:
                        Label(0).setIcon(eightthousand);
                        Label(0).setText("8192");
                        Label(0).setForeground(Color.WHITE);
                        break;
                    case 16384:
                        Label(0).setIcon(sixteenthousand);
                        Label(0).setText("16384");
                        Label(0).setForeground(Color.WHITE);

                }
                numbers[0] = numbers[1];
                Label(1).setText("");
                Label(1).setIcon(blank);
                numbers[1] = 0;
                moved = true;

            } else if (numbers[i] != 0 & numbers[i - 1] == 0 & i != 4 & i != 8 & i != 12) {
                switch (numbers[i]) {
                    case 2:
                        Label(i - 1).setIcon(two);
                        Label(i - 1).setText("2");
                        Label(i - 1).setForeground(Color.BLACK);
                        break;
                    case 4:
                        Label(i - 1).setIcon(four);
                        Label(i - 1).setText("4");
                        Label(i - 1).setForeground(Color.BLACK);
                        break;
                    case 8:
                        Label(i - 1).setIcon(eight);
                        Label(i - 1).setText("8");
                        Label(i - 1).setForeground(Color.WHITE);
                        break;
                    case 16:
                        Label(i - 1).setIcon(sixteen);
                        Label(i - 1).setText("16");
                        Label(i - 1).setForeground(Color.WHITE);
                        break;
                    case 32:
                        Label(i - 1).setIcon(thirty2);
                        Label(i - 1).setText("32");
                        Label(i - 1).setForeground(Color.WHITE);
                        break;
                    case 64:
                        Label(i - 1).setIcon(sixty4);
                        Label(i - 1).setText("64");
                        Label(i - 1).setForeground(Color.WHITE);
                        break;
                    case 128:
                        Label(i - 1).setIcon(onehundred);
                        Label(i - 1).setText("128");
                        Label(i - 1).setForeground(Color.WHITE);
                        break;
                    case 256:
                        Label(i - 1).setIcon(twohundred);
                        Label(i - 1).setText("256");
                        Label(i - 1).setForeground(Color.WHITE);
                        break;
                    case 512:
                        Label(i - 1).setIcon(fivehundred);
                        Label(i - 1).setText("512");
                        Label(i - 1).setForeground(Color.WHITE);
                        break;
                    case 1024:
                        Label(i - 1).setIcon(onethousand);
                        Label(i - 1).setText("1024");
                        Label(i - 1).setForeground(Color.WHITE);
                        break;
                    case 2048:
                        Label(i - 1).setIcon(twothousand);
                        Label(i - 1).setText("2048");
                        Label(i - 1).setForeground(Color.WHITE);
                        break;
                    case 4096:
                        Label(i - 1).setIcon(fourthousand);
                        Label(i - 1).setText("4096");
                        Label(i - 1).setForeground(Color.WHITE);
                        break;
                    case 8192:
                        Label(i - 1).setIcon(eightthousand);
                        Label(i - 1).setText("8192");
                        Label(i - 1).setForeground(Color.WHITE);
                        break;
                    case 16384:
                        Label(i - 1).setIcon(sixteenthousand);
                        Label(i - 1).setText("16384");
                        Label(i - 1).setForeground(Color.WHITE);

                }
                numbers[i - 1] = numbers[i];
                Label(i).setIcon(blank);
                Label(i).setText("");
                numbers[i] = 0;
                moved = true;
                i--;
                i--;
            } else if (numbers[i - 1] == numbers[i] & numbers[i] != 0 & i != 4 & i != 8 & i != 12) {
                switch (numbers[i]) {
                    case 2:
                        Label(i - 1).setIcon(four);
                        Label(i - 1).setText("4");
                        Label(i - 1).setForeground(Color.BLACK);
                        numbers[i - 1] = 4;
                        break;
                    case 4:
                        Label(i - 1).setIcon(eight);
                        Label(i - 1).setText("8");
                        Label(i - 1).setForeground(Color.WHITE);
                        numbers[i - 1] = 8;
                        break;
                    case 8:
                        Label(i - 1).setIcon(sixteen);
                        Label(i - 1).setText("16");
                        Label(i - 1).setForeground(Color.WHITE);
                        numbers[i - 1] = 16;
                        break;
                    case 16:
                        Label(i - 1).setIcon(thirty2);
                        Label(i - 1).setText("32");
                        Label(i - 1).setForeground(Color.WHITE);
                        numbers[i - 1] = 32;
                        break;
                    case 32:
                        Label(i - 1).setIcon(sixty4);
                        Label(i - 1).setText("64");
                        Label(i - 1).setForeground(Color.WHITE);
                        numbers[i - 1] = 64;
                        break;
                    case 64:
                        Label(i - 1).setIcon(onehundred);
                        Label(i - 1).setText("128");
                        Label(i - 1).setForeground(Color.WHITE);
                        numbers[i - 1] = 128;
                        break;
                    case 128:
                        Label(i - 1).setIcon(twohundred);
                        Label(i - 1).setText("256");
                        Label(i - 1).setForeground(Color.WHITE);
                        numbers[i - 1] = 256;
                        break;
                    case 256:
                        Label(i - 1).setIcon(fivehundred);
                        Label(i - 1).setText("512");
                        Label(i - 1).setForeground(Color.WHITE);
                        numbers[i - 1] = 512;
                        break;
                    case 512:
                        Label(i - 1).setIcon(onethousand);
                        Label(i - 1).setText("1024");
                        Label(i - 1).setForeground(Color.WHITE);
                        numbers[i - 1] = 1024;
                        break;
                    case 1024:
                        Label(i - 1).setIcon(twothousand);
                        Label(i - 1).setText("2048");
                        Label(i - 1).setForeground(Color.WHITE);
                        numbers[i - 1] = 2048;
                        break;
                    case 2048:
                        Label(i - 1).setIcon(fourthousand);
                        Label(i - 1).setText("4096");
                        Label(i - 1).setForeground(Color.WHITE);
                        numbers[i - 1] = 4096;
                        break;
                    case 4096:
                        Label(i - 1).setIcon(eightthousand);
                        Label(i - 1).setText("8192");
                        Label(i - 1).setForeground(Color.WHITE);
                        numbers[i - 1] = 8192;
                        break;
                    case 8192:
                        Label(i - 1).setIcon(sixteenthousand);
                        Label(i - 1).setText("16384");
                        Label(i - 1).setForeground(Color.WHITE);
                        numbers[i - 1] = 16384;
                        break;
                }
                Label(i).setIcon(blank);
                Label(i).setText("");
                score = score + numbers[i] * 2;
                Screen.jLabel18.setText("Score: " + score);
                numbers[i] = 0;
                moved = true;
            }
            i++;

        }
        if (moved == true) {
            Start(1);
            moved = false;
        }

    }

    public static void MoveRight() {
        int i = 14;

        boolean moved = false;
        while (i >= 0) {
            if (i == 14 & numbers[15] == 0 & numbers[14] != 0) {
                switch (numbers[14]) {
                    case 2:
                        Label(15).setIcon(two);
                        Label(15).setText("2");
                        Label(15).setForeground(Color.BLACK);
                        break;
                    case 4:
                        Label(15).setIcon(four);
                        Label(15).setText("4");
                        Label(15).setForeground(Color.BLACK);
                        break;
                    case 8:
                        Label(15).setIcon(eight);
                        Label(15).setText("8");
                        Label(15).setForeground(Color.WHITE);
                        break;
                    case 16:
                        Label(15).setIcon(sixteen);
                        Label(15).setText("16");
                        Label(15).setForeground(Color.WHITE);
                        break;
                    case 32:
                        Label(15).setIcon(thirty2);
                        Label(15).setText("32");
                        Label(15).setForeground(Color.WHITE);
                        break;
                    case 64:
                        Label(15).setIcon(sixty4);
                        Label(15).setText("64");
                        Label(15).setForeground(Color.WHITE);
                        break;
                    case 128:
                        Label(15).setIcon(onehundred);
                        Label(15).setText("128");
                        Label(15).setForeground(Color.WHITE);
                        break;
                    case 256:
                        Label(15).setIcon(twohundred);
                        Label(15).setText("256");
                        Label(15).setForeground(Color.WHITE);
                        break;
                    case 512:
                        Label(15).setIcon(fivehundred);
                        Label(15).setText("512");
                        Label(15).setForeground(Color.WHITE);
                        break;
                    case 1024:
                        Label(15).setIcon(onethousand);
                        Label(15).setText("1024");
                        Label(15).setForeground(Color.WHITE);
                        break;
                    case 2048:
                        Label(15).setIcon(twothousand);
                        Label(15).setText("2048");
                        Label(15).setForeground(Color.WHITE);
                        break;
                    case 4096:
                        Label(15).setIcon(fourthousand);
                        Label(15).setText("4096");
                        Label(15).setForeground(Color.WHITE);
                        break;
                    case 8192:
                        Label(15).setIcon(eightthousand);
                        Label(15).setText("8192");
                        Label(15).setForeground(Color.WHITE);
                        break;
                    case 16384:
                        Label(15).setIcon(sixteenthousand);
                        Label(15).setText("16384");
                        Label(15).setForeground(Color.WHITE);
                }
                numbers[15] = numbers[14];
                Label(14).setText("");
                Label(14).setIcon(blank);
                numbers[14] = 0;
                moved = true;
            } else if (numbers[i] != 0 & numbers[i + 1] == 0 & i != 3 & i != 7 & i != 11) {
                switch (numbers[i]) {
                    case 2:
                        Label(i + 1).setIcon(two);
                        Label(i + 1).setText("2");
                        Label(i + 1).setForeground(Color.BLACK);
                        break;
                    case 4:
                        Label(i + 1).setIcon(four);
                        Label(i + 1).setText("4");
                        Label(i + 1).setForeground(Color.BLACK);
                        break;
                    case 8:
                        Label(i + 1).setIcon(eight);
                        Label(i + 1).setText("8");
                        Label(i + 1).setForeground(Color.WHITE);
                        break;
                    case 16:
                        Label(i + 1).setIcon(sixteen);
                        Label(i + 1).setText("16");
                        Label(i + 1).setForeground(Color.WHITE);
                        break;
                    case 32:
                        Label(i + 1).setIcon(thirty2);
                        Label(i + 1).setText("32");
                        Label(i + 1).setForeground(Color.WHITE);
                        break;
                    case 64:
                        Label(i + 1).setIcon(sixty4);
                        Label(i + 1).setText("64");
                        Label(i + 1).setForeground(Color.WHITE);
                        break;
                    case 128:
                        Label(i + 1).setIcon(onehundred);
                        Label(i + 1).setText("128");
                        Label(i + 1).setForeground(Color.WHITE);
                        break;
                    case 256:
                        Label(i + 1).setIcon(twohundred);
                        Label(i + 1).setText("256");
                        Label(i + 1).setForeground(Color.WHITE);
                        break;
                    case 512:
                        Label(i + 1).setIcon(fivehundred);
                        Label(i + 1).setText("512");
                        Label(i + 1).setForeground(Color.WHITE);
                        break;
                    case 1024:
                        Label(i + 1).setIcon(onethousand);
                        Label(i + 1).setText("1024");
                        Label(i + 1).setForeground(Color.WHITE);
                        break;
                    case 2048:
                        Label(i + 1).setIcon(twothousand);
                        Label(i + 1).setText("2048");
                        Label(i + 1).setForeground(Color.WHITE);
                        break;
                    case 4096:
                        Label(i + 1).setIcon(fourthousand);
                        Label(i + 1).setText("4096");
                        Label(i + 1).setForeground(Color.WHITE);
                        break;
                    case 8192:
                        Label(i + 1).setIcon(eightthousand);
                        Label(i + 1).setText("8192");
                        Label(i + 1).setForeground(Color.WHITE);
                        break;
                    case 16384:
                        Label(i + 1).setIcon(sixteenthousand);
                        Label(i + 1).setText("16384");
                        Label(i + 1).setForeground(Color.WHITE);
                        break;
                }
                numbers[i + 1] = numbers[i];
                Label(i).setIcon(blank);
                Label(i).setText("");
                numbers[i] = 0;
                moved = true;
                i++;
                i++;
            } else if (numbers[i] == numbers[i + 1] & numbers[i] != 0 & i != 3 & i != 7 & i != 11) {
                switch (numbers[i]) {
                    case 2:
                        Label(i + 1).setIcon(four);
                        Label(i + 1).setText("4");
                        Label(i + 1).setForeground(Color.BLACK);
                        numbers[i + 1] = 4;
                        break;
                    case 4:
                        Label(i + 1).setIcon(eight);
                        Label(i + 1).setText("8");
                        Label(i + 1).setForeground(Color.WHITE);
                        numbers[i + 1] = 8;
                        break;
                    case 8:
                        Label(i + 1).setIcon(sixteen);
                        Label(i + 1).setText("16");
                        Label(i + 1).setForeground(Color.WHITE);
                        numbers[i + 1] = 16;
                        break;
                    case 16:
                        Label(i + 1).setIcon(thirty2);
                        Label(i + 1).setText("32");
                        Label(i + 1).setForeground(Color.WHITE);
                        numbers[i + 1] = 32;
                        break;
                    case 32:
                        Label(i + 1).setIcon(sixty4);
                        Label(i + 1).setText("64");
                        Label(i + 1).setForeground(Color.WHITE);
                        numbers[i + 1] = 64;
                        break;
                    case 64:
                        Label(i + 1).setIcon(onehundred);
                        Label(i + 1).setText("128");
                        Label(i + 1).setForeground(Color.WHITE);
                        numbers[i + 1] = 128;
                        break;
                    case 128:
                        Label(i + 1).setIcon(twohundred);
                        Label(i + 1).setText("256");
                        Label(i + 1).setForeground(Color.WHITE);
                        numbers[i + 1] = 256;
                        break;
                    case 256:
                        Label(i + 1).setIcon(fivehundred);
                        Label(i + 1).setText("512");
                        Label(i + 1).setForeground(Color.WHITE);
                        numbers[i + 1] = 512;
                        break;
                    case 512:
                        Label(i + 1).setIcon(onethousand);
                        Label(i + 1).setText("1024");
                        Label(i + 1).setForeground(Color.WHITE);
                        numbers[i + 1] = 1024;
                        break;
                    case 1024:
                        Label(i + 1).setIcon(twothousand);
                        Label(i + 1).setText("2048");
                        Label(i + 1).setForeground(Color.WHITE);
                        numbers[i + 1] = 2048;
                        break;
                    case 2048:
                        Label(i + 1).setIcon(fourthousand);
                        Label(i + 1).setText("4096");
                        Label(i + 1).setForeground(Color.WHITE);
                        numbers[i + 1] = 4096;
                        break;
                    case 4096:
                        Label(i + 1).setIcon(eightthousand);
                        Label(i + 1).setText("8192");
                        Label(i + 1).setForeground(Color.WHITE);
                        numbers[i + 1] = 8192;
                        break;
                    case 8192:
                        Label(i + 1).setIcon(sixteenthousand);
                        Label(i + 1).setText("16384");
                        Label(i + 1).setForeground(Color.WHITE);
                        numbers[i + 1] = 16384;
                        break;
                }
                Label(i).setIcon(blank);
                Label(i).setText("");
                score = score + numbers[i] * 2;
                Screen.jLabel18.setText("Score: " + score);
                numbers[i] = 0;
                moved = true;
            }
            i--;

        }
        if (moved == true) {
            Start(1);
            moved = false;
        }
    }

    public static void MoveDown(boolean first) {
        int i = 11;
        boolean moved = false;
        while (i >= 0) {

            if (numbers[i] != 0 & numbers[i + 4] == 0) {
                switch (numbers[i]) {
                    case 2:
                        Label(i + 4).setIcon(two);
                        Label(i + 4).setText("2");
                        Label(i + 4).setForeground(Color.BLACK);
                        break;
                    case 4:
                        Label(i + 4).setIcon(four);
                        Label(i + 4).setText("4");
                        Label(i + 4).setForeground(Color.BLACK);
                        break;
                    case 8:
                        Label(i + 4).setIcon(eight);
                        Label(i + 4).setText("8");
                        Label(i + 4).setForeground(Color.WHITE);
                        break;
                    case 16:
                        Label(i + 4).setIcon(sixteen);
                        Label(i + 4).setText("16");
                        Label(i + 4).setForeground(Color.WHITE);
                        break;
                    case 32:
                        Label(i + 4).setIcon(thirty2);
                        Label(i + 4).setText("32");
                        Label(i + 4).setForeground(Color.WHITE);
                        break;
                    case 64:
                        Label(i + 4).setIcon(sixty4);
                        Label(i + 4).setText("64");
                        Label(i + 4).setForeground(Color.WHITE);
                        break;
                    case 128:
                        Label(i + 4).setIcon(onehundred);
                        Label(i + 4).setText("128");
                        Label(i + 4).setForeground(Color.WHITE);
                        break;
                    case 256:
                        Label(i + 4).setIcon(twohundred);
                        Label(i + 4).setText("256");
                        Label(i + 4).setForeground(Color.WHITE);
                        break;
                    case 512:
                        Label(i + 4).setIcon(fivehundred);
                        Label(i + 4).setText("512");
                        Label(i + 4).setForeground(Color.WHITE);
                        break;
                    case 1024:
                        Label(i + 4).setIcon(onethousand);
                        Label(i + 4).setText("1024");
                        Label(i + 4).setForeground(Color.WHITE);
                        break;
                    case 2048:
                        Label(i + 4).setIcon(twothousand);
                        Label(i + 4).setText("2048");
                        Label(i + 4).setForeground(Color.WHITE);
                        break;
                    case 4096:
                        Label(i + 4).setIcon(fourthousand);
                        Label(i + 4).setText("4096");
                        Label(i + 4).setForeground(Color.WHITE);
                        break;
                    case 8192:
                        Label(i + 4).setIcon(eightthousand);
                        Label(i + 4).setText("8192");
                        Label(i + 4).setForeground(Color.WHITE);
                        break;
                    case 16384:
                        Label(i + 4).setIcon(sixteenthousand);
                        Label(i + 4).setText("16384");
                        Label(i + 4).setForeground(Color.WHITE);
                        break;
                }
                numbers[i + 4] = numbers[i];
                Label(i).setIcon(blank);
                Label(i).setText("");
                numbers[i] = 0;
                moved = true;
                if (i != 11) {
                    i = i + 2;
                }
            } else if (numbers[i] == numbers[i + 4] & numbers[i] != 0) {
                switch (numbers[i]) {
                    case 2:
                        Label(i + 4).setIcon(four);
                        Label(i + 4).setText("4");
                        Label(i + 4).setForeground(Color.BLACK);
                        numbers[i + 4] = 4;
                        break;
                    case 4:
                        Label(i + 4).setIcon(eight);
                        Label(i + 4).setText("8");
                        Label(i + 4).setForeground(Color.WHITE);
                        numbers[i + 4] = 8;
                        break;
                    case 8:
                        Label(i + 4).setIcon(sixteen);
                        Label(i + 4).setText("16");
                        Label(i + 4).setForeground(Color.WHITE);
                        numbers[i + 4] = 16;
                        break;
                    case 16:
                        Label(i + 4).setIcon(thirty2);
                        Label(i + 4).setText("32");
                        Label(i + 4).setForeground(Color.WHITE);
                        numbers[i + 4] = 32;
                        break;
                    case 32:
                        Label(i + 4).setIcon(sixty4);
                        Label(i + 4).setText("64");
                        Label(i + 4).setForeground(Color.WHITE);
                        numbers[i + 4] = 64;
                        break;
                    case 64:
                        Label(i + 4).setIcon(onehundred);
                        Label(i + 4).setText("128");
                        Label(i + 4).setForeground(Color.WHITE);
                        numbers[i + 4] = 128;
                        break;
                    case 128:
                        Label(i + 4).setIcon(twohundred);
                        Label(i + 4).setText("256");
                        Label(i + 4).setForeground(Color.WHITE);
                        numbers[i + 4] = 256;
                        break;
                    case 256:
                        Label(i + 4).setIcon(fivehundred);
                        Label(i + 4).setText("512");
                        Label(i + 4).setForeground(Color.WHITE);
                        numbers[i + 4] = 512;
                        break;
                    case 512:
                        Label(i + 4).setIcon(onethousand);
                        Label(i + 4).setText("1024");
                        Label(i + 4).setForeground(Color.WHITE);
                        numbers[i + 4] = 1024;
                        break;
                    case 1024:
                        Label(i + 4).setIcon(twothousand);
                        Label(i + 4).setText("2048");
                        Label(i + 4).setForeground(Color.WHITE);
                        numbers[i + 4] = 2048;
                        break;
                    case 2048:
                        Label(i + 4).setIcon(fourthousand);
                        Label(i + 4).setText("4096");
                        Label(i + 4).setForeground(Color.WHITE);
                        numbers[i + 4] = 4096;
                        break;
                    case 4096:
                        Label(i + 4).setIcon(eightthousand);
                        Label(i + 4).setText("8192");
                        Label(i + 4).setForeground(Color.WHITE);
                        numbers[i + 4] = 8192;
                        break;
                    case 8192:
                        Label(i + 4).setIcon(sixteenthousand);
                        Label(i + 4).setText("16384");
                        Label(i + 4).setForeground(Color.WHITE);
                        numbers[i + 4] = 16384;
                        break;
                }
                Label(i).setIcon(blank);
                Label(i).setText("");
                score = score + numbers[i] * 2;
                Screen.jLabel18.setText("Score: " + score);
                numbers[i] = 0;
                moved = true;
            }
            i--;

        }
        if (moved == true & first == true) {
            Start(1);
            moved = false;
        }
    }

    public static void MoveUp(boolean first) {
        int i = 4;
        boolean moved = false;
        while (i < 16) {
            if (numbers[i] != 0 & numbers[i - 4] == 0) {
                switch (numbers[i]) {
                    case 2:
                        Label(i - 4).setIcon(two);
                        Label(i - 4).setText("2");
                        Label(i - 4).setForeground(Color.BLACK);
                        break;
                    case 4:
                        Label(i - 4).setIcon(four);
                        Label(i - 4).setText("4");
                        Label(i - 4).setForeground(Color.BLACK);
                        break;
                    case 8:
                        Label(i - 4).setIcon(eight);
                        Label(i - 4).setText("8");
                        Label(i - 4).setForeground(Color.WHITE);
                        break;
                    case 16:
                        Label(i - 4).setIcon(sixteen);
                        Label(i - 4).setText("16");
                        Label(i - 4).setForeground(Color.WHITE);
                        break;
                    case 32:
                        Label(i - 4).setIcon(thirty2);
                        Label(i - 4).setText("32");
                        Label(i - 4).setForeground(Color.WHITE);
                        break;
                    case 64:
                        Label(i - 4).setIcon(sixty4);
                        Label(i - 4).setText("64");
                        Label(i - 4).setForeground(Color.WHITE);
                        break;
                    case 128:
                        Label(i - 4).setIcon(onehundred);
                        Label(i - 4).setText("128");
                        Label(i - 4).setForeground(Color.WHITE);
                        break;
                    case 256:
                        Label(i - 4).setIcon(twohundred);
                        Label(i - 4).setText("256");
                        Label(i - 4).setForeground(Color.WHITE);
                        break;
                    case 512:
                        Label(i - 4).setIcon(fivehundred);
                        Label(i - 4).setText("512");
                        Label(i - 4).setForeground(Color.WHITE);
                        break;
                    case 1024:
                        Label(i - 4).setIcon(onethousand);
                        Label(i - 4).setText("1024");
                        Label(i - 4).setForeground(Color.WHITE);
                        break;
                    case 2048:
                        Label(i - 4).setIcon(twothousand);
                        Label(i - 4).setText("2048");
                        Label(i - 4).setForeground(Color.WHITE);
                        break;
                    case 4096:
                        Label(i - 4).setIcon(fourthousand);
                        Label(i - 4).setText("4096");
                        Label(i - 4).setForeground(Color.WHITE);
                        break;
                    case 8192:
                        Label(i - 4).setIcon(eightthousand);
                        Label(i - 4).setText("8192");
                        Label(i - 4).setForeground(Color.WHITE);
                        break;
                    case 16384:
                        Label(i - 4).setIcon(sixteenthousand);
                        Label(i - 4).setText("16384");
                        Label(i - 4).setForeground(Color.WHITE);
                        break;
                }
                numbers[i - 4] = numbers[i];
                Label(i).setIcon(blank);
                Label(i).setText("");
                numbers[i] = 0;
                moved = true;
            } else if (numbers[i] == numbers[i - 4] & numbers[i] != 0) {
                switch (numbers[i]) {
                    case 2:
                        Label(i - 4).setIcon(four);
                        Label(i - 4).setText("4");
                        Label(i - 4).setForeground(Color.BLACK);
                        numbers[i - 4] = 4;
                        break;
                    case 4:
                        Label(i - 4).setIcon(eight);
                        Label(i - 4).setText("8");
                        Label(i - 4).setForeground(Color.WHITE);
                        numbers[i - 4] = 8;
                        break;
                    case 8:
                        Label(i - 4).setIcon(sixteen);
                        Label(i - 4).setText("16");
                        Label(i - 4).setForeground(Color.WHITE);
                        numbers[i - 4] = 16;
                        break;
                    case 16:
                        Label(i - 4).setIcon(thirty2);
                        Label(i - 4).setText("32");
                        Label(i - 4).setForeground(Color.WHITE);
                        numbers[i - 4] = 32;
                        break;
                    case 32:
                        Label(i - 4).setIcon(sixty4);
                        Label(i - 4).setText("64");
                        Label(i - 4).setForeground(Color.WHITE);
                        numbers[i - 4] = 64;
                        break;
                    case 64:
                        Label(i - 4).setIcon(onehundred);
                        Label(i - 4).setText("128");
                        Label(i - 4).setForeground(Color.WHITE);
                        numbers[i - 4] = 128;
                        break;
                    case 128:
                        Label(i - 4).setIcon(twohundred);
                        Label(i - 4).setText("256");
                        Label(i - 4).setForeground(Color.WHITE);
                        numbers[i - 4] = 256;
                        break;
                    case 256:
                        Label(i - 4).setIcon(fivehundred);
                        Label(i - 4).setText("512");
                        Label(i - 4).setForeground(Color.WHITE);
                        numbers[i - 4] = 512;
                        break;
                    case 512:
                        Label(i - 4).setIcon(onethousand);
                        Label(i - 4).setText("1024");
                        Label(i - 4).setForeground(Color.WHITE);
                        numbers[i - 4] = 1024;
                        break;
                    case 1024:
                        Label(i - 4).setIcon(twothousand);
                        Label(i - 4).setText("2048");
                        Label(i - 4).setForeground(Color.WHITE);
                        numbers[i - 4] = 2048;
                        break;
                    case 2048:
                        Label(i - 4).setIcon(fourthousand);
                        Label(i - 4).setText("4096");
                        Label(i - 4).setForeground(Color.WHITE);
                        numbers[i - 4] = 4096;
                        break;
                    case 4096:
                        Label(i - 4).setIcon(eightthousand);
                        Label(i - 4).setText("8192");
                        Label(i - 4).setForeground(Color.WHITE);
                        numbers[i - 4] = 8192;
                        break;
                    case 8192:
                        Label(i - 4).setIcon(sixteenthousand);
                        Label(i - 4).setText("16384");
                        Label(i - 4).setForeground(Color.WHITE);
                        numbers[i - 4] = 16384;
                        break;
                }
                Label(i).setIcon(blank);
                Label(i).setText("");
                score = score + numbers[i] * 2;
                Screen.jLabel18.setText("Score: " + score);
                numbers[i] = 0;
                moved = true;
            }
            i++;
        }
        if (moved == true & first == true) {
            Start(1);
            moved = false;
        }
    }

    public static JLabel Label(int i) {
        switch (i) {
            case 0:
                return Screen.jLabel1;

            case 1:
                return Screen.jLabel2;

            case 2:
                return Screen.jLabel3;

            case 3:
                return Screen.jLabel4;

            case 4:
                return Screen.jLabel5;

            case 5:
                return Screen.jLabel6;

            case 6:
                return Screen.jLabel7;

            case 7:
                return Screen.jLabel8;

            case 8:
                return Screen.jLabel9;

            case 9:
                return Screen.jLabel10;

            case 10:
                return Screen.jLabel11;

            case 11:
                return Screen.jLabel12;

            case 12:
                return Screen.jLabel13;

            case 13:
                return Screen.jLabel14;

            case 14:
                return Screen.jLabel15;

            case 15:
                return Screen.jLabel16;

            default:
                return Screen.jLabel1;

        }

    }

    public static void Redraw(int n) {
        int i = 0;

        if (n == 0) {
            while (i < 16) {
                switch (numbers[i]) {
                    case 0:
                        Label(i).setIcon(blank);

                        break;
                    case 2:
                        Label(i).setIcon(two);
                        Label(i).setText("2");
                        Label(i).setHorizontalTextPosition(JLabel.CENTER);
                        Label(i).setForeground(Color.BLACK);
                        break;
                    case 4:
                        Label(i).setIcon(four);
                        Label(i).setText("4");
                        Label(i).setHorizontalTextPosition(JLabel.CENTER);
                        Label(i).setForeground(Color.BLACK);
                        break;
                }
                i++;
            }
        }
    }

    public static void CheckMoves() {
        boolean full = true;
        boolean valid = false;
        for (int i = 0; i < 16; i++) {
            if (numbers[i] == 0) {
                full = false;
            }
        }
        if (full == true) {
            for (int i = 1; i < 16; i++) {
                if (numbers[i - 1] == numbers[i] & numbers[i] != 0 & i != 4 & i != 8 & i != 12) {
                    valid = true;
                }
            }
            for (int i = 14; i >= 0; i--) {
                if (numbers[i] == numbers[i + 1] & numbers[i] != 0 & i != 3 & i != 7 & i != 11) {
                    valid = true;
                }

            }
            for (int i = 11; i >= 0; i--) {
                if (numbers[i] == numbers[i + 4] & numbers[i] != 0) {
                    valid = true;
                }
            }
            for (int i = 4; i < 16; i++) {
                if (numbers[i] == numbers[i - 4] & numbers[i] != 0) {
                    valid = true;
                }
            }
        }
        if (full == false) {
            valid = true;
        }
        if (valid == false) {
            Screen.jLabel18.setText("You lost!");
        }
    }

    public static void Start(int t) {
        while (t < 2) {
            int number = 0;
            location = 0;

            number = random.nextInt(10);
            switch (number) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    number = 2;
                    break;
                case 9:
                    number = 4;
                    break;
            }
            do {
                location = random.nextInt(16);
            } while (numbers[location] != 0 | location == 0);
            numbers[location] = number;
            Redraw(0);
            t++;
        }

    }

    public static void main(String[] args) {
        Screen screen = new Screen();
        screen.setVisible(true);
        Screen.jLabel1.setIcon(blank);
        Screen.jLabel2.setIcon(blank);
        Screen.jLabel3.setIcon(blank);
        Screen.jLabel4.setIcon(blank);
        Screen.jLabel5.setIcon(blank);
        Screen.jLabel6.setIcon(blank);
        Screen.jLabel7.setIcon(blank);
        Screen.jLabel8.setIcon(blank);
        Screen.jLabel9.setIcon(blank);
        Screen.jLabel10.setIcon(blank);
        Screen.jLabel11.setIcon(blank);
        Screen.jLabel12.setIcon(blank);
        Screen.jLabel13.setIcon(blank);
        Screen.jLabel14.setIcon(blank);
        Screen.jLabel15.setIcon(blank);
        Screen.jLabel16.setIcon(blank);
        Start(0);
        ImageIcon icon = new ImageIcon("src\\main\\java\\nacho\\dos\\images\\icon.png");        
        screen.setIconImage(icon.getImage());
        screen.setTitle("2048");
        screen.addKeyListener(new KeyListener(){

            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {
                int keycode = e.getKeyCode();
                switch (keycode) {
                    case java.awt.event.KeyEvent.VK_S:
                    case java.awt.event.KeyEvent.VK_DOWN:
                        Main.MoveDown(true);
                        Main.MoveDown(false);
                        Main.MoveDown(false);
                        CheckMoves();
                        break;
                    case java.awt.event.KeyEvent.VK_W:
                    case java.awt.event.KeyEvent.VK_UP:
                        Main.MoveUp(true);
                        Main.MoveUp(false);
                        Main.MoveUp(false);
                        CheckMoves();
                        break;
                    case java.awt.event.KeyEvent.VK_D:
                    case java.awt.event.KeyEvent.VK_RIGHT:
                        Main.MoveRight();
                        CheckMoves();
                        break;
                    case java.awt.event.KeyEvent.VK_A:
                    case java.awt.event.KeyEvent.VK_LEFT:
                        Main.MoveLeft();
                        CheckMoves();
                }

            }

            @Override
            public void keyReleased(KeyEvent e) {}
        });
}
}