package task3;

public class CollegeStudent extends Student {
	private String collegeName;
	private int rating;
	private long id;
	 
	public CollegeStudent() {
	}
	public CollegeStudent(String firstName, String lastName, int group) {
		super(firstName, lastName, group);
	}
	public CollegeStudent(String lastName, Course[] coursesTaken) {
		super(lastName, coursesTaken);
	}
	public CollegeStudent(long id, String collegeName, int rating) {
		this.id = id;
		this.collegeName = collegeName;
		this.rating = rating;
	}

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
