package javaweb;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Yard extends Frame {
   public static final int ROWS=50;
   public static final int  COLS=50;
   public static final int BLOCK_SIZE=10;
    public void Launch(){
	   this.setLocation(200,200);
	   this.setSize(COLS*BLOCK_SIZE, ROWS*BLOCK_SIZE);
	   this.addWindowListener(new WindowAdapter(){
         @Override
		public void windowClosing(WindowEvent arg0) {
			System.exit(0);
		}
		   
	   });
	this.setVisible(true);
   }
    public static void main(String[] args) {
	new Yard().Launch();
	}
	  @Override
	public void paint(Graphics g) {
		Color c=g.getColor();
		g.setColor(Color.GRAY);
		g.fillRect(0,0,COLS*BLOCK_SIZE, ROWS*BLOCK_SIZE );
		g.setColor(Color.DARK_GRAY);
		for(int i=1;i<ROWS-1;i++){
			g.drawLine(0, BLOCK_SIZE * i, COLS * BLOCK_SIZE, BLOCK_SIZE * i);
		}
		for(int i=1; i<COLS; i++) {
			g.drawLine(BLOCK_SIZE * i, 0, BLOCK_SIZE * i, BLOCK_SIZE * ROWS);
		}
	    g.setColor(c);	
	 
	}
}
