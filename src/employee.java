public class employee{
    int salary;
    int hours;
    int rate;

    public employee() {
        hours = 10;
        rate = 100;
        salary = hours * rate;
    }

    void getInfo() {
        System.out.println(salary);
    }

}


