import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Button return from instructions to title world
 * Sound from: https://www.myinstants.com/en/instant/minecraft-click/ 
 * 
 * @author Dylan Ta 
 * @version June, 2022
 */
public class BackButton extends Actor
{
    //Return to TitleWorld
    public void act()
    {
        if(Greenfoot.mouseMoved(this))
        {
            setImage("images/back_button1.png");
        }
        if(Greenfoot.mouseMoved(getWorld()))
        {
            setImage("images/back_button.png");
        }
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("sounds/minecraft_click.mp3");
            TitleWorld world = new TitleWorld();
            Greenfoot.setWorld(world);
        }
    }
}
