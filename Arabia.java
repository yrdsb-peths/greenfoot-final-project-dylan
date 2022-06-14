import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Create tile for Arabia and checks for attacks
 * 
 * @author Dylan Ta
 * @version June, 2022
 */
public class Arabia extends Country
{
    //Sets objects to red player
    public Arabia()
    {
        stateAra = 2;
        setImage("images/Arabia/Arabia_Red.png");
    }
    //When attacked by an adjacent tile, change colour to match the attacker
    public void act()
    {
        if(MyWorld.tilesTake > 0)
        {
            if(Greenfoot.mouseClicked(this))
            {
                araClicked = 1;
                //Checks for AfricaNorth
                if(stateAra != stateAfn)
                {
                    if(araClicked == 1 && afnClicked == 1)
                    {
                        if(stateAra == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/Arabia/Arabia_Red.png");
                                araClicked = 0;
                                afnClicked = 0;
                                stateAra = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/Arabia/Arabia_Blue.png");
                                araClicked = 0;
                                afnClicked = 0;
                                stateAra = 1;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreBlue();
                                world.decreaseTile();
                            }
                        }
                    }
                }
                //Checks for CentralAsia
                if(stateAra != stateCea)
                {
                    if(araClicked == 1 && ceaClicked == 1)
                    {
                        if(stateAra == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/Arabia/Arabia_Red.png");
                                araClicked = 0;
                                ceaClicked = 0;
                                stateAra = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/Arabia/Arabia_Blue.png");
                                araClicked = 0;
                                ceaClicked = 0;
                                stateAra = 1;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreBlue();
                                world.decreaseTile();
                            }
                        }
                    }
                }
                //Checks for India
                if(stateAra != stateInd)
                {
                    if(araClicked == 1 && indClicked == 1)
                    {
                        if(stateAra == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/Arabia/Arabia_Red.png");
                                araClicked = 0;
                                indClicked = 0;
                                stateAra = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/Arabia/Arabia_Blue.png");
                                araClicked = 0;
                                indClicked = 0;
                                stateAra = 1;
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
