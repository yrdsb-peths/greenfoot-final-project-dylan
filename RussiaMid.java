import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Create tile for RussiaMid and checks for attacks
 * 
 * @author Dylan Ta
 * @version June, 2022
 */
public class RussiaMid extends Country
{
    //Set object to blue player
    public RussiaMid()
    {
        stateRum = 1;
        setImage("images/RussiaMid/RussiaMid_Blue.png");
    }
    //When attacked by an adjacent tile, change colour to match the attacker
    public void act()
    {
        if(MyWorld.tilesTake > 0)
        {
            if(Greenfoot.mouseClicked(this))
            {
                rumClicked = 1;
                //Check for RussiaWest
                if(stateRum != stateRuw)
                {
                    if(rumClicked == 1 && ruwClicked == 1)
                    {
                        if(stateRum == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/RussiaMid/RussiaMid_Red.png");
                                rumClicked = 0;
                                ruwClicked = 0;
                                stateRum = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/RussiaMid/RussiaMid_Blue.png");
                                rumClicked = 0;
                                ruwClicked = 0;
                                stateRum = 1; 
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreBlue();
                                world.decreaseTile();
                            }
                        }
                    }
                }
                //Check for CentralAsia
                if(stateRum != stateCea)
                {
                    if(rumClicked == 1 && ceaClicked == 1)
                    {
                        if(stateRum == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/RussiaMid/RussiaMid_Red.png");
                                rumClicked = 0;
                                ceaClicked = 0;
                                stateRum = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/RussiaMid/RussiaMid_Blue.png");
                                rumClicked = 0;
                                ceaClicked = 0;
                                stateRum = 1; 
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreBlue();
                                world.decreaseTile();
                            }
                        }
                    }
                }
                //Check for RussiaEast
                if(stateRum != stateRue)
                {
                    if(rumClicked == 1 && rueClicked == 1)
                    {
                        if(stateRum == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/RussiaMid/RussiaMid_Red.png");
                                rumClicked = 0;
                                rueClicked = 0;
                                stateRum = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/RussiaMid/RussiaMid_Blue.png");
                                rumClicked = 0;
                                rueClicked = 0;
                                stateRum = 1; 
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreBlue();
                                world.decreaseTile();
                            }
                        }
                    }
                }
                //Check for China
                if(stateRum != stateChi)
                {
                    if(rumClicked == 1 && chiClicked == 1)
                    {
                        if(stateRum == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/RussiaMid/RussiaMid_Red.png");
                                rumClicked = 0;
                                chiClicked = 0;
                                stateRum = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/RussiaMid/RussiaMid_Blue.png");
                                rumClicked = 0;
                                chiClicked = 0;
                                stateRum = 1; 
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreBlue();
                                world.decreaseTile();
                            }
                        }
                    }
                }
            }
        }
    }
}
