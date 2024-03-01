package mvc2;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MemberDAO2Test {
	MemberDAO2 m =new  MemberDAO2();

	@Test
	void testGetList() {
	
		
		ArrayList<String> list = m.getList();
		
		assertTrue( list !=null);
		
	}

}
