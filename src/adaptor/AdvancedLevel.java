package adaptor;

public class AdvancedLevel implements PlayerLevel{
    int ADVANCED_LEVEL = showLevelMessage();
    @Override
    public void run() {
        System.out.println("빨리 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("높이 jump 합니다.");
    }

    @Override
    public void turn() {
        System.out.println("Turn 할 줄 모르지롱.");
    }

    @Override
    public int showLevelMessage() {
        return 2;
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
