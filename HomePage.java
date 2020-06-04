import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HomePage extends WindowAdapter implements ActionListener
{
	JFrame f;
	Label h1,h2,h3;
	Button admin,passenger;
	
	public HomePage()
	{
		f = new JFrame();

		JPanel login = new JPanel();
   		login.setSize(600,350);
   		login.setLayout(null);
  		login.setBackground(new Color(0,0,0,60));
                login.setBounds(200,100,600,500);
   
    
    ImageIcon background_image = new ImageIcon("background.jpg");

    JLabel background = new JLabel("",background_image,JLabel.CENTER);
    background.setBounds(0,0,1200,700);
    f.add(background);
    background.add(login);
		
		h1 = new Label("WELCOME");
		h2 = new Label("TO");
		h3 = new Label("SIMPLE AIRLINE BOOKING SYSTEM");
		
		admin = new Button("Admin");
		passenger = new Button("Passenger");
		
		h1.setBounds(320,60,70,30);
                h1.setForeground(Color.WHITE);
		h2.setBounds(340,90,20,30);
                h2.setForeground(Color.WHITE);
		h3.setBounds(260,120,220,30);
                h3.setForeground(Color.WHITE);
		
		admin.setBounds(320,230,80,30);
		passenger.setBounds(320,270,80,30);
		
		admin.addActionListener(this);
		passenger.addActionListener(this);
		
		login.add(h1);
		login.add(h2);
		login.add(h3);
		
		login.add(admin);
		login.add(passenger);
		
		f.setTitle("Home Page");
		f.addWindowListener(this);
		f.setLayout(null);
		f.setSize(1200,700);
		f.setVisible(true);
	}
	
	
	public void windowClosing(WindowEvent e){
				f.dispose();
			}
			
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == admin)
		{
			
			new Airline2();
			
		}
		
		else if(ae.getSource() == passenger)
		{
			
			
			new Airline1();
		}
	}
	
	public static void main(String args[])
	{
		HomePage hp = new HomePage();
	}
}
