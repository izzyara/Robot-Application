import java.awt.*;
import java.awt.event.InputEvent;
public class ApplicationRobot{

    public static void main(String[]args) throws Exception{
    
        Robot emma = new Robot();

        emma.mouseMove(0,0);
        Color color = emma.getPixelColor(1500,500);
        emma.mousePress(InputEvent.BUTTON1_DOWN_MASK);

        System.out.println(color);
    }
}