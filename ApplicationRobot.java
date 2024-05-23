import java.awt.*;
import java.awt.event.InputEvent;
public class ApplicationRobot{

    public static void main(String[]args) throws Exception{
    
        Robot emma = new Robot();
        emma.setAutoDelay(200);

        emma.mouseMove(0,1080);
        emma.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        emma.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        emma.mouseMove(100,820);
        emma.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        emma.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        
        emma.mouseMove(1310,500);
        emma.setAutoDelay(1000);
        emma.mouseMove(1320,500);
        emma.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        emma.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        emma.mouseMove(1320,800);
        emma.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        emma.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        emma.mouseMove(820,150);
        emma.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        emma.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        emma.mouseMove(820,265);
        emma.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        emma.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);


    }
}