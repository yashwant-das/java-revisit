class Student {
    int rollno;
    int marks;
    String name;
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        // arraay of objects

        Student s1 = new Student();
        s1.name = "Ram";
        s1.rollno = 1;
        s1.marks = 50;

        Student s2 = new Student();
        s2.name = "Sita";
        s2.rollno = 2;
        s2.marks = 40;

        Student s3 = new Student();
        s3.name = "Ram";
        s3.rollno = 3;
        s3.marks = 30;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // normal forloop
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + " : " + students[i].marks);
        }

        // enhansed for loop
        for (Student student : students) {
            System.out.println(student.name + " : " + student.marks);
        }

    }

}
