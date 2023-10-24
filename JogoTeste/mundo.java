import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mundo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mundo extends World
{

    /**
     * Constructor for objects of class mundo.
     * 
     */
    public mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(999, 718, 1); 
        prepare();
    
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {

        Counter1 counter1 = new Counter1();
        addObject(counter1,136,54);
        Counter2 counter2 = new Counter2();
        addObject(counter2,852,41);
        Ariel ariel = new Ariel();
        addObject(ariel,855,396);
        vila vila = new vila();
        addObject(vila,168,425);
    }
    
    private GreenfootSound bgMusic= new GreenfootSound("som.wav");
    public void started()
    {
    //bgMusic.playLoop(); 
    }
    public void stopped()
    {
    //bgMusic.pause();
    }
}

