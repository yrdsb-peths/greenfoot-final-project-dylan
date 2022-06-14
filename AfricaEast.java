import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creates the tile of AfricaEast and checks for attacks
 * 
 * @author Dylan Ta
 * @version June, 2022
 */
public class AfricaEast extends Country
{
    //Sets object to red player
    public AfricaEast()
    {
        stateAfe = 2;
        setImage("images/AfricaEast/AfricaEast_Red.png");
    }
    //When attacked by an adjacent tile, change colour to match the attacker
    public void act()
    {
        if(MyWorld.tilesTake > 0)
        {
            if(Greenfoot.mouseClicked(this))
            {
                afeClicked = 1;
                //Checks for AfricaCenter
                if(stateAfe != stateAfc)
                {
                    if(afeClicked == 1 && afcClicked == 1)
                    {
                        if(stateAfe == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/AfricaEast/AfricaEast_Red.png");
                                afeClicked = 0;
                                afcClicked = 0;
                                stateAfe = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/AfricaEast/AfricaEast_Blue.png");
                                afcClicked = 0;
                                afeClicked = 0;
                                stateAfe = 1; 
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreBlue();
                                world.decreaseTile();
                            }
                        }
                    }
                }
                //Checks for AfricaSouth
                if(stateAfe != stateAfs)
                {
                    if(afeClicked == 1 && afsClicked == 1)
                    {
                        if(stateAfe == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/AfricaEast/AfricaEast_Red.png");
                                afeClicked = 0;
                                afsClicked = 0;
                                stateAfe = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/AfricaEast/AfricaEast_Blue.png");
                                afsClicked = 0;
                                afeClicked = 0;
                                stateAfe = 1; 
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreBlue();
                                world.decreaseTile();
                            }
                        }
                    }
                }
                //Checks for AfricaNorth
                if(stateAfe != stateAfn)
                {
                    if(afeClicked == 1 && afnClicked == 1)
                    {
                        if(stateAfe == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/AfricaEast/AfricaEast_Red.png");
                                afeClicked = 0;
                                afnClicked = 0;
                                stateAfe = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/AfricaEast/AfricaEast_Blue.png");
                                afnClicked = 0;
                                afeClicked = 0;
                                stateAfe = 1;
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
