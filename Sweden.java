import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sweden here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sweden extends Country
{
    /**
     * Act - do whatever the Sweden wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Sweden()
    {
        stateSwe = Greenfoot.getRandomNumber(2);
        if(stateSwe == 1)
        {
            setImage("images/Sweden/Sweden_Blue.png");
        }else{
            setImage("images/Sweden/Sweden_Red.png");
        }   
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            sweClicked = 1;
            if(stateSwe != stateGer)
            {
                if(sweClicked == 1 && gerClicked == 1)
                {
                    if(stateSwe == 1)
                    {
                        if(player == 0)
                        {
                            setImage("images/Sweden/Sweden_Red.png");
                            sweClicked = 0;
                            gerClicked = 0;
                            stateSwe = 0;
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/Sweden/Sweden_Blue.png");
                            sweClicked = 0;
                            gerClicked = 0;
                            stateSwe = 1; 
                        }
                    }
                }
            }
            if(stateSwe != stateRuw)
            {
                if(ruwClicked == 1 && ruwClicked == 1)
                {
                    if(stateSwe == 1)
                    {
                        if(player == 0)
                        {
                            setImage("images/Sweden/Sweden_Red.png");
                            sweClicked = 0;
                            ruwClicked = 0;
                            stateSwe = 0;
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/Sweden/Sweden_Blue.png");
                            sweClicked = 0;
                            ruwClicked = 0;
                            stateSwe = 1; 
                        }
                    }
                }
            }
        }
    }
}
