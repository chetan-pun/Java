import java.awt.*;
import java.awt.event.*;
import java.lang.String;


public class WindowAndMouseEvent extends Frame implements MouseListener , MouseMotionListener {
     Label t1,t2;
    WindowAndMouseEvent(){
       t1 = new Label();
       t2 = new Label();
       addMouseListener(this);
       t1.setBounds(20,50,100,20);
       t2.setBounds(20,70,300,20);
        addMouseMotionListener(this);
       setSize(400,400);
       add(t1);
       add(t2);

       setLayout(null);
       setVisible(true);
    }
    public void mouseEntered(MouseEvent e){
         t1.setText("Inside");
    }
    public void mouseExited(MouseEvent e){
        t1.setText("Outside");
    }
    public void mouseClicked(MouseEvent e){}
    public void mousePressed(MouseEvent e){};
    public void mouseReleased(MouseEvent e){}

    public void mouseDragged(MouseEvent e){

    }
    public void mouseMoved(MouseEvent e){
        String s = "X-axis = " +e.getX() + " Y-axis = " + e.getY();
        t2.setText(s);
    }



    public static void main(String args[]){
        WindowAndMouseEvent w = new WindowAndMouseEvent();
    }

}
