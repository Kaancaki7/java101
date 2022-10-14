package j101;

public class MaasHesaplayiciMain {
    public static void main(String[] args) {
        Employee e1 = new Employee("Kaan",3000,70,1980);

        e1.raiseSalary();
        e1.tax();
        e1.bonus();
        e1.print();
    }


}
