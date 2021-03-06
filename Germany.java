import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Create tile for Germany and checks for attacks
 * 
 * @author Dylan Ta 
 * @version June, 2022
 */
public class Germany extends Country
{
    //Set object to blue player
    public Germany()
    {
        stateGer = 1;
        setImage("images/Germany/Germany_Blue.png");
    }
    //When attacked by an adjacent tile, change colour to match the attacker
    public void act()
    {
        if(MyWorld.tilesTake > 0)
        {
            if(Greenfoot.mouseClicked(this))
            {
                gerClicked = 1;
                //Check for France
                if(stateGer != stateFra)
                {
                    if(fraClicked == 1 && gerClicked == 1)
                    {
                        if(stateGer == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/Germany/Germany_Red.png");
                                gerClicked = 0;
                                fraClicked = 0;
                                stateGer = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/Germany/Germany_Blue.png");
                                gerClicked = 0;
                                fraClicked = 0;
                                stateGer = 1; 
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreBlue();
                                world.decreaseTile();
                            }
                        }
                    }
                }
                //Check for Italy
                if(stateGer != stateIta)
                {
                    if(gerClicked == 1 && itaClicked == 1)
                    {
                        if(stateGer == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/Germany/Germany_Red.png");
                                gerClicked = 0;
                                itaClicked = 0;
                                stateGer = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/Germany/Germany_Blue.png");
                                gerClicked = 0;
                                itaClicked = 0;
                                stateGer = 1;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreBlue();
                                world.decreaseTile();
                            }
                        }
                    }
                }
                //Check for Sweden
                if(stateGer != stateSwe)
                {
                    if(sweClicked == 1 && gerClicked == 1)
                    {
                        if(stateGer == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/Germany/Germany_Red.png");
                                sweClicked = 0;
                                gerClicked = 0;
                                stateGer = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/Germany/Germany_Blue.png");
                                sweClicked = 0;
                                gerClicked = 0;
                                stateGer = 1; 
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreBlue();
                                world.decreaseTile();
                            }
                        }
                    }
                }
                //Check for RussiaWest
                if(stateGer != stateRuw)
                {
                    if(ruwClicked == 1 && gerClicked == 1)
                    {
                        if(stateGer == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/Germany/Germany_Red.png");
                                ruwClicked = 0;
                                gerClicked = 0;
                                stateGer = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/Germany/Germany_Blue.png");
                                ruwClicked = 0;
                                gerClicked = 0;
                                stateGer = 1; 
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
