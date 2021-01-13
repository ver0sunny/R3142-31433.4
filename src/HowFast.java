public class HowFast {
    private int speed;
    private MovingTypes howFast;

    public HowFast() { this.howFast = MovingTypes.STOP_AND_STAY_STILL; }
    public final HowFast move(int speed) {
        if (this.speed < 7) this.howFast = MovingTypes.WALK;
        if (this.speed > 15) this.howFast = MovingTypes.RUN;
        return this;
    }
}
