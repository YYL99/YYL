import java.util.ArrayList;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		ProduceNum p=new ProduceNum();
		ArrayList<Integer> list=p.getList();
		TreeMap<Integer,Integer>map=p.getMap();
		System.out.println("������ɵ�50��С��100�������£�");
		System.out.println(list);
		System.out.println("map�е�����Ϊ��");
		System.out.println(map);
	}
}
