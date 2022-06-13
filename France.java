import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class France here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class France extends Country
{
    /**
     * Act - do whatever the France wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public France()
    {
        stateFra = 1;
        setImage("images/France/France_Blue.png");
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            fraClicked = 1;
            if(stateFra != stateGer)
            {
                if(gerClicked == 1 && fraClicked == 1)
                {
                    if(stateFra == 1)
                    {
                        if(player == 0)
                        {
                            setImage("images/France/France_Red.png");
                            gerClicked = 0;
                            fraClicked = 0;
                            stateFra = 0;
                            MyWorld world = (MyWorld) getWorld();
                            world.increaseScoreRed();
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/France/France_Blue.png");
                            gerClicked = 0;
                            fraClicked = 0;
                            stateFra = 1;
                        }
                    }
                }
            }
            if(stateFra != stateIta)
            {
                if(itaClicked == 1 && fraClicked == 1)
                {
                    if(stateFra == 1)
                    {
                        if(player == 0)
                        {
                            setImage("images/France/France_Red.png");
                            itaClicked = 0;
                            fraClicked = 0;
                            stateFra = 0;
                            MyWorld world = (MyWorld) getWorld();
                            world.increaseScoreRed();
                        }

                    }else{
                        if(player == 1)
                        {
                            setImage("images/France/France_Blue.png");
                            itaClicked = 0;
                            fraClicked = 0;
                            stateFra = 1;
                        }
                    }
                }
            }
            if(stateFra != stateSpa)
            {
                if(spaClicked == 1 && fraClicked == 1)
                {
                    if(stateFra == 1)
                    {
                        if(player == 0)
                        {
                            setImage("images/France/France_Red.png");
                            spaClicked = 0;
                            fraClicked = 0;
                            stateFra = 0; 
                            MyWorld world = (MyWorld) getWorld();
                            world.increaseScoreRed();
                        }

                    }else{
                        if(player == 1)
                        {
                            setImage("images/France/France_Blue.png");
                            spaClicked = 0;
                            fraClicked = 0;
                            stateFra = 1;
                        }
                    }
                }
            }
            if(stateFra != stateUni)
            {
                if(uniClicked == 1 && fraClicked == 1)
                {
                    if(stateFra == 1)
                    {
                        if(player == 0)
                        {
                            setImage("images/France/France_Red.png");
                            uniClicked = 0;
                            fraClicked = 0;
                            stateFra = 0;
                            MyWorld world = (MyWorld) getWorld();
                            world.increaseScoreRed();
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/France/France_Blue.png");
                            uniClicked = 0;
                            fraClicked = 0;
                            stateFra = 1;
                        }
                    }
                }
            }
        }
    }
}
