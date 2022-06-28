import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;
    MyFrame(){
        ImageIcon icon = new ImageIcon("muka.png");
        ImageIcon icon2 = new ImageIcon("ok.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150,250,150,150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(150,50,150,100);
        button.addActionListener(this);
        button.setText("Button");
        button.setFocusable(false); //removes text outline on the button
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.BOLD,25));
        button.setIconTextGap(10);
        button.setForeground(Color.red);
        button.setBackground(Color.PINK);
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println("You pressed the button and now it's disabled");
            button.setEnabled(false);
            label.setVisible(true);
        }
    }
}
