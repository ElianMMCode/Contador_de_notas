import java.util.Scanner;

public class Competence {

    private String nameCompetence;
    private String ficha;
    private int totalStudents;
    private Student[] students;
    private String nameInstructor;
    private int i;


    public Competence (int totalStudents){
        this.students = new Student[totalStudents];
        this.i = 0;
    }

    private int grade;
    private Scanner t = new Scanner(System.in);

    public int getTotalStudents() {
        return totalStudents;
    }

    public void addStudent(Student x){
        students[i++] = x;
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
    public String getFicha(String ficha) {
        return this.ficha;
    }

    public String getNameCompetence(String nameCompetence) {
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


}

