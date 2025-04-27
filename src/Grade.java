public class Grade {
    private int totalGrades;

    private int[] grades = new int[totalGrades];

    public int getTotalGrades() {
        return totalGrades;
    }

    public void setTotalGrades(int totalGrades) {
        this.totalGrades = totalGrades;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }
}
