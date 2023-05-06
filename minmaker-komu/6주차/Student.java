public class Student {
    String name;
    int studentID;
    String major;

    public Student(String name, int studentID, String major) {
        this.name = name;
        this.studentID = studentID;
        this.major = major;
    }

    public void printStudentInfo() {
        System.out.println("이름: " + name);
        System.out.println("학번: " + studentID);
        System.out.println("전공: " + major);
    }
}

