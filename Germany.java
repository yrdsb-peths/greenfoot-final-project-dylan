import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Germany here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Germany extends Country
{
    /**
     * Act - do whatever the Germany wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Germany()
    {
        setImage("images/Germany/Germany_Blue.png");
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            gerClicked = 1;
            if(fraClicked == 1)
            {
                MyWorld world = (MyWorld) getWorld();
                //world.attack();
            }
        }
    }
}
