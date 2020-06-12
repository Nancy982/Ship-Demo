//Name: Nancy Medina
//Date: 2/7/18
//Description:lab 5 part 4
public class ShipDemo {

   public static void main(String args[]){
   
      final int NUM_SHIPS = 3;
      Ship[] ships = new Ship[NUM_SHIPS];
      
      Ship sp1 = new CargoShip("Too Small", 1999 , 17, true);
      Ship sp2 = new CargoShip("Giant", 1980, 25, false);
      Ship sp3 = new CruiseShip("Disney Goofy", 2017, 123, 21);
      
      ships[0] = sp1;
      ships[1] = sp2;
      ships[2] = sp3;
      
      for(int i= 0; i <ships.length; i++) {
         System.out.println(" " + ships[i]);
         }
      }
    }
   