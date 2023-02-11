import java.awt.*;
import java.awt.event.*;
import java.lang.String;



public class OtherEvents extends Frame implements KeyListener {
    Label l;
    TextField t;
    OtherEvents(){
       l = new Label("Key Released");
       t = new TextField();

       t.addKeyListener(this);
       setSize(400,200);
       add(l);
       add(t);
       setLayout(new GridLayout(2,1));
       setVisible(true);

    }


    public void keyPressed(KeyEvent e){
         l.setText("Key Pressed");
    }

    public void keyReleased(KeyEvent e){
        l.setText("Key Released");
    }

    public void keyTyped(KeyEvent e){

    }

    public static void main(String args[]){
        OtherEvents e = new OtherEvents();
    }
}
