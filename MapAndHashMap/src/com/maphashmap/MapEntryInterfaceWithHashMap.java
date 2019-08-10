package com.maphashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEntryInterfaceWithHashMap {

	public static void main(String agrs[]){
		
		Map<String, String> map = new HashMap<>();
		map.put("Ramesh", "9642063263");
		map.put("Naresh", "9632587412");
		map.put("Charan", "8521479632");
		map.put("Pandu", "9632587412");
		
		Set<Map.Entry<String, String>> entryValues = map.entrySet();
		
		for(Map.Entry<String, String> entryValue : entryValues){
			System.out.println(entryValue.getKey() +" "+ entryValue.getValue());
		}
		
		/**
		 * OutPut:-
		 * Ramesh 9642063263
			Pandu 9632587412
			Naresh 9632587412
			Charan 8521479632
		 **/
	}
}
