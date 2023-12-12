class Parent{
    void m1(){
        System.out.println("Parent class m1 Method");
    }
}
class Child1 extends Parent{
    void m2(){
        System.out.println("Child1 class m2 Method");
    }
}
class Child2 extends Child1{
    public static void main(String[] firoz){
        Child1 c = new Child1();
        c.m1();
        c.m2();
        System.out.println("Child2 class Main Method");
    }
}