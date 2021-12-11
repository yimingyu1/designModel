package state;

/**
 * ClassName: Activity
 * Description:
 * date: 2021/12/11 下午9:13
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class Activity {

    private State currentState;
    private State noRaffleState;
    private State canRaffleState;
    private State dispenseState;
    private State dispenseOutState;
    private int count;

    public Activity(int count){
        this.count = count;
        this.noRaffleState = new NORaffleState(this);
        this.currentState = this.noRaffleState;
        this.canRaffleState = new CanRaffleState(this);
        this.dispenseState = new DispenseState(this);
        this.dispenseOutState = new DispenseOutState(this);
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public State getNoRaffleState() {
        return noRaffleState;
    }

    public void setNoRaffleState(State noRaffleState) {
        this.noRaffleState = noRaffleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(State canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(State dispenseState) {
        this.dispenseState = dispenseState;
    }

    public State getDispenseOutState() {
        return dispenseOutState;
    }

    public void setDispenseOutState(State dispenseOutState) {
        this.dispenseOutState = dispenseOutState;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void deductMoney(){
        this.currentState.deductMoney();
    }

    public void raffle(){
        if (this.currentState.raffle()){
            this.currentState.dispensePrize();
        }
    }

}
