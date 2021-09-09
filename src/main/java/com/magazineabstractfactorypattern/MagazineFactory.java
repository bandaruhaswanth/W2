package com.magazineabstractfactorypattern;



public abstract class MagazineFactory {
    public Magazine orderMagazine(String type){
        Magazine magazine;
        magazine = publishMagazine(type);
        magazine.PreparingContent();
        magazine.printing();
        magazine.distributing();
        
        return magazine;
    }
    
    protected abstract Magazine publishMagazine(String type);
}
