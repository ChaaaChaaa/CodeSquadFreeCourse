package dicegame;

public class Money {
    private int money;

    public Money(int money){
        this.money = money;
    }

   public void setMoney(int money){
       this.money = money;
   }

    public int divideMoney(){
        return Math.floorDiv(money, 2);
    }

    public int addMoney(){
        return money+100;
    }
    public int getMoney() {
        return money;
    }
}
