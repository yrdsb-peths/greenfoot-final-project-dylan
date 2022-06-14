import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *  Create tile for Thailand and checks for attacks
 * 
 * @author Dylan Ta 
 * @version June, 2022
 */
public class Thailand extends Country
{
    //Set object to blue player
    public Thailand()
    {
        stateTha = 1;
        setImage("images/Thailand/Thailand_Blue.png");  
    }
    //When attacked by an adjacent tile, change colour to match the attacker
    public void act()
    {
        if(MyWorld.tilesTake > 0)
        {
            if(Greenfoot.mouseClicked(this))
            {
                thaClicked = 1;
                //Check for China
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
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/Thailand/Thailand_Blue.png");
                                thaClicked = 0;
                                chiClicked = 0;
                                stateTha = 1; 
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
