public class M15test {
    public static void main(String[] args) {

        int [ ] arr = {1,3,4,5,4,3,6,7,8,9,6,2,1};

        for(int i = 0; i<arr.length-1; i++){ //회전 수
            for(int j = 0; j < arr.length -1-i; j++) {//비교하는 횟수
                if (arr[j] > arr[j + 1]) {
                    int temp = arr [j]; // 5
                    arr[j] = arr[j+1]; // 4
                    arr [j + 1] = temp; // 4번째 인덱스 + temp값을 넣으면
                }

            }
            System.out.println(i+"번째 회전 결과는?? : ");
            for (int k = 0; k < arr.length; k++){
                System.out.print(arr[k] + " ");
            }
            System.out.println( );
        }
    }
}
