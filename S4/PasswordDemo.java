import java.awt.*;
import java.awt.event.*;

class InvalidPasswordException  extends Exception
 {
    InvalidPasswordException()
       {
        System.out.println("User name & Password is not same ");
       } 
 }
public class PasswordDemo extends Frame implements ActionListener
  {
     Label uname , upass ;
     TextField nametext ;
     TextField passtext ,msg ;
     Button Login , Clear ;
      Panel p ;
      int attempts = 0 ;
      char c = '#' ;     
  


public void Login()
{
  p=new Panel();
  uname=new Label("Use Name: ", Label.CENTER);
  upass=new Label("Password: ",Label.RIGHT);
  
  nametext=new TextField(20);
  passtext=new TextField(20);
  passtext.setEchoChar(c);
  msg=new TextField(20);
  msg.setEditable(false);
  
  Login=new Button("Login");
  Clear=new Button("Clear");
  Login.addActionListener(this);
  Clear.addActionListener(this);
  
  p.add(uname);
  p.add(nametext);
  p.add(upass);
  p.add(passtext);
  p.add(Login);
  p.add(Clear);
  p.add(msg);
  add(p);
  
  setTitle("Login");
  setSize(290,200);
  setResizable(false);
  setVisible(true);
  }
  
  public void actionPerformed(ActionEvent ae)
    {
       Button btn=(Button)(ae.getSource());
       
       if(attempts<3)
          {
       if((btn.getLabel()=="Clear"))
           {
             nametext.setText("");
             passtext.setText("");
           }      
           if((btn.getLabel()).equals("Login"))
           {
             try
             { 
              String user= nametext.getText();
              String upass = passtext.getText();
              
                   if(user.compareTo(upass)==0)
                     {
                       msg.setText("Valid");
                       System.out.println("Username is valid");
                       }
              else
                {
                  throw new InvalidPasswordException();
                  }
           }
           catch(Exception e)
             {
               msg.setText("Error");
             }
      attempts++;
      }
    }
    else
    {
        System.out.println("Your 3 attempts are comleted");
        System.exit(0);
    }
   }
   
   public static void main (String args[])
      {
        PasswordDemo pd = new PasswordDemo();
        pd.Login();
        }
    }
