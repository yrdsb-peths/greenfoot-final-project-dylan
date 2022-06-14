import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Create tile for RussiaEast and checks for attacks
 * 
 * @author Dylan Ta
 * @version June, 2022
 */
public class RussiaEast extends Country
{
    //Set object to red player
    public RussiaEast()
    {
        stateRue = 2;
        setImage("images/RussiaEast/RussiaEast_Red.png");
    }
    //When attacked by an adjacent tile, change colour to match the attacker
    public void act()
    {
        if(MyWorld.tilesTake > 0)
        {
            if(Greenfoot.mouseClicked(this))
            {
                rueClicked = 1;
                //Check for RussiaMid
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
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/RussiaEast/RussiaEast_Blue.png");
                                rumClicked = 0;
                                rueClicked = 0;
                                stateRue = 1; 
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreBlue();
                                world.decreaseTile();
                            }
                        }
                    }
                }
                //Check for China
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
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/RussiaEast/RussiaEast_Blue.png");
                                chiClicked = 0;
                                rueClicked = 0;
                                stateRue = 1; 
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
