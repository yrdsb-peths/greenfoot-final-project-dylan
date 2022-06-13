import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AfricaSouth here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AfricaSouth extends Country
{
    /**
     * Act - do whatever the AfricaSouth wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public AfricaSouth()
    {
        stateAfs = 1;
        setImage("images/AfricaSouth/AfricaSouth_Blue.png");
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            afsClicked = 1;
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
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/AfricaSouth/AfricaSouth_Blue.png");
                            afsClicked = 0;
                            afwClicked = 0;
                            stateAfs = 1; 
                        }
                    }
                }
            }
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
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/AfricaSouth/AfricaSouth_Blue.png");
                            afsClicked = 0;
                            afcClicked = 0;
                            stateAfs = 1; 
                        }
                    }
                }
            }
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
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/AfricaSouth/AfricaSouth_Blue.png");
                            afsClicked = 0;
                            afeClicked = 0;
                            stateAfs = 1; 
                        }
                    }
                }
            }
        }
    }
}
