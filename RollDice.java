import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Rolls the dice when clicked
 * 
 * @author Dylan Ta
 * @version June, 2022
 */
public class RollDice extends RandomizerDice
{
    //When clicked roll the dice a random number
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
        if(Greenfoot.mouseMoved(this))
        {
            setImage("images/Roll1.png");
        }
        if(Greenfoot.mouseMoved(getWorld()))
        {
            setImage("images/Roll.png");
        }
    }
}
