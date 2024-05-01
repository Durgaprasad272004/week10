import java.util.HashMap;
import java.util.Map;
public class mapInterface {
public static void main(String[] args) {
Map<String,Integer> obj=new HashMap<String,Integer>();
obj.put("durga", 1);
obj.put("prasad", 2);
obj.put("venkat", 3);
obj.put("vanitha", 4);
for(Map.Entry<String,Integer> m:obj.entrySet()){
System.out.println(m.getKey()+" = "+m.getValue());
}
}
}
