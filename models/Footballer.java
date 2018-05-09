package models;

public abstract class Footballer implements Model
{
      private int footballerID; //bruges til at identificere den enkelte fodboldspiller i forhold til m�l og kampe.
      private int footballerJersey; 
      private String footballerName;  
      private String footballerSalary; 
      private boolean footballerEmployed;
      
      //kontsruktor til Footballers der indl�ses fra fil
      public Footballer(int footballerID, int footballerJersey, String footballerName,String footballerSalary, 
      boolean footballerEmployed)
      {
            this.footballerID = footballerID;
            this.footballerJersey = footballerJersey;
            this.footballerName = footballerName;
            this.footballerSalary = footballerSalary;
            this.footballerEmployed = footballerEmployed;
      }
            
      public int getID()//Kr�ves af interfacet Model
      {
            return footballerID;
      }
      
      public int getFootballerJersey()
      {
            return footballerJersey;
      }
      
      public void setFootballerJersey(int footballerJersey)
      {
            this.footballerJersey = footballerJersey;
      }
      
      public String getFootballerName()
      {
            return footballerName;
      }
      
      public void setFootballerName(String footballerName)
      {
            this.footballerName = footballerName;
      }
            
      public String getFootballerSalary()
      {
            return footballerSalary;
      }
      
      public void setFootballerSalary(String footballerSalary)
      {
            this.footballerSalary = footballerSalary;
      }
      
      public boolean getFootballerEmployed()
      {
            return footballerEmployed;
      }
      
      public void setFootballerEmployed(boolean footballerEmployed)
      {
            this.footballerEmployed = footballerEmployed;
      }
      
      public String toString()
      {
            return footballerJersey + " " + footballerName + " " + footballerSalary + " " + footballerEmployed + " ";
      }

      public abstract String getFootballerPosition(); // alle supclasses skal overskrive denne metode
}