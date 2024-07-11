import java.util.*;
interface Person{
    void Name(String S);
    void age(int age);
    
}
class eligible{
    public void Check(int age){
        if(age>=18){
            System.out.println("Eligible for Voting");
        }
        else{
            System.out.println("Not eligible for Voting");
        }

    }

}

public class Project extends eligible implements Person {

    
    public void Name(String S){
        System.out.println("Name of Person: " + S);

    }
    public void age(int age){
        System.out.println("Age of Person :" + age );

    }
    
    public static void main(String args[]){
        Project obj = new Project();
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        System.out.println("Enter the Name ");
        name =sc.next();
        System.out.println("Enter the age");
        age=sc.nextInt();

        System.out.println("To display name press 1");
        System.out.println("To display age press 2");
        System.out.println("To check eligiblity press 3");
        System.out.println("enter the choice");

        int choice=sc.nextInt();
        if(choice==1){
            obj.Name(name);

        }
        else if (choice==2) {
            obj.age(age);

            
        }
        else if (choice==3){
            obj.Check(age);
        }
        else{
            System.out.println("invalid choice");
        }




    }
 


    
}
