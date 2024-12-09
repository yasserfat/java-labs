import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class shapeDrawer extends JPanel {

    private int x, y, radius;

    public shapeDrawer(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);


        g.setColor(Color.BLUE); 
        g.drawOval(100, 110, radius * 2, radius * 2);


       squareDrawer(g, x, y, radius*2);
    }

    private void squareDrawer(Graphics g, int x, int y, int size) {
        g.setColor(Color.BLACK);
        g.drawRect(x, y, size, size);
    }


    public static void main(String[] args) {
        int x = 50;       
        int y = 50;      
        int radius = 100;  

      
        JFrame frame = new JFrame("Shape Drawer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

  
        shapeDrawer shapePanel = new shapeDrawer(x, y, radius);
        frame.add(shapePanel);

   
        frame.setVisible(true);
    }
}