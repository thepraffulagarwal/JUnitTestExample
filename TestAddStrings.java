package jUnitTestPack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestAddStrings {

	@Test
	public void test() {
		jUnitFunctions junitstring = new jUnitFunctions();
		String res = junitstring.AddStrings("capstone", "project");
		assertEquals("capstoneproject", res);
	}
}
