public class Main {
    public static void printSeparate() {
        System.out.println("*****************************************");
    }
    public static void printEmployee(Employee[]employees){
        for (int i = 0; i < employees.length; i++) {
            if (i== employees.length){
                System.out.println(employees[i]);
            }
            System.out.println(employees[i]+" ");
        }
    }
    public static void printNames(Employee[]employees){
        for (Employee names:employees){
            if(names!=null){
                System.out.println(names.getLastName()+" "+names.getFirstName()+" "+names.getSurName());
            }
        }
    }
    public static void amountOfSalaries(Employee[]employees) {
        double sum=0;
        for(Employee salaries :employees){
            if(salaries!=null){
                if (salaries.getSalaries()>0){
                    sum=sum+ salaries.getSalaries();
                }
            }
        }
        System.out.println("Общая сумма: "+sum);
    }
    public static void maximumAmount(Employee[]employees) {
        double sum =1;
        for(Employee salaries :employees){
            if(salaries!=null){
                if(salaries.getSalaries()>sum){
                    sum=salaries.getSalaries();
                }
            }
        }
        System.out.println("Максимальная сумма: "+sum);
    }
    public static void minimumAmount(Employee[]employees){
        double sum = 300_000;
        for(Employee salaries : employees){
            if(salaries!=null){
                if(sum>salaries.getSalaries()){
                    sum=salaries.getSalaries();
                }
            }
        }
        System.out.println("Минимальная сумма: "+sum);
    }
    public static void averageAmount(Employee[]employees) {
        double sum =0;
        double amount= employees.length;
        for(Employee salaries :employees){
            if(salaries!=null){
                if(salaries.getSalaries()>0){
                    sum=sum+salaries.getSalaries();
                    amount=sum/ employees.length;
                }
            }
        }
        System.out.println("Средняя сумма: "+amount);
    }
    public static void main(String[] args) {
        Employee[]employees=new Employee[10];
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
        printEmployee(employees);
        printSeparate();
        printNames(employees);
        printSeparate();
        amountOfSalaries(employees);
        printSeparate();
        maximumAmount(employees);
        printSeparate();
        minimumAmount(employees);
        printSeparate();
        averageAmount(employees);
        printSeparate();


    }
}