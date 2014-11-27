

package lesson9;


 
 
 import TurtleGraphics.Pen; 
 
 
 
 
 public class Rect extends  AbstractShape { 
    
     private double width, height; 
     public Rect(){ 
         super();
         width = 1; 
         height = 1; 
     } 
     public Rect (double x, double y, double h, double w){ 
         super(x,y);
         height = h; 
         width = w; 
     } 
      public double area(){ 
         return height * width; 
          
     } 
 
 
      
     public void draw(Pen p) { 
        p.up(); 
        p.move(xPos, yPos); 
        p.down(); 
        p.setDirection(0); 
        p.move(width); 
        p.turn(-90); 
        p.move(height); 
        p.turn(-90); 
        p.move(width); 
        p.turn(-90); 
        p.move(height); 
         
     } 
 
 
    
 
 
 
     
     public void stretchBy(double factor) { 
        height *= factor; width*=factor; 
     } 
     public String toString(){ 
         String str = "This is a rectangle\n";
         str+="Width ="+ width+"\tHeight = "+height;
         str+="\n"+super.toString();
         
         return str; 
     } 

    @Override
    public double perm() {
        double perm;
        perm = 2;
        return perm;
    }

   
   
 } 
