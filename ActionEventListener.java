import java.awt.*;
import java.awt.event.*;
import java.lang.String;


public  class EventHandling extends Frame implements ActionListener {
    TextField t;
    Label l1,l2;
    Button b;
    EventHandling(){
        l1 = new Label("Password");
        l2 = new Label();
        t = new TextField(10);
        b = new Button("OK");
        t.setEchoChar('*');
        setSize(400,400);
        setLayout(new GridLayout(4,1));
        add(l1);
        add(t);
        add(l2);
        add(b);
        setVisible(true);
        b.addActionListener(this);


    }

    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();
        String pass;
        if(s.equals("OK")){
            pass = t.getText();
            if(pass.equals("pass")){
                l2.setText("Correct Password");
                l2.setBackground(Color.cyan);
            }
            else{
                l2.setText("Incorrect Password");
                l2.setBackground(Color.red);
            }
        }

    }




    public static void main(String args[]){
        new EventHandling();
    }

}
