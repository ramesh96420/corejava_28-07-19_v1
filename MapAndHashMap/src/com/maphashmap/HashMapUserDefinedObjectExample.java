package com.maphashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.maphashmap.bean.Persion;

public class HashMapUserDefinedObjectExample {

	public static void main(String args[]){
		
		// Creating a Persion
		Persion persion1 = new Persion(1, "A", "HYD");
		Persion persion2 = new Persion(2, "B", "BANG");
		Persion persion3 = new Persion(3, "C", "PUNE");
		Persion persion4 = new Persion(4, "D", "UP");
		
		// Creating a HashMap
		Map<Integer, Persion> persionMap = new HashMap<>(); 
		
		// Adding key-value pairs in HashMap
		persionMap.put(persion1.getId(), persion1);
		persionMap.put(persion2.getId(), persion2);
		persionMap.put(persion3.getId(), persion3);
		persionMap.put(persion4.getId(), persion4);
		
		persionMap.forEach((id, persion) -> System.out.println(id +" "+ persion));
		
		System.out.println();
		
		// Print the Persion details in revers order
		System.out.println("Print the Persion details in revers order ");
		List<Integer> listOfKeys = new ArrayList<>(persionMap.keySet());
		Collections.reverse(listOfKeys);
		
		for(Integer key : listOfKeys){
			System.out.println(key +" "+ persionMap.get(key));
		}
		
		/**
		 * OutPut:-
		 * 1 Persion [id=1, persionName=A, city=HYD]
			2 Persion [id=2, persionName=B, city=BANG]
			3 Persion [id=3, persionName=C, city=PUNE]
			4 Persion [id=4, persionName=D, city=UP]
			
			Print the Persion details in revers order 
			4 Persion [id=4, persionName=D, city=UP]
			3 Persion [id=3, persionName=C, city=PUNE]
			2 Persion [id=2, persionName=B, city=BANG]
			1 Persion [id=1, persionName=A, city=HYD]
		 **/
	}
}
