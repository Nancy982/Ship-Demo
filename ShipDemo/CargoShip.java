//Name: Nancy Medina
//Date: 2/7/18
//Description:lab 5 part 2
import java.util.*;
public class CargoShip extends Ship{

   private int tonnage;
   private boolean isDoubleHull;
   
   public CargoShip(String name, int year, int tonnage, boolean isDoubleHull){
      super(name, year);
      this.tonnage  = tonnage;
      this.isDoubleHull = isDoubleHull;
      }
   
    public void setTonnage(int theTonnage){
      tonnage = theTonnage;
      }
       
   public void setIsDoubleHull(boolean theDoubleHull){
      isDoubleHull = theDoubleHull;
      }
   
   public int getTonnage(){
      return tonnage;
      }
      
   public boolean getIsDoubleHull(){
      return isDoubleHull;
      }
      
   public String toString(){
      String toString = "Type: Cargo Ship " + 
                        " \nName: " + getName() + 
                        " \nYear: " + getYearBuilt() + 
                        " \nCargo capacity: " + tonnage + 
                        " \nDouble Hull: " + isDoubleHull + "\n"; 
      return toString;
      }
    }


