package Collectionspractise;

import java.util.ArrayList;
import java.util.List;

public class CollectionsList {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		list.add(600);
		list.add(700);

		/*for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}*/

		List<Integer> list2 = new ArrayList<>();

		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(40);
		list2.add(50);
		list2.add(60);
		list2.add(70);
		
		list2.addAll(list);
		
		/*for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}*/
		
		list2.retainAll(list);
		
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}

	}
}
