import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cenario_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cenario_2 extends Actor
{
    GifImage bolhas = new GifImage("bolhas_verde.gif");
    /**
     * Act - do whatever the cenario_2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(bolhas.getCurrentImage());
    }
}
