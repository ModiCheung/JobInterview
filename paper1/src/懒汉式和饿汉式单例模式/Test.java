package 懒汉式和饿汉式单例模式;

/**
 * 测试
 *
 * Created by ModiCheung on 2018/10/8 14:46
 **/
public class Test {

    public static void main(String[] args) {

        testEagerSingleton();
        testLazySingleton();
    }

    public static void testEagerSingleton() {
        System.out.println("-----------------饿汉式单例模式----------------");
        System.out.println("第一次取得实例（饿汉式）");
        EagerSingleton s1 = EagerSingleton.getInstance();
        System.out.println("第二次取得实例（饿汉式）");
        EagerSingleton s2 = EagerSingleton.getInstance();
        if(s1==s2){
            System.out.println(">>>>>s1,s2为同一实例（饿汉式）<<<<<");
        }
        System.out.println();
    }

    public static void testLazySingleton() {
        System.out.println("-----------------懒汉式单例模式----------------");
        System.out.println("第一次取得实例（懒汉式）");
        LazySingleton s1 = LazySingleton.getInstance();
        System.out.println("第二次取得实例（懒汉式）");
        LazySingleton s2 = LazySingleton.getInstance();
        if(s1==s2){
            System.out.println(">>>>>s1,s2为同一实例（懒汉式）<<<<<");
        }
        System.out.println();
    }

}
