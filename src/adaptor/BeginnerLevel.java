package adaptor;

public class BeginnerLevel implements PlayerLevel {
    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("Jump 할 줄 모르지롱.");
    }

    @Override
    public void turn() {
        System.out.println("Turn 할 줄 모르지롱.");
    }

    @Override
    public int showLevelMessage() {
        return 1;
    }

    @Override
    public void go(int count) {
        run();
        for(int i =0; i < count; i++) {
            jump();
        }
        turn();;
    }
}
