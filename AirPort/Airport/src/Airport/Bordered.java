package Airport;

import javax.swing.*;
import java.awt.Dimension;
import javax.swing.plaf.TabbedPaneUI;
import javax.swing.plaf.metal.MetalTabbedPaneUI;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Insets;
public class Bordered{
    public static void main(String[] args){
        JFrame frame = new JFrame("border check");
        JPanel content = new JPanel();
        JTabbedPane tabs = new JTabbedPane();
        JPanel one = new JPanel();
        one.add(new JLabel("first tab"));
        one.setOpaque(true);
        one.setBackground(Color.WHITE);
        JPanel two = new JPanel();
        two.add(new JLabel("second tab"));
        tabs.add("one", one);
        tabs.add("two", two);
        tabs.setUI( new MetalTabbedPaneUI(){
            @Override
            protected void paintContentBorder(Graphics g, int placement, int selectedIndex){
                int width = tabPane.getWidth();
                int height = tabPane.getHeight();
                Insets insets = tabPane.getInsets();
                Insets tabAreaInsets = getTabAreaInsets(placement);
                int x = insets.left;
                int y = insets.top;
                int w = width - insets.right - insets.left;
                int h = height - insets.top - insets.bottom;
                y += calculateTabAreaHeight(placement, runCount, maxTabHeight);
                h -= (y - insets.top);
                //g.fillRoundRect(x, y, w, h, 5, 5);
            }
        });
        tabs.setPreferredSize(new Dimension(400, 200));
        content.add(tabs);
        frame.setContentPane(content);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}