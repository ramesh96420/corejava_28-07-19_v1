package com.sort.mapobject;

import java.util.HashMap;
import java.util.Map;

public class RemovingDublicateElementFromMap {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("asss", 1);
		map.put("poa", 25);
		map.put("pos", 45);
		map.put("ios", 7);
		map.put("oos", 5);
		map.put("osp", 45);
		map.put("asss", 11);
		map.put("poa", 250);
		map.put("pos", 41);
		
		//map.entrySet().stream().distinct()

	}

}
