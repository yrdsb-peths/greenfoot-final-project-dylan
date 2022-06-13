import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RussiaMid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RussiaMid extends Country
{
    /**
     * Act - do whatever the RussiaMid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public RussiaMid()
    {
        stateRum = 1;
        setImage("images/RussiaMid/RussiaMid_Blue.png");
    }

    public void act()
    {
        if(MyWorld.tilesTake > 0)
        {
            if(Greenfoot.mouseClicked(this))
            {
                rumClicked = 1;
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
