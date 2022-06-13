import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Die here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Die extends RandomizerDice
{
    /**
     * Act - do whatever the Die wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage[] diceImages;
    private SimpleTimer timer;
    private int counter = 0;
    public Die()
    {
        diceImages = new GreenfootImage[6];
        for(int i = 0; i < diceImages.length; i++)
        {
            diceImages[i] = new GreenfootImage("images/dice/dice" + i + ".png");
        }
        setImage(diceImages[0]);
        timer = new SimpleTimer();
        timer.mark();
    }
    int curIndex = 0;
    void animate()
    {
        if(timer.millisElapsed() > 300){
            setImage(diceImages[curIndex]);
            curIndex++;
            curIndex %= 6;
            counter++;
            Greenfoot.playSound("sounds/DiceRoll.mp3");
            timer.mark();
        }
    }
    public void act()
    {   
        
        if(rolled == 1)
        {
            animate();
            if(counter >= rand)
            {
                rolled = 0;
                rand = 0;
                counter = 0;
            }
        }
    }
}
