public class EntryPoint {

    static SingletonOnDemandHolder sodh3 = SingletonOnDemandHolder.getInstance();

    public static void main(String[] args) {
        SingletonEnum s1 = SingletonEnum.INSTANCE;
        s1.print();
        SingletonEnum.INSTANCE.print();
        SingletonEnum s2 = SingletonEnum.INSTANCE;
        s2.print();
        System.out.println(s2.equals(s1));

        SingletonOnDemandHolder sodh = SingletonOnDemandHolder.getInstance();
        SingletonOnDemandHolder sodh2 = SingletonOnDemandHolder.SingletonHolder.HOLDER_INSTANCE;

        System.out.println(sodh.equals(sodh2));
        System.out.println(sodh.equals(EntryPoint.sodh3));
    }
}
