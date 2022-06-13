import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RussiaEast here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RussiaEast extends Country
{
    /**
     * Act - do whatever the RussiaEast wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public RussiaEast()
    {
        stateRue = 2;
        setImage("images/RussiaEast/RussiaEast_Red.png");
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            rueClicked = 1;
            if(stateRue != stateRum)
            {
                if(rumClicked == 1 && rueClicked == 1)
                {
                    if(stateRue == 1)
                    {
                        if(player == 0)
                        {
                            setImage("images/RussiaEast/RussiaEast_Red.png");
                            rumClicked = 0;
                            rueClicked = 0;
                            stateRue = 0;
                            MyWorld world = (MyWorld) getWorld();
                            world.increaseScoreRed();
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/RussiaEast/RussiaEast_Blue.png");
                            rumClicked = 0;
                            rueClicked = 0;
                            stateRue = 1; 
                        }
                    }
                }
            }
            if(stateRue != stateChi)
            {
                if(chiClicked == 1 && rueClicked == 1)
                {
                    if(stateRue == 1)
                    {
                        if(player == 0)
                        {
                            setImage("images/RussiaEast/RussiaEast_Red.png");
                            chiClicked = 0;
                            rueClicked = 0;
                            stateRue = 0;
                            MyWorld world = (MyWorld) getWorld();
                            world.increaseScoreRed();
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/RussiaEast/RussiaEast_Blue.png");
                            chiClicked = 0;
                            rueClicked = 0;
                            stateRue = 1; 
                        }
                    }
                }
            }
        }
    }
}
