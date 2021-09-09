package com.magazineabstractfactorypattern;



public class MagazineMainClass {
     public static void main(String[] args){
        MagazineFactory lifestyle = new LifestyleMagazine();
        MagazineFactory entertainment = new EntertainmentMagazine();
        
        Magazine magazine = lifestyle.orderMagazine("martha stewart living");
        System.out.println("Reseller 1 ordered " +magazine.getName() + " Magazine.\n");
        
        magazine = entertainment.orderMagazine("people");
        System.out.println("Reseller 2 ordered " +magazine.getName() + " Magazine.\n");
    }
}
