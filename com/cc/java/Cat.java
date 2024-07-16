package com.cc.java;

public class Cat {
  
    // Felder / fields / attributes
    private String name; // pass by reference
    private String furColor;
    private int age;  // pass by value
    

    // Konstruktor ( kein Rückgabetyp)
    public Cat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }



    // Rückgabetyp -- Cat
    public Cat getInstanceVariable(){
        return this;
    }
        //getter
    public String getName() {
        
        if (getPermission()) {
            return name;
        } else {
            return "Sorry, no permission!";
        }
        
        
    }
        // setter
    public void setName(String name) {
        this.name = name;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

public boolean getPermission() {

return true;
// return false;
}






}
