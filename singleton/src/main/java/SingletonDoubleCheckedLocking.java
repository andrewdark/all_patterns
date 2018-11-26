public class SingletonDoubleCheckedLocking {

    private static volatile SingletonDoubleCheckedLocking instance;

    private SingletonDoubleCheckedLocking() {

    }

    public static SingletonDoubleCheckedLocking getInstance(){
        SingletonDoubleCheckedLocking localInstance = instance;
        if(localInstance == null){
            synchronized(SingletonDoubleCheckedLocking.class){
                localInstance = instance;
                if (localInstance == null){
                    instance = localInstance = new SingletonDoubleCheckedLocking();
                }
            }
        }
        return localInstance;
    }
}
