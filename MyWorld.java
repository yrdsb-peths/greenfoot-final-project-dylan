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
        super(1100, 600, 1);
        countryCreate();
        labelCreate();
    }
    public void countryCreate()
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
        addObject(afw, 369, 358);
        AfricaSouth afs = new AfricaSouth();
        addObject(afs, 434, 479);
        AfricaCenter afc = new AfricaCenter();
        addObject(afc, 434, 398);
        AfricaEast afe = new AfricaEast();
        addObject(afe, 506, 431);
        Madagascar mad = new Madagascar();
        addObject(mad, 532, 509);
        Japan jap = new Japan();
        addObject(jap, 982, 352);
    }
    
    public void labelCreate()
    {
        Label afwLab = new Label("2", 50);
        addObject(afwLab, 372, 343);
        Label useLab = new Label("3", 50);
        addObject(useLab, 148, 152);
        Label uswLab = new Label("2", 50);
        addObject(uswLab, 77, 132);
        Label rueLab = new Label("1", 50);
        addObject(rueLab, 607, 158);
        Label spaLab = new Label("3", 50);
        addObject(spaLab, 397, 256);
        Label yukLab = new Label("5", 50);
        addObject(yukLab, 104, 53);
        Label greLab = new Label("1", 50);
        addObject(greLab, 299, 31);
        Label iceLab = new Label("1", 40);
        addObject(iceLab, 341, 71);
        Label fraLab = new Label("7", 50);
        addObject(fraLab, 421, 192);
        Label gerLab = new Label("5", 50);
        addObject(gerLab, 485, 167);
        Label itaLab = new Label("8", 50);
        addObject(itaLab, 517, 233);
        Label sweLab = new Label("3", 50);
        addObject(sweLab, 531, 67);
        Label uniLab = new Label("4", 50);
        addObject(uniLab, 403, 125);
        Label araLab = new Label("3", 50);
        addObject(araLab, 578, 339);
        Label afnLab = new Label("6", 50);
        addObject(afnLab, 480, 339);
        Label indLab = new Label("4", 50);
        addObject(indLab, 721, 375);
        Label afeLab = new Label("8", 50);
        addObject(afeLab, 500, 419);
        Label afcLab = new Label("2", 50);
        addObject(afcLab, 442, 396);
        Label afsLab = new Label("3", 50);
        addObject(afsLab, 418, 479);
        Label madLab = new Label("6", 50);
        addObject(madLab, 530, 509);
        Label ontLab = new Label("5", 50);
        addObject(ontLab, 209,78);
        Label albLab = new Label("4", 35);
        addObject(albLab, 100, 88);
        Label alaLab = new Label("3", 50);
        addObject(alaLab, 38, 40);
        Label mexLab = new Label("9", 50);
        addObject(mexLab, 74, 196);
    }
}
