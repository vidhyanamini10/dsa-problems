package NeetCode.Arrays;

public class SeniorCitizens {
    public static void main(String[] args) {
        String [] arr = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        // brute force
        int left =0;
        /**
        for(int i =0; i< arr.length; i++){
            for(int j =0; j<arr[i].length(); j++){
                String s= arr[i];
                if(s.charAt(j) == 'M' || s.charAt(j) == 'F' || s.charAt(j) == 'O'){
                    Integer val = Integer.valueOf(s.charAt(j+1)+ "" + s.charAt(j+2));
                    if(val > 60){
                        left++;
                    }
                }
            }
        }
        System.out.println(left);
         **/
        int count =0;
        for(String s : arr){
            int age = Integer.parseInt(s.substring(11, 13));
            if(age> 60) count++;
        }
        System.out.println(count);
    }
}
