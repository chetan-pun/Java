import java.lang.reflect.Field;
import java.lang.String;

class Reflect{
    String name;

    Reflect(String name){
        this.name = name;
    }
}

public class ReflectionExample {

    public static void main(String args[]){
        try{
            Reflect r = new Reflect("Chetan");
            Field privateField = Reflect.class.getDeclaredField("name");
            privateField.setAccessible(true);
            String name = (String) privateField.get(r);
            System.out.println(name);
        }
        catch(Exception e){
            System.out.println(e);
        }

    }

}
