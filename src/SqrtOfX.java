public class SqrtOfX {

    public int sqrt(int x){
        int start =0;
        int end= x;
       // int mid= -1;

        while(start <= end){
           int  mid = start + (end-start)/2;

            if((long)mid*mid >(long)x){
                end = mid-1;
            }else if(mid*mid==x){
                return mid;
            }else{
                start= mid+1;
            }

        }

        return end;

    }

    public static void main(String[] args) {
        SqrtOfX sq = new SqrtOfX();
        int value = sq.sqrt(2147395599);
        System.out.println(value);
    }
}
