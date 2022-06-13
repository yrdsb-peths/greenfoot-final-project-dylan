import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Italy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Italy extends Country
{
    /**
     * Act - do whatever the Italy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Italy()
    {
        stateIta = 2;
        setImage("images/Italy/Italy_Red.png");
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            itaClicked = 1;
            if(stateIta != stateGer)
            {
                if(gerClicked == 1 && itaClicked == 1)
                {
                    if(stateIta == 1)
                    {
                        if(player == 0)
                        {
                            setImage("images/Italy/Italy_Red.png");
                            gerClicked = 0;
                            itaClicked = 0;
                            stateIta = 0;
                            MyWorld world = (MyWorld) getWorld();
                            world.increaseScoreRed();
                            world.decreaseTile();
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/Italy/Italy_Blue.png");
                            gerClicked = 0;
                            itaClicked = 0;
                            stateIta = 1;
                            MyWorld world = (MyWorld) getWorld();
                            world.increaseScoreBlue();
                            world.decreaseTile();
                        }
                    }
                }
            }
            if(stateIta != stateFra)
            {
                if(fraClicked == 1 && itaClicked == 1)
                {
                    if(stateIta == 1)
                    {
                        if(player == 0)
                        {
                            setImage("images/Italy/Italy_Red.png");
                            fraClicked = 0;
                            itaClicked = 0;
                            stateIta = 0;
                            MyWorld world = (MyWorld) getWorld();
                            world.increaseScoreRed();
                            world.decreaseTile();
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/Italy/Italy_Blue.png");
                            fraClicked = 0;
                            itaClicked = 0;
                            stateIta = 1;
                            MyWorld world = (MyWorld) getWorld();
                            world.increaseScoreBlue();
                            world.decreaseTile();
                        }
                    }
                }
            }
            if(stateIta != stateFra)
            {
                if(fraClicked == 1 && itaClicked == 1)
                {
                    if(stateIta == 1)
                    {
                        if(player == 0)
                        {
                            setImage("images/Italy/Italy_Red.png");
                            fraClicked = 0;
                            itaClicked = 0;
                            stateIta = 0;
                            MyWorld world = (MyWorld) getWorld();
                            world.increaseScoreRed();
                            world.decreaseTile();
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/Italy/Italy_Blue.png");
                            fraClicked = 0;
                            itaClicked = 0;
                            stateIta = 1;
                            MyWorld world = (MyWorld) getWorld();
                            world.increaseScoreBlue();
                            world.decreaseTile();
                        }
                    }
                }
            }
            if(stateIta != stateRuw)
            {
                if(ruwClicked == 1 && itaClicked == 1)
                {
                    if(stateIta == 1)
                    {
                        if(player == 0)
                        {
                            setImage("images/Italy/Italy_Red.png");
                            ruwClicked = 0;
                            itaClicked = 0;
                            stateIta = 0;
                            MyWorld world = (MyWorld) getWorld();
                            world.increaseScoreRed();
                            world.decreaseTile();
                        }
                    }else{
                        if(player == 1)
                        {
                            setImage("images/Italy/Italy_Blue.png");
                            ruwClicked = 0;
                            itaClicked = 0;
                            stateIta = 1;
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
