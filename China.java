import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Create tile for China and checks for attacks
 * 
 * @author Dylan Ta
 * @version June, 2022
 */
public class China extends Country
{
    //Set object to red player
    public China()
    {
        stateChi = 2;
        setImage("images/China/China_Red.png"); 
    }
    //When attacked by an adjacent tile, change colour to match the attacker
    public void act()
    {
        if(MyWorld.tilesTake > 0)
        {
            if(Greenfoot.mouseClicked(this))
            {
                chiClicked = 1;
                //Checks for RussiaMid
                if(stateChi != stateRum)
                {
                    if(rumClicked == 1 && chiClicked == 1)
                    {
                        if(stateChi == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/China/China_Red.png");
                                rumClicked = 0;
                                chiClicked = 0;
                                stateChi = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/China/China_Blue.png");
                                rumClicked = 0;
                                chiClicked = 0;
                                stateChi = 1; 
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreBlue();
                                world.decreaseTile();
                            }
                        }
                    }
                }
                //Checks for RussiaEast
                if(stateChi != stateRue)
                {
                    if(rueClicked == 1 && chiClicked == 1)
                    {
                        if(stateChi == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/China/China_Red.png");
                                rueClicked = 0;
                                chiClicked = 0;
                                stateChi = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/China/China_Blue.png");
                                rueClicked = 0;
                                chiClicked = 0;
                                stateChi = 1; 
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreBlue();
                                world.decreaseTile();
                            }
                        }
                    }
                }
                //Checks for CentralAsia
                if(stateChi != stateCea)
                {
                    if(ceaClicked == 1 && chiClicked == 1)
                    {
                        if(stateChi == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/China/China_Red.png");
                                ceaClicked = 0;
                                chiClicked = 0;
                                stateChi = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/China/China_Blue.png");
                                ceaClicked = 0;
                                chiClicked = 0;
                                stateChi = 1; 
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreBlue();
                                world.decreaseTile();
                            }
                        }
                    }
                }
                //Check for India
                if(stateChi != stateInd)
                {
                    if(indClicked == 1 && chiClicked == 1)
                    {
                        if(stateChi == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/China/China_Red.png");
                                indClicked = 0;
                                chiClicked = 0;
                                stateChi = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/China/China_Blue.png");
                                indClicked = 0;
                                chiClicked = 0;
                                stateChi = 1; 
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreBlue();
                                world.decreaseTile();
                            }
                        }
                    }
                }
                //Check for Thailand
                if(stateChi != stateTha)
                {
                    if(thaClicked == 1 && chiClicked == 1)
                    {
                        if(stateChi == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/China/China_Red.png");
                                thaClicked = 0;
                                chiClicked = 0;
                                stateChi = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/China/China_Blue.png");
                                thaClicked = 0;
                                chiClicked = 0;
                                stateChi = 1; 
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
