import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FlightOptions extends JFrame{

    JLabel l;
    Button b1;
    Button b2;
    Button b3; 
    Button b4;
  FlightOptions(){
    
    JPanel login = new JPanel();
    login.setSize(600,350);
    login.setLayout(null);
    login.setBackground(new Color(0,0,0,60));
    login.setBounds(250,175,600,350);
    
    setLayout(null);
    setSize(1200,700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    ImageIcon background_image = new ImageIcon("background.jpg");

    JLabel background = new JLabel("",background_image,JLabel.CENTER);
    background.setBounds(0,0,1200,700);
    add(background);
    background.add(login);
    l = new JLabel("Select your options....");
    //l.setBounds(200,25,400,50);
    //login.add(l);
    setVisible(true);
     
    b1 = new Button("Book flight");
    b2 = new Button("Search flight");
    b3 = new Button("Cancel flight");
    b4 = new Button("Exit");
    
    b1.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){
           if(e.getSource()==b1)
              new Booking();
        }
     });
    
    login.add(b1);
    b1.setBackground(Color.GREEN);
    b1.setBounds(50,100,200,30);
  
    b2.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){
             if(e.getSource()==b2)
             new SearchFlight();
        }
     });
    login.add(b2);
    b2.setBackground(Color.BLUE);
    b2.setBounds(50,150,200,30);

    b3.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){
            if(e.getSource()==b3)
            new Cancel();
        }
     });
    
    login.add(b3);
    b3.setBackground(Color.RED);
    b3.setBounds(50,200,200,30);
    
     b4.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){
             System.exit(0);
        }
     });
  
    login.add(b4);
    b4.setBackground(Color.YELLOW);
    b4.setBounds(50,250,200,30);
     
    
  }

/*public static void main(String args[]){
  FlightOptions fo = new FlightOptions();
  }
 */
}

