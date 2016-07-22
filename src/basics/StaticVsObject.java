package basics;


public class StaticVsObject {
    public static String name;
    public String normal;

    public StaticVsObject(String normal) {
        this.normal = normal;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        StaticVsObject.name = name;
    }
}
