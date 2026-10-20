class Employee{
    protected String name;
    protected int id;
    Employee(String name,int id){
        this.name=name;
        this.id=id;
    }
    void displayDetails(){
        System.out.println("Name : "+name);
        System.out.println("Id : "+id);
    }
}
class Manager extends Employee{
    private int teamSize;
    Manager(String name,int id,int teamSize){
        super(name,id);
        this.teamSize=teamSize;
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Team Size : "+teamSize);
    }
}
class Engineer extends Employee{
    private String specialization;
    Engineer(String name,int id,String specialization){
        super(name,id);
        this.specialization=specialization;
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Specialization : "+specialization);
    }
}


//Please Do not change anything below, It is only for your reference.
/*

This is the driver code that will execute and demonstrate the functionality of your base class `Employee`, driver classes 'Manager', 'Engineer'.".

It creates a object of class `Manager`, uses the parametrised constructor to initialize the attributes of Manager and Employee class.
It then prints a line with text message "Manager Details".
Then it calls th displayDetails() method of class Manager which prints details of manager.

It creates a object of class `Engineer`, uses the parametrised constructor to initialize the attributes of Engineer and Employee class.
It then prints a line with text message "Engineer Details".
Then it calls th displayDetails() method of class Engineer which prints details of engineer.


public class Main {

    public static void main(String[] args) {
    
        String M_name, E_name, E_specialization;
        int M_id, E_id, M_teamSize;
    
        // Create Manager instance
        Manager manager = new Manager(M_name, M_id, M_teamSize);
        System.out.println("Manager Details");
        manager.displayDetails();

        // Create Engineer instance
        Engineer engineer = new Engineer(E_name, E_id, E_specialization);
        System.out.println("\nEngineer Details");
        engineer.displayDetails();
    }
}

*/

/*
//Below is the output statements

System.out.println("Name : " + name);
System.out.println("Id : " + id);
System.out.println("Team Size : " + teamSize);
System.out.println("Specialization : " + specialization);

*/