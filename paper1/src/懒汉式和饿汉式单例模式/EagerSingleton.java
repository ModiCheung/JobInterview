package 懒汉式和饿汉式单例模式;

/**
 * 饿汉式单例模式：类加载后，通过静态初始化生成单例对象存在于内存中。使用时直接返回
 *
 * Created by ModiCheung on 2018/10/8 14:37
 **/
public class EagerSingleton {

    private static EagerSingleton eagerSingleton = new EagerSingleton();

    private EagerSingleton() {
        System.out.println("-->饿汉式单例模式开始调用构造函数");
    }

    public static EagerSingleton getInstance() {
        System.out.println("-->饿汉式单例模式开始调用公有方法返回实例");
        return eagerSingleton;
    }


}
