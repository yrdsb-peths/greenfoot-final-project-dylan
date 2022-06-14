import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creates the button that starts the game
 * Trophy image from: https://stock.adobe.com/ca/search?k=trophy
 * 
 * @author Dylan Ta 
 * @version June, 2022
 */
public class Play extends Actor
{
    //When clicked game starts
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
