import javax.swing.*;
import java.awt.*;

public class ContactUs {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Contact Us !");
        JLabel welcomeMsg = new JLabel("Contact us");
        JLabel name =new JLabel("Enter Your Name    : ");
        JLabel email =new JLabel("Enter Your Email     : ");
        JLabel phone =new JLabel("Enter Your Phone   : ");
        JLabel msg =new JLabel("Message   : ");
        JLabel hero = new JLabel();

        JButton submitButton = new JButton(" Submit ");


        JTextField textName = new JTextField();
        JTextField textEmail = new JTextField();
        JTextField textPhone = new JTextField();
        JTextArea textMsg = new JTextArea();

        //label area
        welcomeMsg.setBounds(200,10,100,25);
        welcomeMsg.setFont( new Font("Serif",Font.PLAIN,22));
        name.setBounds(100,100,200,20);
        name.setFont(new Font("Serif",Font.BOLD,18));
        email.setBounds(100,150,200,20);
        email.setFont(new Font("Serif",Font.BOLD,18));
        phone.setBounds(100,200,200,20);
        phone.setFont(new Font("Serif",Font.BOLD,18));
        msg.setBounds(100,250,200,20);
        msg.setFont(new Font("Serif",Font.BOLD,18));
        hero.setBounds(150,50,200,80);
        hero.setSize(500,400);

        //text area
        textName.setBounds(300,100,200,25);
        textName.setFont(new Font("Serif",Font.PLAIN,18));
        textEmail.setBounds(300,150,200,25);
        textEmail.setFont(new Font("Serif",Font.PLAIN,18));
        textPhone.setBounds(300,200,200,25);
        textPhone.setFont(new Font("Serif",Font.PLAIN,18));
        textMsg.setBounds(300,250,200,150);
        textMsg.setFont(new Font("Serif",Font.PLAIN,18));

        hero.setIcon(new ImageIcon("src/contactus.png"));

        //button and action
        submitButton.setBounds(300,430,100,30);
        submitButton.setFont(new Font("Serif",Font.BOLD,18));


        //frame
        frame.setBounds(300,160,600,600);
        Image icon =Toolkit.getDefaultToolkit().getImage("src/phone.png");
        frame.add(welcomeMsg);
        frame.setIconImage(icon);
        frame.add(name);
        frame.add(email);
        frame.add(phone);
        frame.add(hero);
        frame.add(msg);
        frame.add(textName);
        frame.add(textEmail);
        frame.add(textPhone);
        frame.add(textMsg);
        frame.add(submitButton);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
