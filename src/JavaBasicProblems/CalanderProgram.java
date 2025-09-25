package JavaBasicProblems;



public class CalanderProgram {

    public static void main(String[] args) {
        int days = 30;
        int count =0;
        for (int i =1; i < days; i++){
            if(i % 2== 0){
                count ++;
            }
        }
        System.out.println(count);
    }
}
