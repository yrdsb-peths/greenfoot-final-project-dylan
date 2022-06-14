import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creates the tile of AfricaCenter and checks for attacks
 * 
 * @author Dylan Ta
 * @version June, 2022
 */
public class AfricaCenter extends Country
{
    //Sets object to blue player
    public AfricaCenter()
    {
        stateAfc = 1;
        setImage("images/AfricaCenter/AfricaCenter_Blue.png");
    }
    
    //When attacked by an adjacent tile, change colour to match the attacker
    public void act()
    {
        if(MyWorld.tilesTake > 0)
        {
            if(Greenfoot.mouseClicked(this))
            {
                afcClicked = 1;
                //Checks for AfricaWest
                if(stateAfc != stateAfw)
                {
                    if(afwClicked == 1 && afcClicked == 1)
                    {
                        if(stateAfc == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/AfricaCenter/AfricaCenter_Red.png");
                                afwClicked = 0;
                                afcClicked = 0;
                                stateAfc = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/AfricaCenter/AfricaCenter_Blue.png");
                                afcClicked = 0;
                                afwClicked = 0;
                                stateAfc = 1; 
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreBlue();
                                world.decreaseTile();
                            }
                        }
                    }
                }
                //Checks for AfricaSouth
                if(stateAfc != stateAfs)
                {
                    if(afsClicked == 1 && afcClicked == 1)
                    {
                        if(stateAfc == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/AfricaCenter/AfricaCenter_Red.png");
                                afsClicked = 0;
                                afcClicked = 0;
                                stateAfc = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/AfricaCenter/AfricaCenter_Blue.png");
                                afcClicked = 0;
                                afsClicked = 0;
                                stateAfc = 1;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreBlue();
                                world.decreaseTile();
                            }
                        }
                    }
                }
                //Checks for AfricaEast
                if(stateAfc != stateAfe)
                {
                    if(afeClicked == 1 && afcClicked == 1)
                    {
                        if(stateAfc == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/AfricaCenter/AfricaCenter_Red.png");
                                afeClicked = 0;
                                afcClicked = 0;
                                stateAfc = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/AfricaCenter/AfricaCenter_Blue.png");
                                afcClicked = 0;
                                afeClicked = 0;
                                stateAfc = 1;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreBlue();
                                world.decreaseTile();
                            }
                        }
                    }
                }
                //Checks for AfricaNorth
                if(stateAfc != stateAfn)
                {
                    if(afnClicked == 1 && afcClicked == 1)
                    {
                        if(stateAfc == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/AfricaCenter/AfricaCenter_Red.png");
                                afnClicked = 0;
                                afcClicked = 0;
                                stateAfc = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/AfricaCenter/AfricaCenter_Blue.png");
                                afcClicked = 0;
                                afnClicked = 0;
                                stateAfc = 1;
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
