import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arabia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arabia extends Country
{
    /**
     * Act - do whatever the Arabia wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Arabia()
    {
        stateAra = 2;
        setImage("images/Arabia/Arabia_Red.png");
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            araClicked = 1;
            if(stateAra != stateAfn)
            {
                if(araClicked == 1 && afnClicked == 1)
                {
                    if(stateAra == 1)
                    {
                        if(player == 0)
                        {
                            setImage("images/Arabia/Arabia_Red.png");
                            araClicked = 0;
                            afnClicked = 0;
                            stateAra = 0;
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/Arabia/Arabia_Blue.png");
                            araClicked = 0;
                            afnClicked = 0;
                            stateAra = 1;
                        }
                    }
                }
            }
            if(stateAra != stateCea)
            {
                if(araClicked == 1 && ceaClicked == 1)
                {
                    if(stateAra == 1)
                    {
                        if(player == 0)
                        {
                            setImage("images/Arabia/Arabia_Red.png");
                            araClicked = 0;
                            ceaClicked = 0;
                            stateAra = 0;
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/Arabia/Arabia_Blue.png");
                            araClicked = 0;
                            ceaClicked = 0;
                            stateAra = 1;
                        }
                    }
                }
            }
            if(stateAra != stateInd)
            {
                if(araClicked == 1 && indClicked == 1)
                {
                    if(stateAra == 1)
                    {
                        if(player == 0)
                        {
                            setImage("images/Arabia/Arabia_Red.png");
                            araClicked = 0;
                            indClicked = 0;
                            stateAra = 0;
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/Arabia/Arabia_Blue.png");
                            araClicked = 0;
                            indClicked = 0;
                            stateAra = 1;
                        }
                    }
                }
            }
        }
    }
}
