import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title screen that is shown when starting the game
 * Image from: https://store.steampowered.com/app/1128810/RISK_Global_Domination/
 * 
 * @author Dylan Ta
 * @version June, 2022
 */
public class TitleWorld extends World
{

    /**
     * Constructor for objects of class TitleWorld.
     * 
     */
    public TitleWorld()
    {    
        // Create a new world with 1100x600 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1);
        GreenfootImage background = new GreenfootImage("images/risk.jpg");
        background.scale(1100, 600);
        setBackground(background);
        Instructions ins = new Instructions();
        addObject(ins, 972, 552);
        Play pla = new Play();
        addObject(pla, 130, 551);
    }
}
