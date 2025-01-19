public class SmallestLetter {
    // find the smallest letter which is greater than the target

    static char smallestLetterGreaterThanTarget(char [] letters, char target){
        int start=0;
        int end = letters.length-1;

        while(start<=end){
            int mid = start+ (end-start)/2;

//if (target > letters[mid])  Edge Case: target == mid	May fail to move start forward in some cases
            if(target < letters[mid]){
                end= mid-1;

            }else {

                start = mid +1;
            }

        }
        return letters[start % letters.length];
    }
    public static void main(String[] args) {
        char value = smallestLetterGreaterThanTarget(new char[]{'c','f','j'}, 'j' );

        System.out.println(value);

    }

}
