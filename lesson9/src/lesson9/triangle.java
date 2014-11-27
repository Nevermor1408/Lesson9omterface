package lesson9;
import TurtleGraphics.Pen;
public class triangle extends AbstractShape{
    private double x2, y2, x3, y3;
    private double fact;
    public triangle(){
        super();
        x2 = 50;
        y2 = 50;
        x3 = 100;
        y3 = 0;
        
    }
   
    public void draw(Pen p) {
        p.up();
        p.move(xPos,yPos);
        p.down();
        p.move(x2,y2);
        p.move(x3, y3);
        p.move(xPos, yPos);
    }

    
    public double area() {
        double area;
       area = Math.abs((xPos*y2-x2*yPos) + (x2*y3-x3*y2) +(x3*yPos-xPos*y3)/2);
        return area;
    }

    
    public void stretchBy(double fact) {
        x2 = (x2-xPos) *fact+xPos;
        y2 = (y2-yPos) *fact+yPos;
        y3 = (y3-y2) *fact+y2;
        x3 = (x3-x2) *fact+x2;
        
    }
    public double perm(){
        double per;
        per = Math.sqrt((xPos-x2)*(xPos-x2) +(yPos-y2) *(yPos-y2));
        return per;
    }

    
    public String toString(){
        String str = "This is a Triangle\n";
        str+="\n" +super.toString();
        return str;
    }

    public void move(double xLoc, double yLoc){
        xPos-=xLoc;
        x2-=xLoc;
        x3-=xLoc;
        yPos-=yLoc;
        y2-=yLoc;
        y3-=yLoc;
    }

  
}