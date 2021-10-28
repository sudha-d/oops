package OOPS;

public class Main {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.setName("Sudharshan");
        s1.setBranch("CSE");
        s1.setRollNumber("123");
        Address address1 = new Address();
        address1.setCity("banglore");
        address1.setState("KA");
        address1.setCountry("INDIA");
        s1.setAddress(address1);
        System.out.println(s1.getAddress());
        System.out.println(s1.getAddress().getCity());
        Students s2 = new Students();
        s2.setName("prem");
        s2.setBranch("ECE");
        s2.setRollNumber("343");
        Students s3 = new Students();
        s3.setName("Sreekanth");
        s3.setBranch("EEE");
        s3.setRollNumber("555");
        System.out.println(s2.getName()+" "+s2.getRollNumber()+" "+s2.getAddress());
    }
}
