public class Competence {

    private String nameCompetence;
    private String ficha;
    private int totalStudents;
    private int totalGrades;
    private Student[] students;
    private String nameInstructor;


    public Competence (int totalStudents){
        this.students = new Student[totalStudents];
    }




    public int getTotalStudents() {
        return totalStudents;
    }

    public void addStudent(Student x, int i){
        students[i] = x;
    }




    public Student getListStudent(int i){
        return students[i];
    }

    public Student[] getStudents(){
        return students;
    }

    public void setTotalStudents(int totalStudents) {
        this.totalStudents = totalStudents;
    }



    //Constructores
    public Competence() {
    }

    public Competence(String nameCompetence, String ficha, int totalStudents, String nameInstructor) {
    }


    //getters
    public String getFicha() {
        return this.ficha;
    }

    public String getNameCompetence() {
        return this.nameCompetence;

    }

    public String getNameInstructor() {
        return nameInstructor;
    }


    //Setters
    public void setNameCompetence(String nameCompetence) {
        this.nameCompetence = nameCompetence;
    }

    public void setFicha(String ficha) {
        this.ficha = ficha;
    }

    public void setNameInstructor(String nameInstructor) {
        this.nameInstructor = nameInstructor;
    }
    public int getTotalGrades() {
        return totalGrades;
    }

    public void setTotalGrades(int totalGrades) {
        this.totalGrades = totalGrades;
    }

}

