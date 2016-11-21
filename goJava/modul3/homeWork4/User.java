package goJava.modul3.homeWork4;

/**
 * Created by Vova on 16.11.2016.
 */
public class User {


    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    void paySalary(int salary) {
        balance += salary;
    }
    void withdraw(int withdraw){
        double comision;
        if (withdraw<1000){
            comision = 0.05;
        }
        else comision = 0.1;

        balance -=(withdraw+withdraw*comision);
    }

    int companyNameLenght (String companyName){
        return companyName.length();
    }

    void  monthIncreaser(int addMonth){

        monthsOfEmployment +=addMonth;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
