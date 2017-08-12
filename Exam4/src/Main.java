import java.util.ArrayList;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		ProduceNum p=new ProduceNum();
		ArrayList<Integer> list=p.getList();
		TreeMap<Integer,Integer>map=p.getMap();
		System.out.println("随机生成的50个小于100的数如下：");
		System.out.println(list);
		System.out.println("map中的数据为：");
		System.out.println(map);
	}
}
