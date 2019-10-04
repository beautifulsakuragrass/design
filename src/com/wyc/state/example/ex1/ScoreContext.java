package com.wyc.state.example.ex1;

/**
 * 环境类
 *
 * @author wyc
 * @date 2019/10/3
 */
public class ScoreContext {
    private AbstractState state;

    ScoreContext() {
        state = new LowState(this);
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    public AbstractState getState() {
        return state;
    }

    public void add(int score) {
        state.addScore(score);
    }
}
