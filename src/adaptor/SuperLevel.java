package adaptor;

public class SuperLevel implements PlayerLevel{
    @Override
    public void run() {
        System.out.println("엄청 빨리 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("아주 높이 jump 합니다.");
    }

    @Override
    public void turn() {
        System.out.println("한 바퀴 돕니다.");
    }

    @Override
    public int showLevelMessage() {
        return 3;
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
