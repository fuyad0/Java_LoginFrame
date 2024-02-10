
package com.mycompany.loginframe;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class LoginFrame extends JFrame {
    private JLabel userLabel, passLabel;
    private JTextField tf;
    private JPasswordField pf;
    private JButton LoginButton, ClearButton;
    private Container c;
    
    LoginFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(250, 190, 420, 350);
        this.setTitle("User Login Frame");
        c=getContentPane();
        c.setLayout(null);
        c.setBackground(Color.cyan);
        
        userLabel= new JLabel ("User Name");
        userLabel.setBounds(50, 50, 150, 50);
        c.add(userLabel);
        
        tf=new JTextField("Username");
        tf.setBounds(150,50,150,50);
        c.add(tf);
        
        passLabel= new JLabel("Password");
        passLabel.setBounds(50,120,150,50);
        c.add(passLabel);
        
        pf =new JPasswordField();
        pf.setBounds(150,120,150,40);
        c.add(pf);
        
        LoginButton= new JButton("Login");
        LoginButton.setBounds(150,180,100,30);
        c.add(LoginButton);
        
         ClearButton= new JButton("Clear");
        ClearButton.setBounds(150,180,100,30);
        c.add(ClearButton);
    }

    public static void main(String[] args) {
        LoginFrame frame= new LoginFrame();
        frame.setVisible(true);
    }
}
