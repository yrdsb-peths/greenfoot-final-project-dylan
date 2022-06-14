import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creates tile for AfricaNorth and checks for attacks
 * 
 * @author Dylan Ta
 * @version June, 2022
 */
public class AfricaNorth extends Country
{
    //Sets object to blue player
    public AfricaNorth()
    {
        stateAfn = 1;
        setImage("images/AfricaNorth/AfricaNorth_Blue.png");
    }
    //When attacked by an adjacent tile, change colour to match the attacker
    public void act()
    {
        if(MyWorld.tilesTake > 0)
        {
            if(Greenfoot.mouseClicked(this))
            {
                afnClicked = 1;
                //Check for AfricaCenter
                if(stateAfn != stateAfc)
                {
                    if(afnClicked == 1 && afcClicked == 1)
                    {
                        if(stateAfn == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/AfricaNorth/AfricaNorth_Red.png");
                                afnClicked = 0;
                                afcClicked = 0;
                                stateAfn = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/AfricaNorth/AfricaNorth_Blue.png");
                                afcClicked = 0;
                                afnClicked = 0;
                                stateAfn = 1;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreBlue();
                                world.decreaseTile();
                            }
                        }
                    }
                }
                //Check for AfricaWest
                if(stateAfn != stateAfw)
                {
                    if(afnClicked == 1 && afwClicked == 1)
                    {
                        if(stateAfn == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/AfricaNorth/AfricaNorth_Red.png");
                                afnClicked = 0;
                                afwClicked = 0;
                                stateAfn = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/AfricaNorth/AfricaNorth_Blue.png");
                                afwClicked = 0;
                                afnClicked = 0;
                                stateAfn = 1;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreBlue();
                                world.decreaseTile();
                            }
                        }
                    }
                }
                //Check for AfricaEast
                if(stateAfn != stateAfe)
                {
                    if(afnClicked == 1 && afeClicked == 1)
                    {
                        if(stateAfn == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/AfricaNorth/AfricaNorth_Red.png");
                                afnClicked = 0;
                                afeClicked = 0;
                                stateAfn = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/AfricaNorth/AfricaNorth_Blue.png");
                                afeClicked = 0;
                                afnClicked = 0;
                                stateAfn = 1; 
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreBlue();
                                world.decreaseTile();
                            }
                        }
                    }
                }
                //Checks for Arabia
                if(stateAfn != stateAra)
                {
                    if(afnClicked == 1 && araClicked == 1)
                    {
                        if(stateAfn == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/AfricaNorth/AfricaNorth_Red.png");
                                afnClicked = 0;
                                araClicked = 0;
                                stateAfn = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/AfricaNorth/AfricaNorth_Blue.png");
                                araClicked = 0;
                                afnClicked = 0;
                                stateAfn = 1; 
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
