package edu.mum.cs.cs425.lab9.arrayflattener.tddwithjunit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayFlattenerTest {
	
	private ArrayFlattener flattener = null;

	@Before
	public void setUp() throws Exception {
		this.flattener = new ArrayFlattener();
	}

	@After
	public void tearDown() throws Exception {
		this.flattener = null;
	}

	@Test
	public void testFlattenArray() {
//		fail("Not yet implemented");
		int[][] a_in = {{1,3}, {0}, {4,5,9}};
		int[] expected = {1, 3, 0, 4, 5, 9};
		int[] actual = this.flattener.flattenArray(a_in);
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testFlattenArrayNull() {
//		fail("Not yet implemented");
		int[][] a_in = null;
		Assert.assertNull(
                "Input is null",
                flattener.flattenArray(a_in)
        );
	}

}
