public class Student {
    private final String name;
    private final int[] marks;
    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }
    public String getName() {
        return name;
    }
    public int[] getMarks() {
        return marks;
    }
    public double calculateAverage() {
        if (marks == null || marks.length == 0) {
            return 0.0;
        }
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return (double) total / marks.length;
    }
}