import java.util.Arrays;
public class Main {
    public static void printSeparate() {
        System.out.println("*****************************************");
    }
    static Employee [] employees = new Employee[10];
    private static void printEmployee(){
        for (Employee emp :employees) {
            System.out.println(emp);
        }
    }
    private static void printNames(){
        for (Employee emp:employees){
            if(emp!=null){
                System.out.println(emp.getLastName()+" "+emp.getFirstName()+" "+emp.getSurName());
            }
        }
    }
    private static void amountOfSalaries() {
        double sum=0;
        for(Employee emp :employees){
            sum=sum+ emp.getSalaries();
                }
        System.out.println("Общая сумма зарплат:"+sum);
        }
    public static void maximumAmount() {
        Employee empMaxSalary=null;
        for(Employee emp :employees){
            if(emp!=null){
                if(empMaxSalary==null||emp.getSalaries()>empMaxSalary.getSalaries()){
                    empMaxSalary=emp;
                }
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой "+empMaxSalary);
    }
    public static void minimumAmount(){
        Employee empMinSalary=null;
        for(Employee emp : employees){
            if(emp!=null){
                if(empMinSalary==null|| emp.getSalaries()<empMinSalary.getSalaries()){
                    empMinSalary=emp;
                }
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: "+ empMinSalary);
    }
    public static void averageAmount() {
        double sum =0;
        double amount= employees.length;
        for(Employee emp :employees){
            sum+=emp.getSalaries();
            amount=sum/ employees.length;
                }
        System.out.println("Средняя сумма зарплат: "+amount);
            }
    public static void main(String[] args) {
        employees[0]=new Employee("Иванов","Иван","Иванович",1,33000);
        employees[1]=new Employee("Петров","Петр","Петрович",2,35000);
        employees[2]=new Employee("Сидоров","Сидор","Сидорович",3,43000);
        employees[3]=new Employee("Александров","Александр","Александрович",4,53000);
        employees[4]=new Employee("Антонов","Антон","Антонович",5,44000);
        employees[5]=new Employee("Иванова","Елена","Ивановна",1,33000);
        employees[6]=new Employee("Петрова","Екатерина","Петровна",2,35000);
        employees[7]=new Employee("Сидорова","Анна","Сидоровна",3,43000);
        employees[8]=new Employee("Александрова","Оксана","Александровна",4,53000);
        employees[9]=new Employee("Антонова","Людмила","Антоновна",5,44000);
        printSeparate();
        printEmployee();
        printSeparate();
        printNames();
        printSeparate();
        amountOfSalaries();
        printSeparate();
        maximumAmount();
        printSeparate();
        minimumAmount();
        printSeparate();
        averageAmount();
        printSeparate();
    }
}