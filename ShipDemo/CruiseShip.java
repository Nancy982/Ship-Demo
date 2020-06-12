//Name: Nancy Medina
//Date: 2/7/18
//Description:lab 5 part 3
import java.util.*;
public class CruiseShip extends Ship{
   
   private int passengers;
   private int numPets;
   
   public CruiseShip (String name, int year, int passangers, int numPets){
      super(name, year); 
      this.passengers = passengers;
      this.numPets = numPets;
      }
      
   public void setPassengers(int thePassengers){
      passengers = thePassengers;
      }
   
   public void setNumPets(int pets){
      numPets = pets;
      }
  
   public int getPassengers(){
      return passengers;
      }
   
   public int getNumPets(){
      return numPets;
      }
  
  public String toString(){
      String toString = "Type: Cruise Ship" + 
                        " \nName: " + getName() + 
                        " \nYear: " + getYearBuilt() + 
                        " \nMaximum passengers: " + passengers + 
                        " \nNum Pets Allowed: " + numPets + "\n";
      return toString;
      }
    }
    
