public class ProductOfInt {
    private int result ;
    public ProductOfInt(){
        result = 1;
    }
    public int multiplication(int n){
        for(int i=1;i<=n;i++){
            result *= i;
        }
        return result;
    }
}
