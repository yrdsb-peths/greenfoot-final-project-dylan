import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Winner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Winner extends Actor
{
    /**
     * Act - do whatever the Winner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GameOverWorld world = (GameOverWorld) getWorld();
        if(world.getWinner().equals("Blue"))
        {
            setImage("images/WinnerBlue.png");
        }else{
            setImage("images/WinnerRed.png");
        }
    }
}
