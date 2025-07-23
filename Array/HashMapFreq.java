package Array;
import java.util.HashMap;

public class HashMapFreq {
             public static void main(String args[])
               {
                  int []arr={1,1,1,2,2,3,4,5,};
                  HashMap<Integer,Integer>map=new HashMap<>();
                  for(Integer val:arr)
                  {  if(!map.containsKey(val))
                    {
                    map.put(val,1);
                    }
                    else{
                        map.put(val,map.get(val)+1);
                    }
                  }
                  System.out.println(map);

               }
}
