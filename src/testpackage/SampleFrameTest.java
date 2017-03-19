package test;

import static org.junit.Assert.*;

import org.fest.swing.core.BasicRobot;
import org.fest.swing.core.Robot;
import org.fest.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SampleFrameTest {

  private Robot robot;
  private SampleFrame frame;
  private FrameFixture fixture;

  @Before
  public void setUp() {
    robot = BasicRobot.robotWithNewAwtHierarchy();
    frame = new SampleFrame();
    fixture = new FrameFixture(robot, frame);
  }

  @After
  public void tearDown() {
    robot.cleanUp();
  }

  @Test
  public void testOpen() {
    fixture.textBox("テキストフィールド").requireText("");
  }

  @Test
  public void testClick1() {
    fixture.textBox("テキストフィールド").requireText("");
    fixture.button("ボタン").click();
    fixture.textBox("テキストフィールド").requireText("あ");
  }

  @Test
  public void testClick2() {
    fixture.button("ボタン").click();
    assertEquals(fixture.textBox("テキストフィールド").text(), ("あ"));
  }

}