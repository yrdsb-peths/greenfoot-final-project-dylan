import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Shows which players turn it is
 * 
 * @author Dylan Ta
 * @version June, 2022
 */
public class Indicate extends Country
{
    //Set object to red player
    public Indicate()
    {
        setImage("images/Red.png");
    }
    //Change colour based on player state
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
