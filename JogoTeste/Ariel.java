import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ariel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ariel extends Actor
{
    GreenfootSound poder2 = new GreenfootSound("princess.mp3");
    
    private int sTimer = 0;
    /**
     * Act - do whatever the Ariel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movimento ();
    }
    public void movimento()
    {
        int speed = 3;
    
        if (Greenfoot.isKeyDown("w")){
            this.setLocation(this.getX(), this.getY() - speed);
        }
        if (Greenfoot.isKeyDown("s")){
            this.setLocation(this.getX(), this.getY() + speed);
        }
        if (Greenfoot.isKeyDown("a")){
            this.setLocation(this.getX() - speed, this.getY());
        }
        if (Greenfoot.isKeyDown("d")){
            this.setLocation(this.getX() + speed, this.getY());
        }
        else if (Greenfoot.isKeyDown("f") && (sTimer == 0)){
            sTimer ++;
            poder2.play();
            getWorld().addObject(new poder2(), getX() -100, getY() +30);
        }
        else {
            if (!Greenfoot.isKeyDown("f")) {
            sTimer = 0;
            }
        }
    }
}

