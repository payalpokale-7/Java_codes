import java.awt.*;
import java.io.*;
import javax.imageio.*;
import java.awt.image.BufferedImage;
public class screen {
    public static void main(String args[]) {
        try{
            Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
            Robot robot = new Robot();
            BufferedImage img = robot.createScreenCapture(new Rectangle(size));
            File save_path = new File("screen.jpg");
            ImageIO.write(img, "JPG", save_path);
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    
}
