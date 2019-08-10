package com.maphashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Ramesh");
		map.put(2, "Jan");
		map.put(3, "Pavan");
		map.put(4, "Pavan");
		
		System.out.println(map);	//{1=Ramesh, 2=Jan, 3=Pavan, 4=Pavan}
		System.out.println(map.get(2));		//Jan
		System.out.println(map.keySet() +" and " + map.values());		//[1, 2, 3, 4] and [Ramesh, Jan, Pavan, Pavan]
		System.out.println(map.get(5));		//null
		System.out.println(map.get(6));		//null
	}
	
	/**
	 * OutPut:-
	 * {1=Ramesh, 2=Jan, 3=Pavan, 4=Pavan}
		Jan
		[1, 2, 3, 4] and [Ramesh, Jan, Pavan, Pavan]
		null
		null
	 **/

}
