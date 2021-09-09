package com.magazineabstractfactorypattern;



public class HomeGardenMagazine extends MagazineFactory{

    @Override
    protected Magazine publishMagazine(String name) {
        if(name.equals("southern living")){
          return new SouthernLivingMag();
         } else if (name.equals("real simple")){
             return new RealSimpleMag();
         } else if(name.equals("hgtv magazine")){
             return new HGTVMag();
         } else if(name.endsWith("garden and sun")){
             return new GardenSunMag();
         } else return null;
    }
    
}
