import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 700x500 cells with a cell size of 1x1 pixels.
        super(1200, 600, 1);
        CountryCreate();
    }
    public void CountryCreate()
    {
        Yukon yuk = new Yukon();
        addObject(yuk, 105, 56);
        Alaska ala = new Alaska();
        addObject(ala, 40, 50);
        Alberta alb = new Alberta();
        addObject(alb, 105, 90);
        Ontario ont = new Ontario();
        addObject(ont, 198, 90);
        USEast use = new USEast();
        addObject(use, 150, 164);
        USWest usw = new USWest();
        addObject(usw, 84, 138);
        Mexico mex = new Mexico();
        addObject(mex, 76, 205);
        Columbia col = new Columbia();
        addObject(col, 131, 256);
        Brazil bra = new Brazil();
        addObject(bra, 168, 328);
        Peru per = new Peru();
        addObject(per, 110, 327);
        Argentina arg = new Argentina();
        addObject(arg, 130, 399);
        Greenland gre = new Greenland();
        addObject(gre, 297, 42);
        Iceland ice = new Iceland();
        addObject(ice, 345 ,72);
        UK uni = new UK();
        addObject(uni, 400, 122);
        France fra = new France();
        addObject(fra,420 ,194);
        Germany ger = new Germany();
        addObject(ger, 486, 166);
        Spain spa = new Spain();
        addObject(spa, 399, 262);
        Italy ita = new Italy();
        addObject(ita, 500, 241);
        RussiaEast rue = new RussiaEast();
        addObject(rue, 603, 166);
        Sweden swe = new Sweden();
        addObject(swe, 539, 86);
        RussiaMid rum = new RussiaMid();
        addObject(rum, 766,161);  
        RussiaWest ruw = new RussiaWest();
        addObject(ruw, 949, 200);
        China chi = new China();
        addObject(chi, 869, 301);
        CentralAsia cea = new CentralAsia();
        addObject(cea, 703, 271);
        Arabia ara = new Arabia();
        addObject(ara, 585, 317);
        AfricaNorth afn = new AfricaNorth();
        addObject(afn, 476, 341);
        Thailand tha = new Thailand();
        addObject(tha, 849, 423);
        India ind = new India();
        addObject(ind, 718, 377);
        AustraliaWest auw = new AustraliaWest();
        addObject(auw, 800, 527);
        AustraliaEast aue = new AustraliaEast();
        addObject(aue,854, 530);
        AfricaWest afw = new AfricaWest();
        addObject(afw, 361, 368);
        AfricaSouth afs = new AfricaSouth();
        addObject(afs, 434, 479);
        AfricaCenter afc = new AfricaCenter();
        addObject(afc, 434, 398);
        AfricaEast afe = new AfricaEast();
        addObject(afe, 506, 431);
    }
}
