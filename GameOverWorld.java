import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOverWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverWorld extends World
{

    /**
     * Constructor for objects of class GameOverWorld.
     * 
     */
    String colour;
    String otherColour;
    public GameOverWorld()
    {    
        // Create a new world with 1100x600 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1);
        if(MyWorld.blueNum == 19)
        {
            colour = "Blue";
            otherColour = "Red";
        }else{
            colour = "Red";
            otherColour = "Blue";
        }
        Label gameOver = new Label(colour + " has eliminated " + otherColour + "!", 100);
        addObject(gameOver, getWidth()/2, 84);
        Winner win = new Winner();
        addObject(win, getWidth()/2, 362);
    }
    public String getWinner()
    {
        if(MyWorld.redNum == 19)
        {
            return "Red";
        }
        if(MyWorld.blueNum == 19)
        {
            return "Blue";
        }
        return null;
    }
}
