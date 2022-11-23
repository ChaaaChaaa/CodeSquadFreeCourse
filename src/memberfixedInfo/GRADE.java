package memberfixedInfo;

public enum GRADE {
    SILVER(1),
    VIP(2),
    PLATINUM(3);

    public int level;

    GRADE(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
