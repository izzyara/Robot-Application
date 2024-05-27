import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
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
        emma.mouseMove(1850,550);
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
 
        emma.keyPress(KeyEvent.VK_SHIFT + KeyEvent.VK_WINDOWS + KeyEvent.VK_S);
    }
}