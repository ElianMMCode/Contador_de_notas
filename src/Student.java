private class Student extends Competence {

    private String name;
    private String lastName;
    private int totalGrades;
    private int[] grades = new int[totalGrades];

    public int getTotalGrades() {
        return totalGrades;
    }

    public int[] getGrades() {
        return grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public void setTotalGrades(int totalGrades) {
        this.totalGrades = totalGrades;
    }
}
