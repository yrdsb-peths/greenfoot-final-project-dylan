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
    static int blueNum = 10;
    static int redNum = 9;
    public int once = 0;
    public int tilesTake = 0;
    public Label player1 = new Label(blueNum, 50);
    public Label player2 = new Label(redNum, 50);
    public Label tiles = new Label(tilesTake, 50);
    public MyWorld()
    {    
        // Create a new world with 1100x600 cells with a cell size of 1x1 urnpixels.
        super(1100, 600, 1);
        blueNum = 10;
        redNum = 9;
        countryCreate();
        RollDice roll = new RollDice();
        addObject(roll, 63, 154);
        Die die1 = new Die();
        addObject(die1, 59, 60);
        labelCreate();
        Indicate inc = new Indicate();
        addObject(inc, 85, 514);
        TurnEnd ture = new TurnEnd();
        addObject(ture, 1007, 545);
        addObject(tiles, 140, 64);
    }

    public void act()
    {
        if(blueNum == 19 || redNum == 19)
        {
            GameOverWorld world = new GameOverWorld();
            Greenfoot.setWorld(world);
        }
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
        Label p1 = new Label("Blue:", 50);
        Label p2 = new Label("Red:", 50);
        Label turn = new Label("Turn:", 50);
        addObject(player1, 130, 232);
        addObject(player2, 121, 269);
        addObject(p1, 50, 232);
        addObject(p2, 45, 268);
        addObject(turn, 53, 414);
    }

    public void increaseScoreBlue()
    {
        blueNum++;
        redNum--;
        player1.setValue(blueNum);
        player2.setValue(redNum);
    }

    public void increaseScoreRed()
    {
        redNum++;
        blueNum--;
        player1.setValue(blueNum);
        player2.setValue(redNum);
    }

    public void setTiles(int x)
    {
        tilesTake = x;
        if(x == 0)
        {
            tilesTake = 6;
        }
        tiles.setValue(tilesTake);
    }

    public void decreaseTile()
    {
        tilesTake--;
        tiles.setValue(tilesTake);
    }
    public String giveWinner()
    {
        if(redNum == 19)
        {
            return "Red";
        }
        if(blueNum == 19)
        {
            return "Blue";
        }
        return null;
    }
}
