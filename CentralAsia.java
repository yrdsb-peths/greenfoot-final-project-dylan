import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CentralAsia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CentralAsia extends Country
{
    /**
     * Act - do whatever the CentralAsia wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public CentralAsia()
    {
        stateCea = 1;
        setImage("images/CentralAsia/CentralAsia_Blue.png");
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            ceaClicked = 1;
            if(stateCea != stateAra)
            {
                if(ceaClicked == 1 && araClicked == 1)
                {
                    if(stateCea == 1)
                    {
                        if(player == 0)
                        {
                            setImage("images/CentralAsia/CentralAsia_Red.png");
                            araClicked = 0;
                            ceaClicked = 0;
                            stateCea = 0;
                            MyWorld world = (MyWorld) getWorld();
                            world.increaseScoreRed();
                            world.decreaseTile();
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/CentralAsia/CentralAsia_Blue.png");
                            araClicked = 0;
                            ceaClicked = 0;
                            stateCea = 1;
                            MyWorld world = (MyWorld) getWorld();
                            world.increaseScoreBlue();
                            world.decreaseTile();
                        }
                    }
                }
            }
            if(stateCea != stateRuw)
            {
                if(ceaClicked == 1 && ruwClicked == 1)
                {
                    if(stateCea == 1)
                    {
                        if(player == 0)
                        {
                            setImage("images/CentralAsia/CentralAsia_Red.png");
                            ruwClicked = 0;
                            ceaClicked = 0;
                            stateCea = 0;
                            MyWorld world = (MyWorld) getWorld();
                            world.increaseScoreRed();
                            world.decreaseTile();
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/CentralAsia/CentralAsia_Blue.png");
                            ruwClicked = 0;
                            ceaClicked = 0;
                            stateCea = 1;
                            MyWorld world = (MyWorld) getWorld();
                            world.increaseScoreBlue();
                            world.decreaseTile();
                        }
                    }
                }
            }
            if(stateCea != stateInd)
            {
                if(ceaClicked == 1 && indClicked == 1)
                {
                    if(stateCea == 1)
                    {
                        if(player == 0)
                        {
                            setImage("images/CentralAsia/CentralAsia_Red.png");
                            indClicked = 0;
                            ceaClicked = 0;
                            stateCea = 0;
                            MyWorld world = (MyWorld) getWorld();
                            world.increaseScoreRed();
                            world.decreaseTile();
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/CentralAsia/CentralAsia_Blue.png");
                            indClicked = 0;
                            ceaClicked = 0;
                            stateCea = 1;
                            MyWorld world = (MyWorld) getWorld();
                            world.increaseScoreBlue();
                            world.decreaseTile();
                        }
                    }
                }
            }
            if(stateCea != stateRum)
            {
                if(rumClicked == 1 && ceaClicked == 1)
                {
                    if(stateCea == 1)
                    {
                        if(player == 0)
                        {
                            setImage("images/CentralAsia/CentralAsia_Red.png");
                            rumClicked = 0;
                            ceaClicked = 0;
                            stateCea = 0;
                            MyWorld world = (MyWorld) getWorld();
                            world.increaseScoreRed();
                            world.decreaseTile();
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/CentralAsia/CentralAsia_Blue.png");
                            rumClicked = 0;
                            ceaClicked = 0;
                            stateCea = 1;
                            MyWorld world = (MyWorld) getWorld();
                            world.increaseScoreBlue();
                            world.decreaseTile();
                        }
                    }
                }
            }
            if(stateCea != stateChi)
            {
                if(chiClicked == 1 && ceaClicked == 1)
                {
                    if(stateCea == 1)
                    {
                        if(player == 0)
                        {
                            setImage("images/CentralAsia/CentralAsia_Red.png");
                            chiClicked = 0;
                            ceaClicked = 0;
                            stateCea = 0;
                            MyWorld world = (MyWorld) getWorld();
                            world.increaseScoreRed();
                            world.decreaseTile();
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/CentralAsia/CentralAsia_Blue.png");
                            chiClicked = 0;
                            ceaClicked = 0;
                            stateCea = 1;
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
