package com.wyc.state.example.ex1;

/**
 * 具体状态类：中等
 *
 * @author wyc
 * @date 2019/10/3
 */
public class MiddleState extends AbstractState {

    public MiddleState(AbstractState state) {
        hj = state.hj;
        stateName = "中等";
        score = state.score;
    }

    @Override
    public void checkState() {
        if (score < 60) {
            hj.setState(new LowState(this));
        } else if (score >= 90) {
            hj.setState(new HighState(this));
        }
    }
}
