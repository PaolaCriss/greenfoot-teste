import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VencedorAriel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VencedorAriel extends World
{
    private int atraso = 0;
    /**
     * Constructor for objects of class VencedorAriel.
     * 
     */
    public VencedorAriel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
      super(999, 718, 1); 
      act();
    }
    public void act(){
        if  (Greenfoot.isKeyDown("1") && (atraso == 0)){
            creditos world = new creditos();
            Greenfoot.setWorld(world);

            }
    }
}
