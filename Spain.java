import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spain extends Country
{
    /**
     * Act - do whatever the Spain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Spain()
    {
        stateSpa = 2;
        setImage("images/Spain/Spain_Red.png");
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            spaClicked = 1;
            if(stateSpa != stateFra)
            {
                if(fraClicked == 1 && spaClicked == 1)
                {
                    if(stateSpa == 1)
                    {
                        if(player == 0)
                        {
                            setImage("images/Spain/Spain_Red.png");
                            spaClicked = 0;
                            fraClicked = 0;
                            stateSpa = 0;
                            MyWorld world = (MyWorld) getWorld();
                            world.increaseScoreRed();
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/Spain/Spain_Blue.png");
                            spaClicked = 0;
                            fraClicked = 0;
                            stateSpa = 1; 
                        }
                    }
                }
            }
            if(stateSpa != stateAfw)
            {
                if(afwClicked == 1 && spaClicked == 1)
                {
                    if(stateSpa == 1)
                    {
                        if(player == 0)
                        {
                            setImage("images/Spain/Spain_Red.png");
                            spaClicked = 0;
                            afwClicked = 0;
                            stateSpa = 0;
                            MyWorld world = (MyWorld) getWorld();
                            world.increaseScoreRed();
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/Spain/Spain_Blue.png");
                            spaClicked = 0;
                            afwClicked = 0;
                            stateSpa = 1; 
                        }
                    }
                }
            }   
        }
    }
}
