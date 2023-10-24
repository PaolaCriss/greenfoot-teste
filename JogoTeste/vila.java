import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class vila here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class vila extends Actor
{
    private int sTimer = 0;
    /**
     * Act - do whatever the vila wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movimento();
    }
    public void movimento()
    {
        int speed = 3;
    
        if (Greenfoot.isKeyDown("up")){
            this.setLocation(this.getX(), this.getY() - speed);
        }
        if (Greenfoot.isKeyDown("down")){
            this.setLocation(this.getX(), this.getY() + speed);
        }
        if (Greenfoot.isKeyDown("left")){
            this.setLocation(this.getX() - speed, this.getY());
        }
        if (Greenfoot.isKeyDown("right")){
            this.setLocation(this.getX() + speed, this.getY());
        }
        else if(Greenfoot.isKeyDown("0")){
            getWorld().addObject(new poder(), getX() -100, getY() +30);
        }
        else {
            if (!Greenfoot.isKeyDown("enter")) {
            sTimer = 0;
            }
        }
    }
}
