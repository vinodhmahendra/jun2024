package com.simplilearn;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class BlogPostTest {
	
	private final BlogPost blogPost = new BlogPost();
	
	
	@Test
	@Disabled("Disable until the addComment feature is implemented")
	void testAddComment() {
		blogPost.addComment("Great Post");
		assertEquals(1, blogPost.countComments());
	}
	
	
	
	@Test
	@Disabled("Disable until the countComments feature is implemented")
	void testCountComments() {
		blogPost.addComment("Interesting Read");
		assertEquals(1, blogPost.countComments(),"The comment count should be 1");
	}

}
