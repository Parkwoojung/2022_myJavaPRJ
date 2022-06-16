package STUDY;

public class Java_0616_1 {
    public static void main(String[] args) {
        Java_0616_1 j = new Java_0616_1();
        int []a = {1,2,3,4};
        int []b = {-3,-1,0,2};
        j.solution(a,b);
    }
    public int solution(int[] a, int[] b) {

        int r = 0;
        for(int i = 0; i < a.length; i++){
            r += a[i] * b[i];
        }
        System.out.println(r);
        return r;
    }
}
