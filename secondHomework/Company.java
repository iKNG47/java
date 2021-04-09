package secondHomework;

public class Company {
    public static void main(String[] args) {
        Employee worker1=new Employee();
        worker1.name="Ihor";
        worker1.surname="Tomashchuk";
        worker1.age=23;
        worker1.seniority=3;
        System.out.println(worker1.name+" "+worker1.surname);
        Employee worker2=new Employee();
        worker2.name="ss";
        worker2.surname="aa";
        worker2.age=23;
        worker2.seniority=3;
        System.out.println(worker2.name+" "+worker2.surname);
        Employee worker3=new Employee();
        worker3.name="ff";
        worker3.surname="gg";
        worker3.age=23;
        worker3.seniority=3;
        System.out.println(worker3.name+" "+worker3.surname);
    }
}
