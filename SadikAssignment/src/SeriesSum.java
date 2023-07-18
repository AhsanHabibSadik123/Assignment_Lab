public class SeriesSum {
    private int result;
    public SeriesSum(){
        result = 0;
    }
    public int sumResult(int n){
        for(int i=1;i<=n;i++){
            result +=i;
        }
        return result;
    }
}
