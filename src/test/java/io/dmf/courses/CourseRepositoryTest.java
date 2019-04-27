package io.dmf.courses;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class CourseRepositoryTest {
	
	private Long courseId = 1L;
	private Course course = new Course(courseId, "course name", "course description");
	
	@Test
	public void shouldFindACourse() {
		CourseRepository underTest = new CourseRepository(course);
		Course expected = underTest.findOne(courseId);
		assertThat(expected, is(course));
	}

}
