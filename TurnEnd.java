import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * When clicked end the current players turn
 * 
 * @author Dylan Ta
 * @version June, 2022
 */
public class TurnEnd extends RandomizerDice
{
    //When clicked change player turns
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
            MyWorld world = (MyWorld) getWorld();
            world.setTiles(-1);
        }
    }
}
