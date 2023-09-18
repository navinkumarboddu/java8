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
		//[Course [name=FullStack, category=FullStack, reviewScore=91, noOfStudents=14000], Course [name=Spring Boot, category=Framework, reviewScore=95, noOfStudents=18000], Course [name=Spring, category=Framework, reviewScore=98, noOfStudents=20000], Course [name=Docker, category=Cloud, reviewScore=92, noOfStudents=20000], Course [name=Kubernetes, category=Cloud, reviewScore=91, noOfStudents=20000], Course [name=AWS, category=Cloud, reviewScore=92, noOfStudents=21000], Course [name=Azure, category=Cloud, reviewScore=99, noOfStudents=21000], Course [name=API, category=Microservices, reviewScore=97, noOfStudents=22000], Course [name=Microservices, category=Microservices, reviewScore=96, noOfStudents=25000]]
		
		System.out.println(courses.stream().sorted(comparingByNoOfStudentsDecreasing).collect(Collectors.toList()));
		//[Course [name=Microservices, category=Microservices, reviewScore=96, noOfStudents=25000], Course [name=API, category=Microservices, reviewScore=97, noOfStudents=22000], Course [name=AWS, category=Cloud, reviewScore=92, noOfStudents=21000], Course [name=Azure, category=Cloud, reviewScore=99, noOfStudents=21000], Course [name=Spring, category=Framework, reviewScore=98, noOfStudents=20000], Course [name=Docker, category=Cloud, reviewScore=92, noOfStudents=20000], Course [name=Kubernetes, category=Cloud, reviewScore=91, noOfStudents=20000], Course [name=Spring Boot, category=Framework, reviewScore=95, noOfStudents=18000], Course [name=FullStack, category=FullStack, reviewScore=91, noOfStudents=14000]]
		
		Comparator<Course> comparingByNoOfStudentsAndNoOfReviewsDecreasing = Comparator.comparing(Course::getNoOfStudents).thenComparingInt(Course::getReviewScore).reversed();

		System.out.println(courses.stream().sorted(comparingByNoOfStudentsAndNoOfReviewsDecreasing).collect(Collectors.toList()));
		//[Course [name=Microservices, category=Microservices, reviewScore=96, noOfStudents=25000], Course [name=API, category=Microservices, reviewScore=97, noOfStudents=22000], Course [name=Azure, category=Cloud, reviewScore=99, noOfStudents=21000], Course [name=AWS, category=Cloud, reviewScore=92, noOfStudents=21000], Course [name=Spring, category=Framework, reviewScore=98, noOfStudents=20000], Course [name=Docker, category=Cloud, reviewScore=92, noOfStudents=20000], Course [name=Kubernetes, category=Cloud, reviewScore=91, noOfStudents=20000], Course [name=Spring Boot, category=Framework, reviewScore=95, noOfStudents=18000], Course [name=FullStack, category=FullStack, reviewScore=91, noOfStudents=14000]]

		/***Sorting and Comparing***/
	}

}
