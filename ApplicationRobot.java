import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File; 


public class ApplicationRobot{

    public static void main(String[]args) throws Exception{
        Robot emma = new Robot();
        emma.setAutoDelay(200);

        emma.mouseMove(0,1080);
        emma.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        emma.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        emma.mouseMove(100,905);
        emma.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        emma.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        emma.setAutoDelay(1000);
        emma.mouseMove(1830,540);
        emma.mouseMove(1860,540);
        emma.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        emma.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        
        emma.mouseMove(1870,1010);
        emma.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        emma.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        emma.mouseMove(1050,60);
        emma.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        emma.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        emma.mouseMove(1050,170);
        emma.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        emma.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle bounds = new Rectangle(screenSize);
        BufferedImage image= emma.createScreenCapture(bounds); 
        File file = new File("myScreenShot.png");
        ImageIO.write(image,"png", file);
        System.out.println("A screenshot is captured to " + file.getPath()); 


    }
}