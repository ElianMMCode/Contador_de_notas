protected class Competence {

    private String nameCompetence;
    private String ficha;
    private int totalStudents;
    private String nameInstructor;
    private int grade;
    private Student[] student = new Student[totalStudents];


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


    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }
}
