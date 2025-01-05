import java.lang.Math;
import java.util.Scanner;

class Card {
    int cardVal;
    String cardSuit;
    String cardName;
    
    public Card (int cardVal, String cardSuit, String cardName) {
        this.cardVal = cardVal;
        this.cardSuit = cardSuit;
        this.cardName = cardName;
    }
    
    public static int generateVal() {
        double r = Math.random();
        
        if (r < (1.0 / 13)) {
            return 1;
        }
        else if (r > (1.0 / 13) && r < (2.0 / 13)) {
            return 2;
        }
        else if (r > (2.0 / 13) && r < (3.0 /13)) {
            return 3;
        }
        else if (r > (3.0 / 13) && r < (4.0 / 13)) {
            return 4;
        }
        else if (r > (4.0 / 13) && r < (5.0 / 13)) {
            return 5;
        }
        else if (r > (5.0 / 13) && r < (6.0 / 13)) {
            return 6;
        }
        else if (r > (6.0 / 13) && r < (7.0 / 13)) {
            return 7;
        }
        else if (r > (7.0 / 13) && r < (8.0 / 13)) {
            return 8;
        }
        else if (r > (8.0 / 13) && r < (9.0 / 13)) {
            return 9;
        }
        else if (r > (9.0 / 13) && r < (10.0 / 13)) {
            return 10;
        }
        else if (r > (10.0 / 13) && r < (11.0 / 13)) {
            return 11;
        }
        else if (r > (11.0 / 13) && r < (12.0 / 13)) {
            return 12;
        }
        else {
            return 13;
        }
    }
        
    public static String generateSuit() {
        double r = Math.random();
        
        if (r < (1.0 / 4)) {
            return "Spades";
        }
        else if (r > (1.0 / 4) && r < (2.0 / 4)) {
            return "Clubs";
        }
        else if (r > (2.0 / 4) && r < (3.0 / 4)) {
            return "Hearts";
        }
        else {
            return "Diamonds";
        }
    }
    
    public static String generateName(int v) {
        
        switch (v) {
            case 1:
                return "Ace";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            case 8:
                return "8";
            case 9:
                return "9";
            case 10:
                return "10";
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";
            default:
                return "Error";
        }
    }
}
