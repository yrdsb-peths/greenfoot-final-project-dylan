import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class France here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class France extends Country
{
    /**
     * Act - do whatever the France wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public France()
    {
        setImage("images/France/France_Purple.png");
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            fraClicked = 1;
        }
    }
}
