import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class poder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class poder extends Actor
{
    GifImage power_ursula = new GifImage("poder_ursula.gif");
    
    /**
     * Act - do whatever the poder wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(power_ursula.getCurrentImage());
        moveAtaque();
        acertarAlvo ();
    }
    public void moveAtaque()
    {
    double angle = Math.toRadians( getRotation());
    int x = (int) Math.round(getX() + Math.cos(angle));
    int y = (int) Math.round(getY() + Math.sin(angle));
    
    setLocation(x, y);
    }
    public void acertarAlvo (){
    Actor b = getOneIntersectingObject(Ariel.class);
    
    if (b != null) {
        
    Counter2 counter2 = (Counter2) getWorld().getObjects(Counter2.class).get(0);
    counter2.add(1);
    
        getWorld().removeObject(b);
        getWorld().removeObject(this);
        }
    }
}
