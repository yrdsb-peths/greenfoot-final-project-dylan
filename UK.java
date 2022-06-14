import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Create tile for UK and checks for attacks
 * 
 * @author Dylan Ta 
 * @version June, 2022
 */
public class UK extends Country
{
    //Set object to red player
    public UK()
    {
        stateUni = 2;
        setImage("images/UK/UK_Red.png");  
    }
    //When attacked by an adjacent tile, change colour to match the attacker
    public void act()
    {
        if(MyWorld.tilesTake > 0)
        {
            if(Greenfoot.mouseClicked(this))
            {
                uniClicked = 1;
                //Check for France
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
}
