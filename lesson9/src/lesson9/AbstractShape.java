
package lesson9;

import TurtleGraphics.Pen;

import TurtleGraphics.StandardPen;


abstract public  class AbstractShape{
   
   
   protected double xPos, yPos;
   
   public AbstractShape(){
       xPos = 0;
       yPos = 0;
   }
   public AbstractShape(double x, double y){
       xPos = x;
       yPos = y;
   }
   //abstract methods defined in child classes
   abstract public double area();
   abstract public void draw(Pen p);
   abstract public void stretchBy(double fact);
   //final methods are identical in child classes
   public final double getXPos(){
       return xPos;
   }
   public final double getYPos(){
       return yPos;
   }
   public void move(double xLoc, double yLoc){
       xPos = xLoc;
       yPos = yLoc;
   }
   //other methods can be overridden by child classes
  public abstract double perm();
      
  
   public String toString(){
       String str = "X-Y Position= " +xPos+"," +yPos+")";
       str+="\nArea= " +area();
       str+="\nPerimeter = " + perm();
       return str;
               
   }
  
   
}