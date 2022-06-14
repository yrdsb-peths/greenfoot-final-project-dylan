import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Displays the winning player
 * 
 * @author Dylan Ta 
 * @version June, 2022
 */
public class Winner extends Actor
{
    //Shows the winning player
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
