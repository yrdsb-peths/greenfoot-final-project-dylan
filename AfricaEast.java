import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AfricaEast here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AfricaEast extends Country
{
    /**
     * Act - do whatever the AfricaEast wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public AfricaEast()
    {
        stateAfe = 2;
        setImage("images/AfricaEast/AfricaEast_Red.png");
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            afeClicked = 1;
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
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/AfricaEast/AfricaEast_Blue.png");
                            afcClicked = 0;
                            afeClicked = 0;
                            stateAfe = 1; 
                        }
                    }
                }
            }
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
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/AfricaEast/AfricaEast_Blue.png");
                            afsClicked = 0;
                            afeClicked = 0;
                            stateAfe = 1; 
                        }
                    }
                }
            }
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
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/AfricaEast/AfricaEast_Blue.png");
                            afnClicked = 0;
                            afeClicked = 0;
                            stateAfe = 1; 
                        }
                    }
                }
            }
        }
    }
}
