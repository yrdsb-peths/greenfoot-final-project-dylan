import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creates button to read instructions
 * Sound from: https://www.myinstants.com/en/instant/minecraft-click/ 
 * 
 * @author Dylan Ta 
 * @version June, 2022
 */
public class Instructions extends Actor
{
    //When clicked show instructions
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("sounds/minecraft_click.mp3");
            MenuWorld world = new MenuWorld();
            Greenfoot.setWorld(world);
        }
        if(Greenfoot.mouseMoved(this))
        {
            setImage("images/Instructions1.png");
        }
        if(Greenfoot.mouseMoved(getWorld()))
        {
            setImage("images/Instructions.png");
        }
    }
}
