public class Statictoinstancemethod {

    static int a = 10;
    void printSomething()
    {
        System.out.println("a = "+a);
        a=99;
        System.out.println("a = "+a);
    }

    public static void main(String[] args){
        Statictoinstancemethod statictoinstancemethod= new Statictoinstancemethod();
        statictoinstancemethod.printSomething();
    }
}
