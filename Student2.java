package OOPS;
class Studen {
    int id;
    String name;
}
class TestStudent2{
    public static void main(String args[]){
        Studen s1=new Studen();
        s1.id=101;
        s1.name="Sonoo";
        System.out.println(s1.id+"\n "+s1.name);
    }
}
