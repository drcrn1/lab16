import javax.swing.*;
import java.awt.*;

public class MyDrawing extends JComponent{
    public void paintComponent(Graphics g){
        g.drawRect(50,200,150,150);
        g.drawRect(75,250,40,40);
        int x[]={25,125,225};
        int y[]={220,120,220};
        int x2[]={150,150,170,170};
        int y2[]={145,130,130,165};
        int x3[]={310,310,360,360};
        int y3[]={300,350,350,300};
        g.drawPolyline(x,y,3);
        g.drawPolyline(x2,y2,4);
        g.drawPolyline(x3,y3,4);
        g.drawArc(260, 110, 150, 200, -70, 320);

    }
    public static void main(String[] args){
        JFrame frame = new JFrame("My Drawing");
        MyDrawing draw = new MyDrawing();
        draw.setSize(400,400);
        frame.add(draw);
        frame.setSize(450,450);
        frame.setVisible(true);
    }
}