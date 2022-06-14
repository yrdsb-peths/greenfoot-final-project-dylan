import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Create tile for AfricaWest and checks for attacks
 * 
 * @author Dylan Ta
 * @version June, 2022
 */
public class AfricaWest extends Country
{
    //Set object to red player
    public AfricaWest()
    {
        stateAfw = 2;
        setImage("images/AfricaWest/AfricaWest_Red.png");
    }
    //When attacked by an adjacent tile, change colour to match the attacker
    public void act()
    {
        if(MyWorld.tilesTake > 0)
        {
            if(Greenfoot.mouseClicked(this))
            {
                afwClicked = 1;
                //Check for Spain
                if(stateAfw != stateSpa)
                {
                    if(afwClicked == 1 && spaClicked == 1)
                    {
                        if(stateAfw == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/AfricaWest/AfricaWest_Red.png");
                                spaClicked = 0;
                                afwClicked = 0;
                                stateAfw = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/AfricaWest/AfricaWest_Blue.png");
                                spaClicked = 0;
                                afwClicked = 0;
                                stateAfw = 1;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreBlue();
                                world.decreaseTile();
                            }
                        }
                    }
                }
                //Check for AfricaSouth
                if(stateAfw != stateAfs)
                {
                    if(afwClicked == 1 && afsClicked == 1)
                    {
                        if(stateAfw == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/AfricaWest/AfricaWest_Red.png");
                                afsClicked = 0;
                                afwClicked = 0;
                                stateAfw = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/AfricaWest/AfricaWest_Blue.png");
                                afsClicked = 0;
                                afwClicked = 0;
                                stateAfw = 1; 
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreBlue();
                                world.decreaseTile();
                            }
                        }
                    }
                }
                //Check for AfricaCenter
                if(stateAfw != stateAfc)
                {
                    if(afwClicked == 1 && afcClicked == 1)
                    {
                        if(stateAfw == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/AfricaWest/AfricaWest_Red.png");
                                afcClicked = 0;
                                afwClicked = 0;
                                stateAfw = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/AfricaWest/AfricaWest_Blue.png");
                                afcClicked = 0;
                                afwClicked = 0;
                                stateAfw = 1; 
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreBlue();
                                world.decreaseTile();
                            }
                        }
                    }
                }
                //Check for AfricaNorth
                if(stateAfw != stateAfn)
                {
                    if(afwClicked == 1 && afnClicked == 1)
                    {
                        if(stateAfw == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/AfricaWest/AfricaWest_Red.png");
                                afnClicked = 0;
                                afwClicked = 0;
                                stateAfw = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/AfricaWest/AfricaWest_Blue.png");
                                afnClicked = 0;
                                afwClicked = 0;
                                stateAfw = 1; 
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
