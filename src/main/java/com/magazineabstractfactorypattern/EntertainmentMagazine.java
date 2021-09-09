package com.magazineabstractfactorypattern;



public class EntertainmentMagazine extends MagazineFactory {
    @Override
    protected Magazine publishMagazine(String name) {
        if(name.equals("vanity fair")){
          return new VanityFairMag();
         } else if (name.equals("us weekly")){
             return new UsWeeklyMag();
         } else if(name.equals("people")){
             return new PeopleMag();
         } else if(name.endsWith("in touch")){
             return new InTouchMag();
         } else return null;
    }
}
