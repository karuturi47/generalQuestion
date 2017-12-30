package com.veera.face.book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PairOfSum {
	public static void main(String[] args) {
		int[] a = { 1, 2, 4, 5, 7 };
		int[] b = { 5, 6, 3, 4, 8 };
		int sum = 9;
		ArrayList<Integer> str = sumPair(a, b, sum);
		Map<Integer, Integer> map=convertListToMap(str,sum);
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
		    System.out.println(entry.getKey() + "," + entry.getValue().toString());
		}
	}

	private static HashMap<Integer, Integer> convertListToMap(ArrayList<Integer> str, int sum) {
		
		Map<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<str.size();i++)
		{
			map.put(str.get(i), sum-str.get(i));
		}
		return (HashMap<Integer, Integer>) map;
		// TODO Auto-generated method stub
		
	}

	public static ArrayList<Integer> sumPair(int[] a, int[] b, int sum) {
		String str = "";
		ArrayList<Integer> newlist=new ArrayList<Integer>(); 
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] + b[j] == sum) {
//					if (!str.isEmpty()) {
//						str = str + ", " + a[i] + " " + b[j];
//					} else {
//						str = str + a[i] + " " + b[j];
//					}
					
					newlist.add(a[i]);
				}
			}
		}
		return newlist;
	}
}
