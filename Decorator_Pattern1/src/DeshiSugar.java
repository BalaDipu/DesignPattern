public class DeshiSugar extends BaseDecorator{

    public DeshiSugar(PriceInterface wrapperPrice){
        super(wrapperPrice);
    }

    public int calculator(){
        return super.calculator()+100;
    }
}
