import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Create tile for Sweden and checks for attacks
 * 
 * @author Dylan Ta
 * @version June, 2022
 */
public class Sweden extends Country
{
    //Set object to blue player
    public Sweden()
    {
        stateSwe = 1;
        setImage("images/Sweden/Sweden_Blue.png");
    }
    //When attacked by an adjacent tile, change colour to match the attacker
    public void act()
    {
        if(MyWorld.tilesTake > 0)
        {
            if(Greenfoot.mouseClicked(this))
            {
                sweClicked = 1;
                //Check for Germany
                if(stateSwe != stateGer)
                {
                    if(sweClicked == 1 && gerClicked == 1)
                    {
                        if(stateSwe == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/Sweden/Sweden_Red.png");
                                sweClicked = 0;
                                gerClicked = 0;
                                stateSwe = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/Sweden/Sweden_Blue.png");
                                sweClicked = 0;
                                gerClicked = 0;
                                stateSwe = 1; 
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreBlue();
                                world.decreaseTile();
                            }
                        }
                    }
                }
                //Check for RussiaWest
                if(stateSwe != stateRuw)
                {
                    if(ruwClicked == 1 && ruwClicked == 1)
                    {
                        if(stateSwe == 1)
                        {
                            if(player == 0)
                            {
                                setImage("images/Sweden/Sweden_Red.png");
                                sweClicked = 0;
                                ruwClicked = 0;
                                stateSwe = 0;
                                MyWorld world = (MyWorld) getWorld();
                                world.increaseScoreRed();
                                world.decreaseTile();
                            }
                        }else{
                            if(player == 1)
                            {
                                setImage("images/Sweden/Sweden_Blue.png");
                                sweClicked = 0;
                                ruwClicked = 0;
                                stateSwe = 1; 
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
