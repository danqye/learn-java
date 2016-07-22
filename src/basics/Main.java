package basics;


public class Main {
    /*public static void main(String[] args){
        StaticVsObject.name = "Dan";
        StaticVsObject o1 = new StaticVsObject("v1");
        StaticVsObject o2 = new StaticVsObject("v2");


        System.out.println(o1.getName());
        System.out.println(o1.normal);
        o1.setName("Hi");
        System.out.println(o2.getName());
        System.out.println(o2.normal);
    }
    */

    public static void main(String[] args){
        Singleton o1 = new Singleton();
        System.out.println(o1.getInstance());
        Singleton o2 = new Singleton();
        System.out.println(o2.getInstance());
        Normal N1 = new Normal();
        System.out.println(N1.getInstance());
        Normal N2 = new Normal();
        System.out.println(N2.getInstance());
    }
}


