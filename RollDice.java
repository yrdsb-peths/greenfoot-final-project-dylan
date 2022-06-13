import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RollDice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RollDice extends RandomizerDice
{
    /**
     * Act - do whatever the RollDice wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            if(rolled == 0 && once == 0)
            {
                rolled = 1;
                rand = Greenfoot.getRandomNumber(18);
                once = 1;
            }
        }
    }
}
