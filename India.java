import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Create tile for India and checks for attacks
 * 
 * @author Dylan Ta
 * @version June, 2022
 */
public class India extends Country
{
    //Sets object to red player
    public India()
    {
        stateInd = 2;
        setImage("images/India/India_Red.png");
    }
    //When attacked by an adjacent tile, change colour to match the attacker
    public void act()
    {
        if(MyWorld.tilesTake > 0)
        {
            if(Greenfoot.mouseClicked(this))
            {
                indClicked = 1;
                //Check for Arabia
                if(stateInd != stateAra)
                {
                    if(indClicked == 1 && araClicked == 1)
                    {
                        if(stateInd == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/India/India_Red.png");
                                araClicked = 0;
                                indClicked = 0;
                                stateInd = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/India/India_Blue.png");
                                araClicked = 0;
                                indClicked = 0;
                                stateInd = 1;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreBlue();
                                world.decreaseTile();
                            }
                        }
                    }
                }
                //Check for CentralAsia
                if(stateInd != stateCea)
                {
                    if(indClicked == 1 && ceaClicked == 1)
                    {
                        if(stateInd == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/India/India_Red.png");
                                ceaClicked = 0;
                                indClicked = 0;
                                stateInd = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/India/India_Blue.png");
                                ceaClicked = 0;
                                indClicked = 0;
                                stateInd = 1;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreBlue();
                                world.decreaseTile();
                            }
                        }
                    }
                }
                //Check for China
                if(stateInd != stateChi)
                {
                    if(indClicked == 1 && chiClicked == 1)
                    {
                        if(stateInd == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/India/India_Red.png");
                                chiClicked = 0;
                                indClicked = 0;
                                stateInd = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/India/India_Blue.png");
                                chiClicked = 0;
                                indClicked = 0;
                                stateInd = 1;
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
