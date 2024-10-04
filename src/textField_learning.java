import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class textField_learning {
   public static void main (String args[])

        {
            TextField tf = new TextField( "Default", 20 );
            tf.addActionListener((ActionListener) new Listener());
        }

    static class Listener
    {
        public void actionPerformed( ActionEvent ae )
        {
    TextField tf = (TextField)ae.getSource();
            System.out.println( tf.getText() );
        }
    }
}
