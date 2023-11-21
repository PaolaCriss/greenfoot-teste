import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class poder2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class poder2 extends Actor
{
    private int tempo = 50;
    private int atraso = 0;
    /**
     * Act - do whatever the poder2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
         moveAtaque();
        acertarAlvo();
    }
    public void moveAtaque()
    {
    double angle = Math.toRadians( getRotation());
    int x = (int) Math.round(getX() - Math.cos(angle));
    int y = (int) Math.round(getY() - Math.sin(angle));
    
    setLocation(x, y);
    }
    
    public void acertarAlvo (){
    Actor b = getOneIntersectingObject(vila.class);
    
    if (b != null) {
        
    Counter1 counter1 = (Counter1) getWorld().getObjects(Counter1.class).get(0);
    counter1.add(1);
    
        getWorld().removeObject(b);
        getWorld().removeObject(this);
        tempo = 0;
        if(tempo<1){
        VencedorAriel world = new VencedorAriel();
        Greenfoot.setWorld(world);
            
        }
        }
    }
    
    
}

