package singleton.thought;

/**
 * 懒加载的单例模式
 *
 * @author wyc
 * @date 2019/8/24
 */
public class LazySingleton {
    /**
     * 保证 example 在所有线程中同步
     */
    private static volatile LazySingleton instance = null;

    /**
     * private 避免类在外部被实例化
     */
    private LazySingleton() {
    }

    /**
     * 本地实例化方法
     *
     * @return LazySingleton LazySingleton实例
     */
    public static synchronized LazySingleton getInstance() {
        // getInstance 方法前加同步
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

}
