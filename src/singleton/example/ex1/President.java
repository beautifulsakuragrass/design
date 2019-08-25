package singleton.example.ex1;

/**
 * 美国总统单例类
 *
 * @author wyc
 * @date 2019/8/24
 */
class President {

    /**
     * President实例
     */
    private static volatile President instance = null;

    /**
     * 私有的构造方法
     */
    private President() {
        System.out.println("产生一个总统！");
    }

    /**
     * 返回President实例
     *
     * @return President President实例
     */
    static President getInstance() {
        if (instance == null) {
            instance = new President();
        } else {
            System.out.println("已经有一个总统，不能产生新总统！");
        }
        return instance;
    }

    void getName() {
        System.out.println("我是美国总统：特朗普。");
    }
}
