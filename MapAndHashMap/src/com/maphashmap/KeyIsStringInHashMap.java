package com.maphashmap;

import java.util.HashMap;
import java.util.Map;

public class KeyIsStringInHashMap {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("aaa", 1);
		map.put("bbb", 2);
		map.put("ccc", 3);
		map.put("ccc", 4);
		
	}

}
