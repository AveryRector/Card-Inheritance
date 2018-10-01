package Inheritance;

public class Card {

    private String name;

    public Card() {
        this.name = "";
    }

    public Card (String name) {
        this.name = name;
    }

    public boolean isExpired() {
        return false;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "Card Holder: " + this.name;
    }
}
