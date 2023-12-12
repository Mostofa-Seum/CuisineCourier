package classes;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;


class BackgroundPanel extends JPanel{
    private Image backgroundImage;

    // public BackgroundPanel (String imagePath)
    //  {
    //      this.backgroundImage=new ImageIcon(imagePath).getImage();   
    // }

      

    public BackgroundPanel(String imagePath) {
        URL imgUrl = getClass().getResource(imagePath);
        if (imgUrl != null) {
            this.backgroundImage = new ImageIcon(imgUrl).getImage();
        } else {
            System.out.println( imagePath);
        }
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        if(backgroundImage != null)
        {
            g.drawImage(backgroundImage,0,0,getWidth(),getHeight(),this);
        }
    }


}

public class Login extends JFrame implements ActionListener{
    
    ImageIcon icon;
    JPanel p1;
    JLabel  l,ll, l1,l2,l3;
    BackgroundPanel bg;
    Font f1,f2;
    JTextField tf1,tf2;
    JPasswordField pass;
    JButton b1,b2,b3;
    JCheckBox cb;

    public Login()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0,0,1920,1080);
        setLayout(null);
       
        
         bg = new BackgroundPanel("/images/login.png");
         bg.setLayout(null);
   
         Image logo = new ImageIcon(getClass().getResource("/images/logo.png")).getImage();
         Image resizeLogo = logo.getScaledInstance(1000,1000,Image.SCALE_SMOOTH);

        icon = new ImageIcon(resizeLogo);
       this.setIconImage(icon.getImage());



        l = new JLabel("Welcome");
        l.setBounds(145,200,600,35);
        l.setForeground(Color.black);
        f1 = new Font("Castellar",Font.BOLD,40);
        l.setFont(f1);
        bg.add(l);

         ll = new JLabel("Cusinne Courier");
         ll.setBounds(105,250,600,40);
        ll.setForeground(Color.black);
        f1 = new Font("Castellar",Font.BOLD,32);
        ll.setFont(f1);
        bg.add(ll);

        l1 = new JLabel("User Name ");
        l1.setBounds(30,320,300,40);
        l1.setForeground(Color.black);
        l1.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        f1 = new Font("Segoe UI",Font.PLAIN,25);
        l1.setFont(f1);
        bg.add(l1);


        l2 = new JLabel("Password");
        l2.setBounds(30,393,300,40);
        l2.setForeground(Color.black);
        l2.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        f1 = new Font("Segoe UI",Font.PLAIN,25);
        l2.setFont(f1);
        l2.setBorder(null);
        bg.add(l2);

        l3 = new JLabel("Don't have an account?");
        l3.setBounds(155,550,230,30);
        l3.setForeground(Color.black);
        f1 = new Font("Segoe UI",Font.PLAIN,20);
        l3.setFont(f1);
        bg.add(l3);


        l3 = new JLabel("");
        l3.setBounds(155,550,230,30);
        l3.setForeground(Color.black);
        f1 = new Font("Segoe UI",Font.PLAIN,20);
        l3.setFont(f1);
        bg.add(l3);





        tf1 = new JTextField();
        tf1.setBounds(180,326,320,30);
        tf1.setForeground(Color.black);
        tf1.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        tf1.setCaretColor(Color.black);
        f1 = new Font("Segoe UI",Font.PLAIN,18);
        tf1.setFont(f1);
        tf1.setBorder( new LineBorder(Color.black));
        bg.add(tf1);

        pass = new JPasswordField();
        pass.setBounds(180,400,320,30);
        pass.setForeground(Color.black);
        pass.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        pass.setCaretColor(Color.black);
        f1 = new Font("Segoe UI",Font.BOLD,18);
        pass.setFont(f1);
        pass.setBorder( new LineBorder(Color.black));
        bg.add(pass);

        cb = new JCheckBox("Remember me");
        cb.setBounds(30,440,168,60);
        cb.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cb.setForeground(Color.black);
        cb.setFocusPainted(false);
        f1 = new Font("Segoe UI",Font.PLAIN,20);
        cb.setFont(f1);
        cb.setContentAreaFilled(false);
        bg.add(cb);



        b1 = new JButton("Forget Password?");
        b1.setBounds(272,453,318,33);
        b1.setBackground(Color.white);
        b1.setForeground(Color.black);
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b1.setFocusPainted(false);
        f1 = new Font("Segoe UI",Font.PLAIN,20);
        b1.setFont(f1);
        b1.setBorder(new LineBorder(Color.black));
        b1.setContentAreaFilled(false);
        b1.setBorder(null);
        bg.add(b1);


        b2 = new JButton("Login");
        b2.setBounds(100,510,325,30);
        b2.setBackground(Color.white);
        b2.setForeground(Color.black);
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b2.setFocusPainted(false);
        f1 = new Font("Segoe UI",Font.PLAIN,18);
        b2.setFont(f1);
        b2.setBorder(new LineBorder(Color.black));
        bg.add(b2);



        b3 = new JButton("<html><u>SIGN UP<u><html>");
        b3.setBounds(350,552,100,30);
        b3.setBackground(Color.white);
        b3.setForeground(Color.black);
        b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3.setFocusPainted(false);
        f1 = new Font("Arial",Font.PLAIN,17);
        b3.setFont(f1);
        b3.setOpaque(false);
        b3.setBorder(null);
        b3.setContentAreaFilled(false);
        bg.add(b3);

        b3.addActionListener(this);



         //b3.addActionListener(new ActionListener() {

             

        add(bg);
        setContentPane(bg);
        setSize(1920,1080);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true); 

    
    }

    private void returnSignUp(){
        new SignUp();
        setVisible(false);
        dispose();
         }
    public void actionPerformed(ActionEvent a)
             {
                try {
                if (a.getSource() == b3)
                 {
                  returnSignUp();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    

