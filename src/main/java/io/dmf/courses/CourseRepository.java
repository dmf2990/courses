package io.dmf.courses;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class CourseRepository {

	private Map<Long, Course> courseList = new HashMap<>();

	public CourseRepository(Course course) {
		courseList.put(course.getId(), course);
	}

	public Course findOne(Long id) {
		return courseList.get(id);
	}

}
