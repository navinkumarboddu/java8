package in28Minutes.fpwj.coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
		return name + ":" + noOfStudents + ":" + reviewScore;
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

		// allMatch, noneMatch, anyMatch

		Predicate<? super Course> reviewScoreGreaterThan95Predicate = c -> c.getReviewScore() > 95;

		Predicate<? super Course> reviewScoreGreaterThan90Predicate = c -> c.getReviewScore() > 90;

		Predicate<? super Course> reviewScoreLessThan90Predicate = c -> c.getReviewScore() < 90;

		System.out.println(courses.stream().allMatch(reviewScoreGreaterThan95Predicate));

		System.out.println(courses.stream().noneMatch(reviewScoreLessThan90Predicate));

		System.out.println(courses.stream().anyMatch(reviewScoreLessThan90Predicate));

		System.out.println(courses.stream().anyMatch(reviewScoreGreaterThan95Predicate));

		
		/***Sorting and Comparing***/
		Comparator<Course> comparingByNoOfStudentsIncreasing = Comparator.comparingInt(Course::getNoOfStudents);

		Comparator<Course> comparingByNoOfStudentsDecreasing = Comparator.comparingInt(Course::getNoOfStudents).reversed();

		System.out.println(courses.stream().sorted(comparingByNoOfStudentsIncreasing).collect(Collectors.toList()));
		//[FullStack:14000:91, Spring Boot:18000:95, Spring:20000:98, Docker:20000:92, Kubernetes:20000:91, AWS:21000:92, Azure:21000:99, API:22000:97, Microservices:25000:96]
		
		System.out.println(courses.stream().sorted(comparingByNoOfStudentsDecreasing).collect(Collectors.toList()));
		//[Microservices:25000:96, API:22000:97, AWS:21000:92, Azure:21000:99, Spring:20000:98, Docker:20000:92, Kubernetes:20000:91, Spring Boot:18000:95, FullStack:14000:91]
		
		Comparator<Course> comparingByNoOfStudentsAndNoOfReviewsDecreasing = Comparator.comparing(Course::getNoOfStudents).thenComparingInt(Course::getReviewScore).reversed();

		System.out.println(courses.stream().sorted(comparingByNoOfStudentsAndNoOfReviewsDecreasing).collect(Collectors.toList()));
		//[Microservices:25000:96, API:22000:97, Azure:21000:99, AWS:21000:92, Spring:20000:98, Docker:20000:92, Kubernetes:20000:91, Spring Boot:18000:95, FullStack:14000:91]

		/***skip, limit, takeWhile and dropWhile***/
		System.out.println(courses.stream()
				.sorted(comparingByNoOfStudentsAndNoOfReviewsDecreasing)
				.skip(3)
				.collect(Collectors.toList()));
		//[AWS:21000:92, Spring:20000:98, Docker:20000:92, Kubernetes:20000:91, Spring Boot:18000:95, FullStack:14000:91]
		
		System.out.println(courses.stream()
				.sorted(comparingByNoOfStudentsAndNoOfReviewsDecreasing)
				.limit(5)
				.collect(Collectors.toList()));
		//[Microservices:25000:96, API:22000:97, Azure:21000:99, AWS:21000:92, Spring:20000:98]
		
		System.out.println(courses.stream()
				.sorted(comparingByNoOfStudentsAndNoOfReviewsDecreasing)
				.skip(3)
				.limit(5)
				.collect(Collectors.toList()));
		//[AWS:21000:92, Spring:20000:98, Docker:20000:92, Kubernetes:20000:91, Spring Boot:18000:95]
		
		System.out.println(courses);
		//[Spring:20000:98, Spring Boot:18000:95, API:22000:97, Microservices:25000:96, FullStack:14000:91, AWS:21000:92, Azure:21000:99, Docker:20000:92, Kubernetes:20000:91]
		
		/*
		 * takeWhile and dropWhile work with Java 9 onwards
		 courses.stream()
		 	.takeWhile(course -> course.getReviewScore()>=95)
			.collect(Collectors.toList());
		
		courses.stream() 
			.dropWhile(course -> course.getReviewScore()>=95)
			.collect(Collectors.toList());
		*/
		
		
	}

}
