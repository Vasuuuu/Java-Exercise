class Student {
    int rollnum;
    void getRoll(int n){
        rollnum = n;
    }
    void showRoll(){
        System.out.println("Roll : "+rollnum);
    }
}

class Test extends Student {
    float sub1, sub2;
    void getMarks(float m1, float m2){
        sub1 = m1;
        sub2 = m2;
    }
    void showMarks(){
        System.out.println("Subject 1 and Subject 2 : "+sub1+" "+sub2);
    }
}

interface sports{
    float spmarks = 80;
    void showSpMarks();
}

class Result extends Test implements sports{
    float total;
    public void showSpMarks(){
        System.out.println("Sports marks : "+spmarks);
    }
    void display(){
        total = sub1 + sub2 +spmarks;
        showRoll();
        showMarks();
        showSpMarks();
        System.out.println("Total = "+total);
    }
}
public class MultipleInheritenceDemo{
    public static void main (String[] args){
        Result r = new Result();
        r.getRoll(7);
        r.getMarks(90,95);
        r.display();
    }
}

