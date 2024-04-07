class Employee{
    String id,name; double monthly_salary;
    Employee(){id="";name="";monthly_salary=0.0d;}
    void setId(String id){this.id = id;}
    String getId(){return id;}
    void setName(String name){this.name = name;}
    String getName(){return name;}
    void setMonthly_salary(double salary){monthly_salary=salary;}
    double getMonthly_salary(){return monthly_salary;}
    void displayEmployee(){System.out.println("id :"+id + " name :" + name + " salary |" + monthly_salary*12);}
}
public class EmployeeTest {
    public static void main(String[] args) {
        Employee [] employee = new Employee[2];
        for(int i=0;i<2;i++){
            employee[i] = new Employee();
            employee[i].setId(String.valueOf(i));
            employee[i].setName(String.valueOf(i));
            employee[i].setMonthly_salary((double) ((i + 1)* 210.85d));
            employee[i].displayEmployee();
        }
        for(Employee e : employee){
            e.setMonthly_salary(e.getMonthly_salary() + (e.getMonthly_salary()*0.10));
            System.out.printf("Yearly salary of Employee = %s with id = %s after increment salary is = %.2f\n",e.getId(),e.getName(),e.getMonthly_salary()*12);
        }
    }
}