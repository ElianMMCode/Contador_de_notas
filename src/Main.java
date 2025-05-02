import java.util.Scanner;

public static void main() {
    Scanner t = new Scanner(System.in);

    Competence competenceStudents = new Competence();

    System.out.println("---------CALIFICACIONES---------");


    //Carga de información sobre la competencia
    System.out.print("Ingrese la competencia a evaluar: ");
    t.nextLine();
    System.out.print("Ingrese la ficha a la que pertenece: ");
    String ficha = t.nextLine();
    competenceStudents.setFicha(ficha);
    System.out.print("Ingrese el total de estudiantes: ");
    int totalStudents = t.nextInt();
    competenceStudents.setTotalStudents(totalStudents);
    String nameCompetence = t.nextLine();
    competenceStudents.setNameCompetence(nameCompetence);
    System.out.print("Ingrese el total de notas: ");
    int totalGrades = t.nextInt();
    competenceStudents = new Competence(totalStudents);

    for (int i = 0; i < totalStudents; i++) {
        System.out.println("Ingrese informacion del estudiante " + i);
        System.out.print("Nombre: ");
        t.nextLine();
        String name = t.nextLine();
        System.out.print("Apellido: ");
        String lastName = t.nextLine();
        Student student = new Student(name, lastName, totalGrades);
        competenceStudents.addStudent(student, i);
        System.out.println(competenceStudents.getListStudent(i).getName());
        for (int j = 0; j < totalGrades; j++) {
            System.out.print("Ingrese la nota " + j + ": ");
            int grade = t.nextInt();
            student.addGradeStudent(grade, j);
            student.averageGradesStudent(student.getListGrades(j));
            System.out.println(student.getListGrades(j));
        }
        System.out.printf("El promedio del estudiante fue de: %.0f",competenceStudents.getListStudent(i).getAverege());
    }

}