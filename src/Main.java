import java.util.Scanner;

public static void main(String[] args) {
    Scanner t = new Scanner(System.in);

    Competence competence = new Competence(30);

    System.out.println("---------CALIFICACIONES---------");


    //Carga de información sobre la competencia
    System.out.print("Ingrese la ficha a la que pertenece: ");
    String ficha = t.nextLine();
    competence.getFicha(ficha);
    System.out.print("Ingrese el total de estudiantes: ");
    int totalStudents = t.nextInt();
    competence.getTotalStudents();
    System.out.print("Ingrese la competencia a evaluar: ");
    t.nextLine();
    String nameCompetence = t.nextLine();
    competence.getNameCompetence(nameCompetence);
    System.out.print("Ingrese el total de notas: ");
    int totalGrades = t.nextInt();


    for (int i = 0; i < totalStudents; i++) {
        System.out.println("Ingrese informacion del estudiante " + i);
        System.out.print("Nombre: ");
        t.nextLine();
        String name = t.nextLine();
        System.out.print("Apellido: ");
        String lastName = t.nextLine();
        Student student = new Student(name, lastName);
        competence.addStudent(student);
        System.out.println(competence.getListStudent(i).getName());
    }

}