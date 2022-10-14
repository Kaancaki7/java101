package j101;



public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;

    Employee(String name,double salary,double workHours,int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    void raiseSalary() {
        double raise = 0.0;
        if (2022 - this.hireYear < 10) {
            raise = this.salary * 5 / 100;
            this.salary += raise;
            System.out.println("---------------------------------");
            System.out.println("Zam: " + raise);
            System.out.println("GÜncel maas: " + this.salary);
        }
        else if (10 < 2022 - this.hireYear && 2022 - this.hireYear <= 20) {
            raise = this.salary * 10 / 100;
            this.salary += raise;
            System.out.println("---------------------------------");
            System.out.println("Zam: " + raise);
            System.out.println("GÜncel maas: " + this.salary);
        }
        else if (2022 - this.hireYear > 20) {
            raise = this.salary * 15 / 100;
            this.salary += raise;
            System.out.println("---------------------------------");
            System.out.println("Zam: " + raise);
            System.out.println("GÜncel maas: " + this.salary);
        }
        else {
            System.out.println("yanlış yıl değeri girildi.");
        }
    }

    void tax() {
        double taxMoney = 0.0;
        if (this.salary < 1000) {
            System.out.println("---------------------------------");
            System.out.println("uygulanan vergi:" + taxMoney);
            System.out.println("Güncel maas: " + this.salary);
        }
        else {
            taxMoney = this.salary * 3 / 100;
            this.salary = this.salary - taxMoney;
            System.out.println("---------------------------------");
            System.out.println("uygulanan vergi: " + taxMoney);
            System.out.println("Güncel maas: " + this.salary);
        }
    }

    void bonus() {
        double bonusSalary = 0.0;
        if (this.workHours > 40) {
            bonusSalary = (this.workHours - 40.0) * 30;
            this.salary += bonusSalary;
            System.out.println("---------------------------------");
            System.out.println("bonus: " + bonusSalary);
            System.out.println("güncel maas: " + this.salary);
        }
        else {
            System.out.println("---------------------------------");
            System.out.println("bonus: " + bonusSalary);
            System.out.println("güncel maas: " + this.salary);
        }
    }


    void print() {
        System.out.println("---------------------------------");
        System.out.println("Çalışan ismi: " + this.name);
        System.out.println("Çalışan maaşı: " + this.salary);
        System.out.println("Çalışanın haftalık çalışma saati: " + this.workHours);
        System.out.println("Çalışanın işe başlamaya yılı: " + this.hireYear);

    }
}
