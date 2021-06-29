public class Duck {
    private quack qb;
    private display dp;
    private fly fl;

    public Duck(quack qb, display dp, fly fl){
        this.qb = qb;
        this.dp = dp;
        this.fl = fl;
    }

    public void print() {
        System.out.println(qb.quack());
        System.out.println(dp.display());
        System.out.println(fl.fly());
    }
}
