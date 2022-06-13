import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class China here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class China extends Country
{
    /**
     * Act - do whatever the China wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public China()
    {
        stateChi = 2;
        setImage("images/China/China_Red.png"); 
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            chiClicked = 1;
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
