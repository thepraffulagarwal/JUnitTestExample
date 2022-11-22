package jUnitTestPack;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({testAddNumbers.class, TestAddStrings.class})
public class AllTests {

}
