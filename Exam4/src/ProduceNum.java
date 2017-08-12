import java.util.ArrayList;
import java.util.TreeMap;

public class ProduceNum {
	ArrayList<Integer> list=new ArrayList<Integer>();
	TreeMap<Integer,Integer> map=new TreeMap<Integer,Integer>();
    public ProduceNum() {
    	int num;
		for(int i=0;i<50;i++)
		{
		    num=(int)(Math.random()*100);
			list.add(num);
			map.put(num/10, num);
		}
	}
   public ArrayList<Integer> getList() {
	   return list;
   }
   public TreeMap<Integer, Integer> getMap() {
	   return map;
   }
}
