import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creates tile for AfricaSouth and checks for attacks
 * 
 * @author Dylan Ta
 * @version June, 2022
 */
public class AfricaSouth extends Country
{
    //Set object to blue player
    public AfricaSouth()
    {
        stateAfs = 1;
        setImage("images/AfricaSouth/AfricaSouth_Blue.png");
    }
    //When attacked by an adjacent tile, change colour to match the attacker
    public void act()
    {
        if(MyWorld.tilesTake > 0)
        {
            if(Greenfoot.mouseClicked(this))
            {
                afsClicked = 1;
                //Check for AfricaWest
                if(stateAfs != stateAfw)
                {
                    if(afwClicked == 1 && afsClicked == 1)
                    {
                        if(stateAfs == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/AfricaSouth/AfricaSouth_Red.png");
                                afwClicked = 0;
                                afsClicked = 0;
                                stateAfs = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/AfricaSouth/AfricaSouth_Blue.png");
                                afsClicked = 0;
                                afwClicked = 0;
                                stateAfs = 1;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreBlue();
                                world.decreaseTile();

                            }
                        }
                    }
                }
                //Check for AfricaCenter
                if(stateAfs != stateAfc)
                {
                    if(afcClicked == 1 && afsClicked == 1)
                    {
                        if(stateAfs == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/AfricaSouth/AfricaSouth_Red.png");
                                afcClicked = 0;
                                afsClicked = 0;
                                stateAfs = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/AfricaSouth/AfricaSouth_Blue.png");
                                afsClicked = 0;
                                afcClicked = 0;
                                stateAfs = 1;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreBlue();
                                world.decreaseTile();
                            }
                        }
                    }
                }
                //Check for AfricaEast
                if(stateAfs != stateAfe)
                {
                    if(afeClicked == 1 && afsClicked == 1)
                    {
                        if(stateAfs == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/AfricaSouth/AfricaSouth_Red.png");
                                afeClicked = 0;
                                afsClicked = 0;
                                stateAfs = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/AfricaSouth/AfricaSouth_Blue.png");
                                afsClicked = 0;
                                afeClicked = 0;
                                stateAfs = 1; 
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
