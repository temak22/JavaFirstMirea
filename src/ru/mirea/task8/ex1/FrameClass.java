package ru.mirea.task8.ex1;

import javax.swing.*;
import java.awt.*;

public class FrameClass extends JFrame{

    public FrameClass() {
        super("Test");
        setLayout(null);
        setSize(1600,900);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        for( int i=0;i<20;i++){
            int R = (int)(Math.random()*256);
            int G = (int)(Math.random()*256);
            int B= (int)(Math.random()*256);
            int x=(int)(Math.random()*2);
            switch(x){
                case 0: {
                    Rectangle r = new Rectangle( i * 10, i*20, i * 10, i * 20, new Color(R,G,B));
                    g.setColor(r.getColor());
                    g.drawRect((int) r.getX(), (int) r.getY(), r.getLength(), r.getWidth());
                    break;
                }
                case 1:{
                    Circle c = new Circle(i*20,i*20,(int)(Math.random()*100+10),new Color(R,G,B));
                    g.setColor(c.getColor());
                    g.drawOval((int) c.getX(), (int) c.getY(), c.getRadius(), c.getRadius());
                    break;
                }
                default: break;
            }
        }
    }

    /*public void drawIcon() {
        Graphics g = getGraphics();
        ImageIcon img = new ImageIcon(img_path);
        g.drawImage(img,0,0,null);
    }*/

    public static void main(String[] args)
    {
        FrameClass frame = new FrameClass();

        //for (int i = 0; i < args.length; i++)
        //   img_path = args[i];

        //frame.drawIcon();

    }
}

