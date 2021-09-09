package com.magazineabstractfactorypattern;



public class LifestyleMagazine extends MagazineFactory{
    @Override
    protected Magazine publishMagazine(String name) {
        if(name.equals("pioneer woman")){
          return new PioneerWomanMag();
         } else if (name.equals("southern living")){
             return new SouthernLivingMag();
         } else if(name.equals("real simple")){
             return new RealSimpleMag();
         } else if(name.endsWith("martha stewart living")){
             return new MarthaLivingMag();
         } else return null;
    }
}
