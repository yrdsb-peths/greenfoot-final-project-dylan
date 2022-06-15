import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * When clicked end the current players turn
 * Sound from: https://www.myinstants.com/en/instant/minecraft-click/ 
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
                Greenfoot.playSound("sounds/minecraft_click.mp3");
                player = 1;
                rolled = 0;
                rand = 0;
                once = 0;
            }else{
                Greenfoot.playSound("sounds/minecraft_click.mp3");
                player = 0;
                once = 0;
                rolled = 0;
                rand = 0;
            }
            MyWorld world = (MyWorld) getWorld();
            world.setTiles(-1);
        }
        if(Greenfoot.mouseMoved(this))
        {
            setImage("images/TurnEnd1.png");
        }
        if(Greenfoot.mouseMoved(getWorld()))
        {
            setImage("images/TurnEnd.png");
        }
    }
}
