import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class UK here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UK extends Country
{
    /**
     * Act - do whatever the UK wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public UK()
    {
        stateUni = 2;
        setImage("images/UK/UK_Red.png");  
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            uniClicked = 1;
            if(stateUni != stateFra)
            {
                if(fraClicked == 1 && uniClicked == 1)
                {
                    if(stateUni == 1)
                    {
                        if(player == 0)
                        {
                            setImage("images/UK/UK_Red.png");
                            uniClicked = 0;
                            fraClicked = 0;
                            stateUni = 0;
                            MyWorld world = (MyWorld) getWorld();
                            world.increaseScoreRed();
                            world.decreaseTile();
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/UK/UK_Blue.png");
                            uniClicked = 0;
                            fraClicked = 0;
                            stateUni = 1; 
                            MyWorld world = (MyWorld) getWorld();
                            world.increaseScoreBlue();
                            world.decreaseTile();
                        }
                    }
                }
            }   
        }
    }
}
