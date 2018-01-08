package singleton;

/**
 * @author: xiong
 * @time: 2017/12/29
 * @说明: 单例Java
 */
public class test {

    public static void main(String[] args){
        Singleton s1 = Singleton.getSingleton();
        Singleton s2 = Singleton.getSingleton();
        System.out.println(s1);
        System.out.println(s2);
    }

    public static class Singleton{
        private static Singleton mSingleton = new Singleton();
        private Singleton(){
        }
        public static Singleton getSingleton() {
            return mSingleton;
        }
    }
}
