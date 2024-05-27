import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.image.BufferedImage;


import javax.imageio.ImageIO;
public class ApplicationRobot{

    public static void main(String[]args) throws Exception{
        Robot emma = new Robot();
        emma.setAutoDelay(200);

        emma.mouseMove(0,1080);
        emma.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        emma.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        emma.mouseMove(100,960);
        emma.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        emma.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        
        emma.mouseMove(1830,550);
        emma.setAutoDelay(1000);
        emma.mouseMove(1860,550);
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

        Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage image = emma.createScreenCapture(Rectangle.screenRect)
        File file = new File("screenshot.png");

    }
}