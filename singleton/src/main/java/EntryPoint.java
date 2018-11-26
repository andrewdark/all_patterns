public class EntryPoint {

    public static void main(String[] args) {
        SingletonEnum s1 = SingletonEnum.INSTANCE;
        s1.print();
        SingletonEnum.INSTANCE.print();
        SingletonEnum s2 = SingletonEnum.INSTANCE;
        s2.print();
        System.out.println(s2.equals(s1));
    }
}
