public class Employee {
    private String firstName;
    private String lastName;
    private String surName;
    private int department;
    private double salaries;
    private int id;
    public static int counter;

    public Employee(String lastName,String firstName,String surName,int department,double salaries){
        this.lastName=lastName;
        this.firstName=firstName;
        this.surName=surName;
        this.department=department;
        this.salaries=salaries;
        this.id=0+counter++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSurName() {
        return surName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalaries() {
        return salaries;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalaries(double salaries) {
        this.salaries = salaries;
    }

    @Override
    public String toString() {
        return
                "Имя:" + firstName + ' ' +
                "Фамилия:" + lastName + ' ' +
                "Отчество:" + surName + ' ' +
                "Отдел:" + department +' ' +
                "Зарплата:" + salaries +' ' +
                "id:" + id;
    }
}
