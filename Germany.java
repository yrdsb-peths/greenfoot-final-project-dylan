import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Germany here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Germany extends Country
{
    /**
     * Act - do whatever the Germany wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Germany()
    {
        stateGer = 1;
        setImage("images/Germany/Germany_Blue.png");
    }

    public void act()
    {
        if(MyWorld.tilesTake > 0)
        {
            if(Greenfoot.mouseClicked(this))
            {
                gerClicked = 1;
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
