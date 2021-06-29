public class FreshMilk extends BaseDecorator{

    public FreshMilk(PriceInterface wrapperPrice){
        super(wrapperPrice);
    }

    public int calculator(){
        return super.calculator()+150;
    }
}
