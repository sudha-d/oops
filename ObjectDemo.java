package OOPS;

public class ObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRollNumber(100);
        s1.setName("sudha");
        s1.setMarks(560);
        Student s2 = new Student();
        s2.setRollNumber(101);
        s2.setName("sunny");
        s2.setMarks(123);
        System.out.println(s1.getName() +"\n "+ s1.getMarks());
        System.out.println(s2.getRollNumber() +" "+ s2.getName());

    }
}
