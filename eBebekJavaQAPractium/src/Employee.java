public class Employee {

    //Sınıfın Nitelikleri
    private String name;
    private int salary;
    private int workHours;
    private int hireYear;

public Employee (String name, int salary, int workHours, int hireYear) {
    this.setName(name);
    this.setSalary(salary);
    this.setWorkHours(workHours);
    this.setHireYear(hireYear);


}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

//Maaşa uygulanan vergiyi hesaplama
public int tax(int salary) {
    this.setSalary(salary);
    int taxRate=3;
    int tax = 0;

    if (salary<1000) {


    }
    else if (salary>1000) {
        tax=(salary*taxRate)/100;

    }

    return tax;
}
//Bonus Hesaplama

public int bonus (int workHours) {
    this.setWorkHours(workHours);
    int workHourPrice=30;
    int workHoursLimit=40;
    int bonusPrice=0;

    if (workHours>workHoursLimit) {
        int workMoreTime= workHours-workHoursLimit;
        bonusPrice=workMoreTime*workHourPrice;

    }
    return bonusPrice;
}
//Yıllık Maaş Artışı Hesaplama
public double raiseSalary (int hireYear,int salary,int workHours) {
    this.setHireYear(hireYear);
    this.setSalary(salary);
    this.setWorkHours(workHours);
    int thisYear=2021;
    int workYear= thisYear-hireYear;
    double nowSalary;
    nowSalary=salary+bonus(workHours)-tax(salary);
    double raisePrice=0;



    if (workYear<10) {

       raisePrice= (nowSalary * 5) / 100;

    } if (9<workYear &&workYear<20) {

        raisePrice=(nowSalary * 10) / 100;
    }
    if (workYear>19) {
        raisePrice=(nowSalary * 15) / 100;
    }
    return raisePrice;
}


//Çalışan Bilgileri

    public String toString () {

    return "Çalışan Adı Soyadı:" + getName() + "\nÇalışanın Maaşı:" + getSalary() + "\nÇalışanın Haftalık Çalışma Saati:"
            + getWorkHours() +"\nÇalışanın İşe Başlangıç Yılı:" + getHireYear() + "\nÇalışanın Maaşına Uygulanan Vergi:"
            + tax(salary) + "\nÇalışananın Bonus Ücreti:" + bonus(workHours) + "\nÇalışanın İşe Başlangıç Yılına Göre "
            + "Maaş Artışı:" + raiseSalary(hireYear,salary,workHours);

    }
}
