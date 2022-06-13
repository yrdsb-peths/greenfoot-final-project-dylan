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
    public int counter = 0;
    public MyWorld()
    {    
        // Create a new world with 1100x600 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1);
        countryCreate();
        RollButton roll = new RollButton();
        addObject(roll, 63, 154);
        Dice die = new Dice();
        addObject(die, 59, 60);
        //labelCreate();
    }
    
    public void countryCreate()
    {
        UK uni = new UK();
        addObject(uni, 390, 115);
        France fra = new France();
        addObject(fra,420 ,194);
        Germany ger = new Germany();
        addObject(ger, 486, 166);
        Spain spa = new Spain();
        addObject(spa, 399, 262);
        Italy ita = new Italy();
        addObject(ita, 500, 241);
        RussiaEast rue = new RussiaEast();
        addObject(rue,954, 185);
        Sweden swe = new Sweden();
        addObject(swe, 539, 86);
        RussiaMid rum = new RussiaMid();
        addObject(rum, 766,172);  
        RussiaWest ruw = new RussiaWest();
        addObject(ruw, 624, 190);
        China chi = new China();
        addObject(chi, 869, 301);
        CentralAsia cea = new CentralAsia();
        addObject(cea, 703, 271);
        Arabia ara = new Arabia();
        addObject(ara, 586, 350);
        AfricaNorth afn = new AfricaNorth();
        addObject(afn, 476, 341);
        Thailand tha = new Thailand();
        addObject(tha, 849, 423);
        India ind = new India();
        addObject(ind, 718, 377);
        AfricaWest afw = new AfricaWest();
        addObject(afw, 369, 358);
        AfricaSouth afs = new AfricaSouth();
        addObject(afs, 434, 479);
        AfricaCenter afc = new AfricaCenter();
        addObject(afc, 434, 398);
        AfricaEast afe = new AfricaEast();
        addObject(afe, 506, 431);
    }
    
    public void labelCreate()
    {
        int size = 25;
        int fraTroop = 0;
        int gerTroop = 0;
        Label afwLab = new Label("1", size);
        addObject(afwLab, 372, 343);
        Label ruwLab = new Label("1", size);
        addObject(ruwLab, 607, 158);
        Label spaLab = new Label("1", size);
        addObject(spaLab, 397, 256);
        Label fraLab = new Label("1", size);
        addObject(fraLab, 421, 192);
        Label gerLab = new Label("1", size);
        addObject(gerLab, 485, 167);
        Label itaLab = new Label("1", size);
        addObject(itaLab, 517, 233);
        Label sweLab = new Label("1", size);
        addObject(sweLab, 531, 67);
        Label uniLab = new Label("1", size);
        addObject(uniLab, 393, 123);
        Label araLab = new Label("1", size);
        addObject(araLab, 578, 339);
        Label afnLab = new Label("1", size);
        addObject(afnLab, 480, 339);
        Label indLab = new Label("1", size);
        addObject(indLab, 721, 375);
        Label afeLab = new Label("1", size);
        addObject(afeLab, 500, 419);
        Label afcLab = new Label("1", size);
        addObject(afcLab, 442, 396);
        Label afsLab = new Label("1", size);
        addObject(afsLab, 418, 479);
        Label rumLab = new Label("1", size);
        addObject(rumLab, 757, 155);
        Label rueLab = new Label("1", size);
        addObject(rueLab, 919, 185);
        Label ceaLab = new Label("1", size);
        addObject(ceaLab, 715, 271);
        Label thaLab = new Label("1", size);
        addObject(thaLab, 848, 404);
        Label chiLab = new Label("1", size);
        addObject(chiLab, 854, 319);
    }
}
