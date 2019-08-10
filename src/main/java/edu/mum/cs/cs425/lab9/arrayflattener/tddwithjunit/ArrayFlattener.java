package edu.mum.cs.cs425.lab9.arrayflattener.tddwithjunit;

import java.util.ArrayList;
import java.util.List;

public class ArrayFlattener {

	public int[] flattenArray(int[][] arr) {
		if(arr == null)
			return null;
		List<Integer> result = new ArrayList();
		for(int[] child: arr) {
			for(int i: child) {
				result.add(i);
			}
		}
		
		return result.stream().mapToInt(Integer::intValue).toArray();
	}
}
