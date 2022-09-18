public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int height;
    private boolean married = false;
    String gender;
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Person(String firstName, String lastName, int age, int height){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
    }
    public void info(){
        System.out.println("Name: " + firstName +
                            "\nSurname: " + lastName +
                            "\nAge: " + age +
                            "\nHeight: " + height);
    }
    public void setMarriedStatus(boolean married){
        this.married = married;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }
}
