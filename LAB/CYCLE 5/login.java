import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Login implements ActionListener {
    JLabel l1, l2; 
    JTextField t1, t2; 
    JButton b1, b2; 

    Login() {
        JFrame f = new JFrame("Login");
        l1 = new JLabel("Username: ");
        t1 = new JTextField(32);
        l2 = new JLabel("Password: ");
        t2 = new JTextField(32);
        b1 = new JButton("Submit");
        b2 = new JButton("Clear");

        JPanel p = new JPanel(new GridLayout(4, 1));
        JPanel p1 = new JPanel(new GridLayout(2, 1));

        p.add(l1);
        p.add(t1);
        p.add(l2);
        p.add(t2);
        p1.add(b1);
        p1.add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        f.setLayout(new FlowLayout());
        f.add(p);
        f.add(p1);
        
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        f.setVisible(true); 
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s.equals("Submit")) {
            JOptionPane.showMessageDialog(null, "Submitted: " + t1.getText()); 
            t1.setText("");
            t2.setText(""); 
        } else if (s.equals("Clear")) {
            t1.setText(""); 
            t2.setText(""); 
        }
    }

    public static void main(String[] args) {
        new Login(); 
    }
}
