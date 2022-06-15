import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Animate the dice to spin
 * Sounds from: https://soundbible.com/tags-rolling-dice.html
 * 
 * @author Dylan Ta
 * @version June, 2022
 */
public class Die extends RandomizerDice
{
    //Creates array for dice images
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
        once = 0;
        rolled = 0;
        rand = 0;
        player = 0;
    }
    //Change the image to create animation
    int curIndex = 0;
    void animate()
    {
        if(timer.millisElapsed() > 300){
            setImage(diceImages[curIndex]);
            curIndex++;
            curIndex %= 6;
            MyWorld world = (MyWorld) getWorld();
            world.setTiles(curIndex %= 6);
            counter++;
            Greenfoot.playSound("sounds/DiceRoll.mp3");
            timer.mark();
        }
    }
    //Start animation when roll button is clicked
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
