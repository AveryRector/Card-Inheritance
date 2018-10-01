package Inheritance;

public class DebitCard extends Card {

    private int cardNumber;
    private int pin;

    public DebitCard() {
        super("Jane Doe");
        this.cardNumber = 00000000;
        this.pin = 0;
    }

    public DebitCard(String name, int cardNumber, int pin) {
        super(name);
        this.cardNumber = cardNumber;
        this.pin = pin;
    }

    public int getCardNumber() {
        return this.cardNumber;
    }

    public boolean isPin(int enteredPin) {
        if(enteredPin == this.pin) {
            return true;
        }
        else {
            return false;
        }
    }

    public String toString() {
        return super.toString() + " Card Number: " + this.cardNumber;
    }

}
