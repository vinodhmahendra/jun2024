package com.simplilearn.annotations;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisabledTests {
	
	@Test
	@Disabled("Disabled until bug #42 has been resolved")
	void testWillBeSkipped() {
		
	}
	
	@Test
	void testWillRun() {
		
	}

}
