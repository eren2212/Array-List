
import java.util.ArrayList;
import java.util.List;


public class ArrayListMain {
    
    
    public static void main(String[] args) {
        
        //ArrayList<String> arraylist = new ArrayList();
        List<String> list = new ArrayList<String>();
        
        list.add("java");
        list.add("c++");
        list.add("Pyhton");
        
        System.out.println(list.get(0));
        System.out.println("*****************************");
        for(int i= 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("*****************************");
        for(String s:list){
            System.out.println(s);
        }
        System.out.println("*****************************");
    }
}
