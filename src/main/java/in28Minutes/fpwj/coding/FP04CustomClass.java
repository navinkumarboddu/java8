package in28Minutes.fpwj.coding;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Course {
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", category=" + category + ", reviewScore=" + reviewScore + ", noOfStudents="
				+ noOfStudents + "]";
	}

	public Course(String name, String category, int reviewScore, int noOfStudents) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}

}

public class FP04CustomClass {

	public static void main(String[] args) {
		List<Course> courses = Arrays.asList(new Course("Spring", "Framework", 98, 20000),
				new Course("Spring Boot", "Framework", 95, 18000), new Course("API", "Microservices", 97, 22000),
				new Course("Microservices", "Microservices", 96, 25000),
				new Course("FullStack", "FullStack", 91, 14000), new Course("AWS", "Cloud", 92, 21000),
				new Course("Azure", "Cloud", 99, 21000), new Course("Docker", "Cloud", 92, 20000),
				new Course("Kubernetes", "Cloud", 91, 20000));
	
		//allMatch, noneMatch, anyMatch
		
		Predicate<? super Course> reviewScoreGreaterThan95Predicate = c -> c.getReviewScore() > 95;
		
		Predicate<? super Course> reviewScoreGreaterThan90Predicate = c -> c.getReviewScore() > 90;
		
		Predicate<? super Course> reviewScoreLessThan90Predicate = c -> c.getReviewScore() < 90;
		
		System.out.println(courses.stream()
				.allMatch(reviewScoreGreaterThan95Predicate));
		
		System.out.println(courses.stream()
				.noneMatch(reviewScoreLessThan90Predicate));
		
		System.out.println(courses.stream()
			.anyMatch(reviewScoreLessThan90Predicate));
		
		System.out.println(courses.stream()
				.anyMatch(reviewScoreGreaterThan95Predicate));
	}

}
