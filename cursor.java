import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cursor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cursor extends Actor
{
    /**
     * Act - do whatever the cursor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int x = getX();
        int y = getY();
        if(Greenfoot.isKeyDown("a")){
            move(-7);
        }
        if(Greenfoot.isKeyDown("d")){
            move(7);
        }
        if(Greenfoot.isKeyDown("w")){
            setLocation(x, y - 7);
        }
        if(Greenfoot.isKeyDown("s")){
            setLocation(x, y + 7);
        }
    }
}
