//Name: Nancy Medina
//Date: 2/7/18
//Description:lab 5 part 1
import java.util.*;
public abstract class Ship {

   private String name;
   private int yearBuilt;
   private int numPropellars;
   
   public Ship(String name, int year){
      this.name = name;
      yearBuilt = year;
      }
   
   public void setName(String theName){
      name = theName;
      }
      
   public void setYearBuilt(int built){
      yearBuilt = built;
      }
      
   public void setNumPropellars(int propellars){
      numPropellars = propellars; 
      }
      
   public String getName(){
      return name;
      }
      
   public int getYearBuilt(){
      return yearBuilt;
      }
      
   public int getNumPropellars(){
      return numPropellars;
      }
        
   public abstract String toString();
          }
      
      