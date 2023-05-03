public class Student {
    // field
    String name;
    String studentID;
    String major;

    // method
    public void setData(String name, String id, String major) {
        this.name = name;
        this.studentID = id;
        this.major = major;
    }

    public void getInfo() {
        System.out.println("이름 : " + this.name);
        System.out.println("학번 : " + this.studentID);
        System.out.println("전공 : " + this.major);
    }
}
