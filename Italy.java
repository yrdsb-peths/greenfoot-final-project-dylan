import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Create tile for Italy and checks for attacks
 * 
 * @author Dylan Ta
 * @version June, 2022
 */
public class Italy extends Country
{
    //Set object to red player
    public Italy()
    {
        stateIta = 2;
        setImage("images/Italy/Italy_Red.png");
    }
    //When attacked by an adjacent tile, change colour to match the attacker
    public void act()
    {
        if(MyWorld.tilesTake > 0)
        {
            if(Greenfoot.mouseClicked(this))
            {
                itaClicked = 1;
                //Check for Germany
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
                //Check for France
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
                //Check for RussiaWest
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
}
