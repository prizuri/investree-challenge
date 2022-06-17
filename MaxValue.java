public class MaxValue {
    public static void main(String[] args) {
        Integer[] number ={2,3,1,4,4,5,6,6};
        int max=0;
        int temp=0;
        for(int i=0;i < number.length;i++){
            temp=number[i];
            if (i==0){
                max=temp;
            }
            if(temp>max){
                max = temp;
            }
        }
        System.out.println(max);
    }
}
