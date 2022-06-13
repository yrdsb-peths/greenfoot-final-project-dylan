import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AfricaNorth here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AfricaNorth extends Country
{
    /**
     * Act - do whatever the AfricaNorth wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public AfricaNorth()
    {
        stateAfn = 1;
        setImage("images/AfricaNorth/AfricaNorth_Blue.png");
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            afnClicked = 1;
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
                        }
                    }
                }
            }
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
                        }
                    }
                }
            }
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
                        }
                    }
                }
            }
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
                        }
                    }
                }
            }
        }
    }
}
