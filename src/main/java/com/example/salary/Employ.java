package com.example.salary;

public class Employ {
    String fName;
    String lName;
    int employId;
    // let`s create a constructor her
    public Employ(String fName, String lName, int employId) {
     this.fName=fName;
     this.lName=lName;
     this.employId=employId;
    }
   public Employ() {

   }

    // getter for the employ;
     public String getfName() {
       return fName;
     }
     public String getlName() {
         return lName;
     }
     public int getEmployId() {
         return employId;
     }
     // setter
    public void setfName(String fName) {
         this.fName=fName;
    }
    public void setlName(String lName) {
         this.lName=lName;
    }
    public void setEmployId( int employId) {
         this.employId=employId;
    }


}
