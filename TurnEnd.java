import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TurnEnd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TurnEnd extends RandomizerDice
{
    /**
     * Act - do whatever the TurnEnd wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            if(player == 0)
            {
                player = 1;
                rolled = 0;
                rand = 0;
                once = 0;
            }else{
                player = 0;
                once = 0;
                rolled = 0;
                rand = 0;
            }

        }
    }
}
