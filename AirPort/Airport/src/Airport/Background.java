package Airport;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ImagePanel extends JPanel {
	private Image img;

	public ImagePanel(Image img) {
		this.img = img;
		setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setLayout(null);
	}

	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
}

public class Background {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Kosmo Air");
		frame.setSize(450, 300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		ImagePanel panel = new ImagePanel(new ImageIcon("./Image/kosmi01.jpg").getImage());
		frame.add(panel);
		frame.pack();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
