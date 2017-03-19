package testpackage;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class SampleFrame extends JFrame {

  private JButton btn;
  private JTextField textField;

  public SampleFrame() {
    setTitle("タイトル");
    setBounds(100, 100, 300, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

    Container contentPane = getContentPane();
    contentPane.setLayout(null);

    btn = new JButton("ボタン");
    btn.setName("ボタン");
    btn.setBounds(12, 87, 96, 21);
    btn.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        textField.setText("あ");
      }
    });
    contentPane.add(btn);

    textField = new JTextField();
    textField.setName("テキストフィールド");
    textField.setBounds(12, 43, 96, 21);
    textField.setColumns(10);
    contentPane.add(textField);

  }

  public static void main(String[] args) {
    SampleFrame frame = new SampleFrame();
  }

}