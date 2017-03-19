package testpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Camera {
  public static void takeScreenShot(JFrame frame) {
    try {
      Robot robot = new Robot();
      BufferedImage image = robot.createScreenCapture(frame.getBounds());
      ImageIO.write(image, "PNG", new File("screenshot.png"));
    } catch (AWTException e1) {
      e1.printStackTrace();
    } catch (IOException e2) {
      e2.printStackTrace();
    }
  }
}