package klu.junittesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import klu.junittestig.Removing_Starting_two_As;

public class Removing_Starting_two_As_Test {
/*
 *TODO list
 *Testcases
 *assuming all cases are case insensitive
 *1)null string - "" SUCCEED 
 *2)one char - "A"  - Succeed
 *3)one char without A - "B" - Succeed
 *4)two char with two a's - "AA" - Succeed
 *5)two char with one a  - AB - Succeed
 *6)two char with no a - "BB" - Succeed
 *7)two char with a at right side - "BA" - Succeed
 *8) n char with two a's at starting - "AAB" - Succeed
 *9)n char with no "aa" "BBB' - Succeed
 *10)n char with  a at 0 - Succeed
 *11)n char with a at 1 position - Succeed
 *12)n characters with a at position 1 and 2 - Succeed
 * */
Removing_Starting_two_As removeTwoAs;
@BeforeEach
void setup()
{
	removeTwoAs = new Removing_Starting_two_As();
}
@Test
void  testNullString()
{
	
	assertEquals("",removeTwoAs.remove(""));
}
@Test
void testOneCharWithA()
{
	assertEquals("",removeTwoAs.remove("A"));
}
@Test
void testOneCharWithoutA()
{
	assertEquals("b",removeTwoAs.remove("B"));
}
@Test
void testTwoCharsWithTwoAs()
{
	assertEquals("", removeTwoAs.remove("AA"));
}
@Test
void testTwoCharsWithAatLeftSide()
{
	assertEquals("b", removeTwoAs.remove("AB"));
}
@Test
void testTwoCharsWithAatRightSide()
{
	assertEquals("b", removeTwoAs.remove("BA"));
}
@Test
void testTwoCharsWithNoAs()
{
	assertEquals("bb", removeTwoAs.remove("BB"));
}
@Test
void testNCharsWithTwoAsAtStarting()
{
	assertEquals("a", removeTwoAs.remove("AAA"));
}
@Test
void testNCharsWithNoAsAtStarting()
{
	assertEquals("bbb", removeTwoAs.remove("BBB"));
}
@Test
void testNCharsWithA_at_0_Position()
{
	assertEquals("bb", removeTwoAs.remove("ABB"));
}
@Test
void testNCharsWithA_at_1_Position()
{
	assertEquals("bb", removeTwoAs.remove("BAB"));
}
@Test
void testNCharsWithA_at_1and2_Position()
{
	assertEquals("ba", removeTwoAs.remove("BAA"));
}
}
