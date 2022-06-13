import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AfricaCenter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AfricaCenter extends Country
{
    /**
     * Act - do whatever the AfricaCenter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public AfricaCenter()
    {
        stateAfc = 1;
        setImage("images/AfricaCenter/AfricaCenter_Blue.png");
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            afcClicked = 1;
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
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/AfricaCenter/AfricaCenter_Blue.png");
                            afcClicked = 0;
                            afwClicked = 0;
                            stateAfc = 1; 
                        }
                    }
                }
            }
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
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/AfricaCenter/AfricaCenter_Blue.png");
                            afcClicked = 0;
                            afsClicked = 0;
                            stateAfc = 1; 
                        }
                    }
                }
            }
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
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/AfricaCenter/AfricaCenter_Blue.png");
                            afcClicked = 0;
                            afeClicked = 0;
                            stateAfc = 1; 
                        }
                    }
                }
            }
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
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/AfricaCenter/AfricaCenter_Blue.png");
                            afcClicked = 0;
                            afnClicked = 0;
                            stateAfc = 1; 
                        }
                    }
                }
            }
        }
    }
}
