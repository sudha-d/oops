package OOPS;
class Stude{
    int rollno;
    String name;
    void insertRecord(int r, String n){
        rollno=r;
        name=n;
    }
    void displayInformation(){System.out.println(rollno+" "+name);}
}
class TestStudent3{
    public static void main(String args[]){
        Stude s1=new Stude();
        Stude s2=new Stude();
        s1.insertRecord(101,"Kamalesh");
        s2.insertRecord(121,"rajesh");
        s1.displayInformation();
        s2.displayInformation();
    }
}

