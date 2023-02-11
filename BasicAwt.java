import java.awt.*;



public class AWTJava extends Frame {

    AWTJava(){
        Button b = new Button("Click me");
        Checkbox c = new Checkbox();
        Label l = new Label("Password");
        TextField t = new TextField();
        t.setBounds(20,350,100,40);
        l.setBounds(20,300,100,30);
        c.setBounds(30,200,30,30);
        b.setBounds(30,100,100,30);
        setSize(400,1000);
        setLayout(null);
        setVisible(true);
        add(b);
        add(c);
        add(l);
        add(t);
    }

    public static void main(String args[]){
        AWTJava a = new AWTJava();
    }
}
