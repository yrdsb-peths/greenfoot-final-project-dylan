import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class India here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class India extends Country
{
    /**
     * Act - do whatever the India wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public India()
    {
        stateInd = Greenfoot.getRandomNumber(2);
        if(stateInd == 1)
        {
            setImage("images/India/India_Blue.png");
        }else{
            setImage("images/India/India_Red.png");
        }   
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            indClicked = 1;
            if(stateInd != stateAra)
            {
                if(indClicked == 1 && araClicked == 1)
                {
                    if(stateInd == 1)
                    {
                        if(player == 0)
                        {
                            setImage("images/India/India_Red.png");
                            araClicked = 0;
                            indClicked = 0;
                            stateInd = 0;
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/India/India_Blue.png");
                            araClicked = 0;
                            indClicked = 0;
                            stateInd = 1;
                        }
                    }
                }
            }
            if(stateInd != stateCea)
            {
                if(indClicked == 1 && ceaClicked == 1)
                {
                    if(stateInd == 1)
                    {
                        if(player == 0)
                        {
                            setImage("images/India/India_Red.png");
                            ceaClicked = 0;
                            indClicked = 0;
                            stateInd = 0;
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/India/India_Blue.png");
                            ceaClicked = 0;
                            indClicked = 0;
                            stateInd = 1;
                        }
                    }
                }
            }
            if(stateInd != stateChi)
            {
                if(indClicked == 1 && chiClicked == 1)
                {
                    if(stateInd == 1)
                    {
                        if(player == 0)
                        {
                            setImage("images/India/India_Red.png");
                            chiClicked = 0;
                            indClicked = 0;
                            stateInd = 0;
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/India/India_Blue.png");
                            chiClicked = 0;
                            indClicked = 0;
                            stateInd = 1;
                        }
                    }
                }
            }
        }
    }
}
