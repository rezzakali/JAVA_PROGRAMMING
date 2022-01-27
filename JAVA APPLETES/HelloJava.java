import java.applet.Applet;
import java.awt.Graphics;

public class HelloJava extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello Applet", 10, 100);
    }
}
/*
 * <APPLET code="HelloJava.class" width="200" height="150"></APPLET>
 * 
 */