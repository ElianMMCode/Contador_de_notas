public class Student extends Competence {
    private String name;
    private String lastName;
    private final int[] grades;
    private final int totalGrades;

    public double getAverege() {
        return averege;
    }

    public double averege;


    public Student(String name, String lastName, int totalGrades) {
        this.totalGrades = totalGrades;
        this.name = name;
        this.lastName = lastName;
        this.grades = new int[totalGrades];
    }


    public void addGradeStudent(int x, int j) {
        grades[j] = x;
    }

    public int getListGrades(int j) {
        return grades[j];
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return lastName;
    }


    public void averageGradesStudent(int x) {
        this.averege += (double) x / totalGrades;
    }


}
