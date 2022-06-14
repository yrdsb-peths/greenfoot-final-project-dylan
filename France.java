import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Create tile for France and checks for attacks
 * 
 * @author Dylan Ta
 * @version June, 2022
 */
public class France extends Country
{
    //Set object to blue player
    public France()
    {
        stateFra = 1;
        setImage("images/France/France_Blue.png");
    }
    //When attacked by an adjacent tile, change colour to match the attacker
    public void act()
    {
        if(MyWorld.tilesTake > 0)
        {
            if(Greenfoot.mouseClicked(this))
            {
                fraClicked = 1;
                //Check for Germany
                if(stateFra != stateGer)
                {
                    if(gerClicked == 1 && fraClicked == 1)
                    {
                        if(stateFra == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/France/France_Red.png");
                                gerClicked = 0;
                                fraClicked = 0;
                                stateFra = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/France/France_Blue.png");
                                gerClicked = 0;
                                fraClicked = 0;
                                stateFra = 1;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreBlue();
                                world.decreaseTile();
                            }
                        }
                    }
                }
                //Check for Italy
                if(stateFra != stateIta)
                {
                    if(itaClicked == 1 && fraClicked == 1)
                    {
                        if(stateFra == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/France/France_Red.png");
                                itaClicked = 0;
                                fraClicked = 0;
                                stateFra = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }

                        }else{
                            if(player == 1)
                            {
                                setImage("images/France/France_Blue.png");
                                itaClicked = 0;
                                fraClicked = 0;
                                stateFra = 1;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreBlue();
                                world.decreaseTile();
                            }
                        }
                    }
                }
                //Check for Spain
                if(stateFra != stateSpa)
                {
                    if(spaClicked == 1 && fraClicked == 1)
                    {
                        if(stateFra == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/France/France_Red.png");
                                spaClicked = 0;
                                fraClicked = 0;
                                stateFra = 0; 
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }

                        }else{
                            if(player == 1)
                            {
                                setImage("images/France/France_Blue.png");
                                spaClicked = 0;
                                fraClicked = 0;
                                stateFra = 1;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreBlue();
                                world.decreaseTile();
                            }
                        }
                    }
                }
                //Check for UK
                if(stateFra != stateUni)
                {
                    if(uniClicked == 1 && fraClicked == 1)
                    {
                        if(stateFra == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/France/France_Red.png");
                                uniClicked = 0;
                                fraClicked = 0;
                                stateFra = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/France/France_Blue.png");
                                uniClicked = 0;
                                fraClicked = 0;
                                stateFra = 1;
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
