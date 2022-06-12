import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RussiaWest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RussiaWest extends Country
{
    /**
     * Act - do whatever the RussiaWest wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public RussiaWest()
    {
        stateRuw = Greenfoot.getRandomNumber(2);
        if(stateRuw == 1)
        {
            setImage("images/RussiaWest/RussiaWest_Blue.png");
        }else{
            setImage("images/RussiaWest/RussiaWest_Red.png");
        }  
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            ruwClicked = 1;
            if(stateRuw != stateSwe)
            {
                if(sweClicked == 1 && ruwClicked == 1)
                {
                    if(stateRuw == 1)
                    {
                        if(player == 0)
                        {
                            setImage("images/RussiaWest/RussiaWest_Red.png");
                            sweClicked = 0;
                            ruwClicked = 0;
                            stateRuw = 0;
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/RussiaWest/RussiaWest_Blue.png");
                            sweClicked = 0;
                            ruwClicked = 0;
                            stateRuw = 1; 
                        }
                    }
                }
            }
            if(stateRuw != stateIta)
            {
                if(itaClicked == 1 && ruwClicked == 1)
                {
                    if(stateRuw == 1)
                    {
                        if(player == 0)
                        {
                            setImage("images/RussiaWest/RussiaWest_Red.png");
                            itaClicked = 0;
                            ruwClicked = 0;
                            stateRuw = 0;
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/RussiaWest/RussiaWest_Blue.png");
                            itaClicked = 0;
                            ruwClicked = 0;
                            stateRuw = 1; 
                        }
                    }
                }
            }
            if(stateRuw != stateGer)
            {
                if(gerClicked == 1 && ruwClicked == 1)
                {
                    if(stateRuw == 1)
                    {
                        if(player == 0)
                        {
                            setImage("images/RussiaWest/RussiaWest_Red.png");
                            gerClicked = 0;
                            ruwClicked = 0;
                            stateRuw = 0;
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/RussiaWest/RussiaWest_Blue.png");
                            gerClicked = 0;
                            ruwClicked = 0;
                            stateRuw = 1; 
                        }
                    }
                }
            }
            if(stateRuw != stateCea)
            {
                if(ceaClicked == 1 && ruwClicked == 1)
                {
                    if(stateRuw == 1)
                    {
                        if(player == 0)
                        {
                            setImage("images/RussiaWest/RussiaWest_Red.png");
                            ceaClicked = 0;
                            ruwClicked = 0;
                            stateRuw = 0;
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/RussiaWest/RussiaWest_Blue.png");
                            ceaClicked = 0;
                            ruwClicked = 0;
                            stateRuw = 1; 
                        }
                    }
                }
            }
        }
    }
}
