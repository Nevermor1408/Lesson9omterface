

package lesson9;
import TurtleGraphics.Pen; 
public class Wheel extends Circle {
    private int spokes;
    
    public Wheel(){
        super();
        xPos = 0;
        yPos = 0;
        radius = 0;
        spokes = 0;
        
        
    }
    public Wheel (double xLoc, double yLoc, double r, int s){
        super (xLoc, yLoc, r);
       
        
        spokes = s;
    }
    public void draw (Pen p){
        super.draw(p);
        for(int i =1; i<= spokes; i++){
        p.up();
        p.move (xPos, yPos);
        p.setDirection(i * 360.0 / spokes);
        p.down();
        p.move(radius);
        }
       
    }
         public void setSpokes(int s){
            spokes = s;
        }
          public String toString(){
            String str = "Wheel\n" + "radius: " + radius +"\n" + "Spokes: "+","+ "\n"+ "(X,Y) Position: (" + xPos + ","+yPos + ")\n"+"Area: "+ area();
            return str;
            
            
        }
           public double perm(){
       double perm;
       perm = 2.0*Math.PI * radius;
       return perm;
   }
    }

