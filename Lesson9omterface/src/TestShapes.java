import TurtleGraphics.*;
import java.awt.Color;
import TerminalIO.KeyboardReader;
public class TestShapes {
    public static void main(String[]args){
        Pen p = new StandardPen();
        Shape s1;
        double r, x, y;
        double w,h;
        int choice;
        KeyboardReader k = new KeyboardReader();
        while(true){
            choice=k.readInt("Enter 1 for rectangle, 2 for circe");
            if(choice==1|| choice==2) break;
        }
        if(choice==1){
            w=k.readDouble("Enter width of rectangle: ");
            h=k.readDouble("Enter height of rectangle: ");
            s1 = new Rect(0,0,w,h);
        }
        else
        {
            r=k.readDouble("Enter radius of cricle: ");
            s1 = new Circle(0,0,r);
        }
        while(true){
            s1.draw(p);
            x=k.readDouble("new x: ");
            y=k.readDouble("New y: ");
            p.setColor(Color.white);
            s1.draw(p);
            s1.move(x, y);
            p.setColor(Color.blue);
            s1.draw(p);
            
        }
    }
}
