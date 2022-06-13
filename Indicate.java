import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Indicate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Indicate extends Country
{
    /**
     * Act - do whatever the Indicate wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(player == 0)
        {
            setImage("images/Red.png");
        }
        if(player == 1)
        {
            setImage("images/Blue.png");
        }
    }
}
