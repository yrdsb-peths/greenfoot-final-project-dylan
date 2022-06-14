import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Displays the instructions for the game and creates a button to return
 * to the main menu
 * 
 * @author Dylan Ta
 * @version June, 2022
 */
public class MenuWorld extends World
{

    /**
     * Constructor for objects of class MenuWorld.
     * 
     */
    public MenuWorld()
    {    
        // Create a new world with 1100x600 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1); 
        backButton bac = new backButton();
        addObject(bac, 1000, 546);
    }
}
