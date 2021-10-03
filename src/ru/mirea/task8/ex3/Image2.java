package ru.mirea.task8.ex3;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Image2 extends Frame
{
    private Image[] img=new Image[6];
    private int count;

    Image2 (String s)
    {
        super(s);
        MediaTracker tracker = new MediaTracker(this);
        for (int k=0; k<6; k++)
        {
            img[k]=getToolkit().getImage("C:\\Users\\temak\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\image" + (k+1) + ".PNG");
            tracker.addImage(img[k],0);
        }
        try
        {
            tracker.waitForAll();
        }
        catch (InterruptedException e){}
        setSize(400, 340);
        setVisible(true);
    }

    public void paint(Graphics g)
    {
        g.drawImage(img[count%6], 50, 50, this);
    }

    public void update(Graphics g) {
        paint(g);
    }

    public void go()
    {
        while(count<90)
        {
            repaint();
            try
            {
                Thread.sleep(80);
            }
            catch (InterruptedException e){}
            count++;
        }
    }

    public static void main(String[] args)
    {
        Image2 anim_window=new Image2("Animation");
        anim_window.go();

        anim_window.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent ev)
            {
                System.exit(0);
            }
        });
    }
}