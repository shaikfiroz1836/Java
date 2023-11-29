package pack1;

class Employee{
    public void m2(){
        System.out.println("M2 method from Employee - pack1");
    }
    public static void main(String[] firoz){

        Employee e = new Employee();
        e.m2();
        System.out.println("Main method from Employee- Pack1");
    }
}