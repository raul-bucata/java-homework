import java.util.*;
import java.util.UUID;

class Employee{
    UUID employeeID = UUID.randomUUID();
    public int employeeNumber;
    public String employeeName;
    public int age;
   public String gender;
    public String department;

    Employee(UUID employeeID, int employeeNumber, String employeeName, int age, String gender, String department){
        this.employeeNumber = employeeNumber;
        this.employeeName = employeeName;
        this.age = age;
        this.gender= gender;
        this.department = department;

    }

    public Employee(int empno, String ename, int age, String gender, String department) {
    }

    public UUID generateId() {
        return employeeID;
    }
    public int getEmployeeNumber(){
        return employeeNumber;
    }
    public int getAge(){
        return age;
    }
    public String getEmployeeName(){
        return employeeName;
    }
public String getGender(){
        return gender;
}
    public String getDepartment(){
        return department;
    }
    public String toString(){
        return employeeID + " " +employeeNumber +" "+ employeeName +" "+ age + " " + gender + " "+ department;
    }
}

class Organization{
    public static void main(String[] args) {

        List<Employee> c = new ArrayList<Employee>();
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        int ch;
        do{
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY");
            System.out.println("3.SEARCH");
            System.out.println("4.DELETE");
            System.out.println("5.UPDATE");
            System.out.print("Enter Your Choice : ");
            ch = s.nextInt();

            switch(ch){
                case 1:
                    System.out.print("Enter Employee's Number : ");
                    UUID id = UUID.randomUUID();
                    int eno = s.nextInt();
                    System.out.print("Enter Employee's Full Name : ");
                    String ename = s1.nextLine();
                    System.out.print("Enter Age : ");
                    int age = s.nextInt();
                    System.out.print("Enter Gender : ");
                    String gender = s1.nextLine();
                    System.out.print("Enter Department : ");
                    String department;
                    department = s1.nextLine();


                    c.add(new Employee(id,eno,ename,age,gender,department));
                    break;
                case 2:
                    System.out.println("----------------------------");
                    Iterator<Employee> i = c.iterator();
                    while(i.hasNext()){
                        Employee e = i.next();
                        System.out.println(e);
                    }
                    System.out.println("----------------------------");
                    break;
                case 3:
                    boolean found = false;
                    System.out.print("Enter Employee Number to Search :");
                    int empno = s.nextInt();
                    System.out.println("----------------------------");
                    i = c.iterator();
                    while(i.hasNext()){
                        Employee e = i.next();
                        if(e.getEmployeeNumber() == empno)  {
                            System.out.println(e);
                            found = true;
                        }
                    }

                    if(!found){
                        System.out.println("Record Not Found");
                    }
                    System.out.println("----------------------------");
                    break;

                case 4:
                    found = false;
                    System.out.print("Enter Employee Number to Delete :");
                    empno = s.nextInt();
                    System.out.println("----------------------------");
                    i = c.iterator();
                    while(i.hasNext()){
                        Employee e = i.next();
                        if(e.getEmployeeNumber() == empno)  {
                            i.remove();
                            found = true;
                        }
                    }

                    if(!found){
                        System.out.println("Record Not Found");
                    }else{
                        System.out.println("Record is Deleted Successfully...!");
                    }

                    System.out.println("----------------------------");
                    break;
                case 5:
                    found = false;
                    System.out.print("Enter Employee Number to Update :");
                    empno = s.nextInt();

                    ListIterator<Employee>li = c.listIterator();
                    while(li.hasNext()){
                        Employee e = li.next();
                        if(e.getEmployeeNumber() == empno)  {
                            System.out.print("Enter new Name : ");
                            ename = s1.nextLine();
                            System.out.print("Enter new Age : ");
                            age = s.nextInt();
                            System.out.print("Enter new Gender : ");
                            gender = s1.nextLine();
                            System.out.print("Enter new Department : ");
                            department = s1.nextLine();
                            li.set(new Employee(empno,ename,age,gender,department));
                            found = true;
                        }
                    }

                    if(!found){
                        System.out.println("Record Not Found");
                    }else{
                        System.out.println("Record is Updated Successfully...!");
                    }


                    break;


            }
        }while(ch!=0);
    }
}