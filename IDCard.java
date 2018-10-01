package Inheritance;

public class IDCard extends Card {
      private int IDNumber;

      public IDCard() {
          super("Jane Smith");
          this.IDNumber = 0;
      }

      public IDCard(String name, int IDNumber) {
          super(name);
          this.IDNumber = IDNumber;
      }

      public int getIDNumber(){
          return this.IDNumber;
      }

      public String toString() {
          return super.toString() + " ID Number: " + this.IDNumber;
      }
}
