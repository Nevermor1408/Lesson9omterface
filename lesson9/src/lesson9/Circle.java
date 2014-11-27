
package lesson9;
import TurtleGraphics.Pen; 

/**
 *
 * @author matt6341
 */
public class Circle extends AbstractShape{ 
     
     protected double radius; 
     public Circle(){ 
         super();
         radius = 1; 
     
     } 
     public Circle (double x, double y, double r){ 
         super(x,y);
         radius = r; 
     } 
      
     public double area(){ 
         return Math.PI * radius * radius; 
          
     } 
 

     
     public void draw(Pen p) { 
         double side = 2.0 * Math.PI * radius / 120; 
         p.up(); 
         p.move(xPos + radius, yPos - side/ 2); 
         p.setDirection(90); 
         p.down(); 
         for(int i =0; i<120; i++){ 
             p.move(side); 
             p.turn(3); 
         } 
     } 
      
        
 
    
    public void stretchBy(double factor) { 
        radius *= factor; 
          
     } 
     public String toString(){ 
         String str = "this is a circle\n";
         str+="radius ="+radius;
         str += "\n"+super.toString();
         
         return str; 
     } 
      public double perm(){
       double perm;
       perm = 2.0*Math.PI * radius;
       return perm;
   }
 }

