import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RollButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RollButton extends RandomizedDice
{
    /**
     * Act - do whatever the RollButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public RollButton()
    {
                
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            if(rolled == 0)
            {
                rolled = 1;
                rand = Greenfoot.getRandomNumber(18);
            }
        }
    }
}
