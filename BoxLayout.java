import java.awt.*;
import javax.swing.*;

public class SWINGJava extends Frame {

    SWINGJava(){


        for (int i = 0; i < 5 ; i++) {
           Label b = new Label("click");
           b.setBounds(0,0,0,20);
            add(b);

        }


        setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
        setSize(400,400);
        setVisible(true);


    }

    public static void main(String args[]){
        SWINGJava s = new SWINGJava();
    }
}
