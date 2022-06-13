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
        stateTha = 1;
        setImage("images/Thailand/Thailand_Blue.png");  
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            thaClicked = 1;
            if(stateTha != stateChi)
            {
                if(thaClicked == 1 && chiClicked == 1)
                {
                    if(stateTha == 1)
                    {
                        if(player == 0)
                        {
                            setImage("images/Thailand/Thailand_Red.png");
                            thaClicked = 0;
                            chiClicked = 0;
                            stateTha = 0;
                            MyWorld world = (MyWorld) getWorld();
                            world.increaseScoreRed();
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/Thailand/Thailand_Blue.png");
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
