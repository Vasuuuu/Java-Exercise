class Student
{
    int roll;
    String name;
    static String collegeName = "Asansol Girls' College";
    Student(int roll, String name)
    {
        this.roll=roll;
        this.name=name;
    }
    void display()
    {
        System.out.println("Roll number :"+roll);
        System.out.println("Name : "+name);
        System.out.println("College : "+collegeName);
    }
}
class Test_Static_Data_Member
{
    public static void main(String[] args)
    {
        Student s1 = new Student(1,"Vasundhara");
        Student s2 = new Student(2,"Suprama");
        s1.display();
        s2.display();
    }
}
