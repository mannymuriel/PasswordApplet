import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class PasswordApplet extends Applet implements ActionListener
{
 String id, password;
 boolean success;
 String idArray[] = {"id", "poo"};
 String passwordArray[] = {"password", "pee"};
 Label headerLabel = new Label("Please type your ID and Password");
 Label idLabel = new Label("ID (case-sensetive):");
  TextField idField = new TextField(8);
 Label passwordLabel = new Label("Password (case-sensetive):");
  TextField passwordField = new TextField(8);
  Button loginButton = new Button("Login");
 public void init()
 {
  setBackground(Color.orange);
  setLayout(new FlowLayout(FlowLayout.LEFT,50,30));
  add(headerLabel);
  add(idLabel);
   add(idField);
   idField.requestFocus();
  add(passwordLabel);
   add(passwordField);
   passwordField.setEchoChar('*');
  add(loginButton);
   loginButton.addActionListener(this);
 }
 public void actionPerformed(ActionEvent e)
 {
  id = idField.getText();
  password = passwordField.getText();
  success = false;
  for(int i = 0; i < idArray.length; i++)
  { 
   if((idArray[i].compareTo(id)==0) && (passwordArray[i].compareTo(password)==0))
   {
    success = true;
   }
  }
  if(success == true)
  {
   headerLabel.setText("Login Successful.");
  }
  else
  {
   headerLabel.setText("Invalid. Try Again.");
   clearFields();
   idField.requestFocus();
  }
 }
 void clearFields()
 {
  idField.setText("");
  passwordField.setText("");
 }
}