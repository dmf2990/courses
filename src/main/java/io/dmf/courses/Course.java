package io.dmf.courses;

public class Course {

	private Long courseId;

	public Course(Long courseId, String string, String string2) {
		this.courseId = courseId;
	}

	public Long getId() {
		return courseId;
	}

}
