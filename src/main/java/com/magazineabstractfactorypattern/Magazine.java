package com.magazineabstractfactorypattern;



public abstract class Magazine {
    String name;
    double price;
    
    void PreparingContent(){
         System.out.println("Preparing content for: "+ name+" Magazine.");
         
         System.out.println("Price of "+name+" is $"+price);
     }
     
     void printing(){
         System.out.println("Printing the "+name+ " Magazine.");
     }
     
     void distributing(){
         System.out.println("Distributing "+name+" Magazine.");
     }
     
     public String getName(){
         return name;
     }
}
