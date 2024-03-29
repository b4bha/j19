/*Create an applet which displays a message in the center of the screen. 
 *The message indicates the events taking place on the applet window. 
 *Handle events like  keyboard related The message should update each time an event occurs.
 * The message should give details of the event such 
 * which key is pressed etc.*/
 import java.awt.*;
 import java.applet.*;
 import java.awt.event.*;
 /*<applet code="Slip19_1.class" width=400 height=200></applet>*/
 public class Slip19_1  extends Applet implements KeyListener
{
	String msg="";

	public void init()
	{
 		setBackground(Color.cyan);
 		addKeyListener(this);
 	}
 	public void paint(Graphics g)
 	{
 		g.drawString(msg,250,250);
 	}
 	public void keyTyped(KeyEvent e)
 	{
 		msg="Key Typed "+ e.getKeyChar();
 		repaint();
 	}
 	public void keyPressed(KeyEvent e)
 	{
 		msg="Key pressed "+ e.getKeyChar();
 		repaint();
 	}
 	public void keyReleased(KeyEvent e)
 	{
 		msg="Key Released "+ e.getKeyChar();
 		repaint();
 	}
}