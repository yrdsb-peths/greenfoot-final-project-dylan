import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AfricaWest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AfricaWest extends Country
{
    /**
     * Act - do whatever the AfricaWest wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public AfricaWest()
    {
        stateAfw = 2;
        setImage("images/AfricaWest/AfricaWest_Red.png");
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            afwClicked = 1;
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
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/AfricaWest/AfricaWest_Blue.png");
                            spaClicked = 0;
                            afwClicked = 0;
                            stateAfw = 1; 
                        }
                    }
                }
            }
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
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/AfricaWest/AfricaWest_Blue.png");
                            afsClicked = 0;
                            afwClicked = 0;
                            stateAfw = 1; 
                        }
                    }
                }
            }
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
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/AfricaWest/AfricaWest_Blue.png");
                            afcClicked = 0;
                            afwClicked = 0;
                            stateAfw = 1; 
                        }
                    }
                }
            }
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
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/AfricaWest/AfricaWest_Blue.png");
                            afnClicked = 0;
                            afwClicked = 0;
                            stateAfw = 1; 
                        }
                    }
                }
            }
        }
    }
}
