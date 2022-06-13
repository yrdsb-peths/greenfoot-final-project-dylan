import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends Actor
{
    /**
     * Act - do whatever the Play wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            MyWorld world = new MyWorld();
            Greenfoot.setWorld(world);
        }
        if(Greenfoot.mouseMoved(this))
        {
            setImage("images/Play1.png");
        }
        if(Greenfoot.mouseMoved(getWorld()))
        {
            setImage("images/Play.png");
        }
        MyWorld.redNum = 9;
        MyWorld.blueNum = 10;
        MyWorld.tilesTake = 0;
    }
}
