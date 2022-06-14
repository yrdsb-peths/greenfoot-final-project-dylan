import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Create tile for CentralAsia and checks for attacks
 * 
 * @author Dylan Ta
 * @version June, 2022
 */
public class CentralAsia extends Country
{
    //Sets object to blue player
    public CentralAsia()
    {
        stateCea = 1;
        setImage("images/CentralAsia/CentralAsia_Blue.png");
    }
    //When attacked by an adjacent tile, change colour to match the attacker
    public void act()
    {
        if(MyWorld.tilesTake > 0)
        {
            if(Greenfoot.mouseClicked(this))
            {
                ceaClicked = 1;
                //Check for Arabia
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
                //Check for RussiaWest
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
                //Checks for India
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
                //Checks for RussiaMid
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
                //Checks for China
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
}
