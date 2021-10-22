package test2;

public class Main {
    public static void main(String[] args) {
        EnumBasedSingleton[] E = EnumBasedSingleton.values();
        System.out.println(E[0]);

        EnumBasedSingleton F = EnumBasedSingleton.INSTANCE;
        System.out.println("value : "+F);
        F.setValue(10);
        System.out.println("value int : "+F.getValue());
    }
}
