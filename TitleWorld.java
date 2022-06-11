import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleWorld extends World
{

    /**
     * Constructor for objects of class TitleWorld.
     * 
     */
    public TitleWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1);
        GreenfootImage background = new GreenfootImage("images/risk.jpg");
        background.scale(1100, 600);
        setBackground(background);
        Instructions ins = new Instructions();
        addObject(ins, 972, 552);
        Play pla = new Play();
        addObject(pla, 130, 551);
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("space")){
            MenuWorld world = new MenuWorld();
            Greenfoot.setWorld(world);
        }
    }
}
