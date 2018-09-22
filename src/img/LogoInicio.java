package img;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class LogoInicio extends JPanel {
/**
	 * 
	 */
	private static final long serialVersionUID = -9142337630207330903L;
            ImageIcon imgLogo;
	
	/**
	 * Create the panel.
	 */
	public LogoInicio(String nomImg) {
            super();
            initialize();
            imgLogo=new ImageIcon(getClass().getResource(nomImg));
            setSize(imgLogo.getIconWidth(),imgLogo.getIconHeight());

	}
protected void paintComponent(Graphics g) {
	Dimension d=getSize();
	g.drawImage(imgLogo.getImage(),0,0,d.width,d.height,null);
	this.setOpaque(false);
	super.paintComponent(g);
}

	private void initialize() {
		// TODO Auto-generated method stub
		this.setSize(800,300);
		
	}

}
