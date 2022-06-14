import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Create tile for Spain and checks for attacks
 * 
 * @author Dylan Ta 
 * @version June, 2022
 */
public class Spain extends Country
{
    //Set object to red player
    public Spain()
    {
        stateSpa = 2;
        setImage("images/Spain/Spain_Red.png");
    }
    //When attacked by an adjacent tile, change colour to match the attacker
    public void act()
    {
        if(MyWorld.tilesTake > 0)
        {
            if(Greenfoot.mouseClicked(this))
            {
                spaClicked = 1;
                //Check for France
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
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/Spain/Spain_Blue.png");
                                spaClicked = 0;
                                fraClicked = 0;
                                stateSpa = 1; 
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreBlue();
                                world.decreaseTile();
                            }
                        }
                    }
                }
                //Check for AfricaWest
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
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/Spain/Spain_Blue.png");
                                spaClicked = 0;
                                afwClicked = 0;
                                stateSpa = 1; 
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
}
