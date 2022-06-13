import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class backButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackButton extends Actor
{
    /**
     * Act - do whatever the backButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
            TitleWorld world = new TitleWorld();
            Greenfoot.setWorld(world);
        }
    }
}
