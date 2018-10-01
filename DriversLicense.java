package Inheritance;

public class DriversLicense extends IDCard {

    private int expirationYear;

    public DriversLicense() {
        super();
        this.expirationYear = 1969;
    }

    public DriversLicense(int year, String name, int IDNumber) {
        super(name, IDNumber);
        this.expirationYear = year;
    }

    public int getExpirationYear() {
        return this.expirationYear;
    }

    @Override
    public boolean isExpired() {
        if(this.expirationYear >= 2018) {
            return false;
        }
        else {
            return true;
        }
    }

    public String toString() {
        return super.toString() + " Expiration Year: " + this.expirationYear;
    }
}
