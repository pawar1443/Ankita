package Ankita;

import java.util.Arrays;
class main{
    public static void main(String[] args){
        int[] digits = {1,3,2,6,4,2};
        int temp = 0;
        int n = digits.length;
        for(int i = 0;i< n;i++){
            for(int j = 0;j< n - 1;j++ ){
                if(digits[j] > digits[j+1]){
                    temp = digits[j+1];
                    digits[j+1] = digits[j];
                    digits[j] = digits[j+1];
                }
            }
        }
        for(int i : digits){
            System.out.print(i);
        }
    }
}