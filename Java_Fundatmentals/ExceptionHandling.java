import java.util.ArrayList;
import java.lang.*;
public class ExceptionHandling{

    public static void main(String[] args) {
        ArrayList<Object> someList = new ArrayList<Object>();
        someList.add(1);
        someList.add("name");
        someList.add("address");
        someList.add(2);
        try{
            for (int i =0; i < someList.size(); i++){
                Integer castedVal = (Integer) someList.get(i);
                someList.add(castedVal);
            }
            System.out.println("casted "+someList);
        } catch (ClassCastException e) {
            System.out.println("Sorry Cannot cast to String to integer    "+e);
        }

    }
}