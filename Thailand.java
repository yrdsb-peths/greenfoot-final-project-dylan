import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Thailand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Thailand extends Country
{
    /**
     * Act - do whatever the Thailand wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Thailand()
    {
        stateTha = Greenfoot.getRandomNumber(2);
        if(stateTha == 1)
        {
            setImage("images/Thailand/Thailand_Blue.png");
        }else{
            setImage("images/Thailand/Thailand_Red.png");
        }   
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            chiClicked = 1;
            if(stateTha != stateChi)
            {
                if(thaClicked == 1 && chiClicked == 1)
                {
                    if(stateTha == 1)
                    {
                        if(player == 0)
                        {
                            setImage("images/China/China_Red.png");
                            thaClicked = 0;
                            chiClicked = 0;
                            stateTha = 0;
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/China/China_Blue.png");
                            thaClicked = 0;
                            chiClicked = 0;
                            stateTha = 1; 
                        }
                    }
                }
            }
        }
    }
}
