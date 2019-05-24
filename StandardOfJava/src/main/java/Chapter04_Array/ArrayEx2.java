package Chapter04_Array;
import java.util.Arrays;


public class ArrayEx2 {
    public static void main(String[] args) {
        int[] iArr1 = new int[10]; // # 길이 10의 인트형 배열 선언
        int[] iArr2 = new int[10];
        //int[] iArr3 = new int[]{100,95,80,70,60};
        int[] iArr3 = {100, 95, 80, 70, 60}; // # 길이 5의 int형 배열 선언
        char[] chArr = {'a','b','c','d'};    // # 길이 4의 char형 배열 선언

        for(int i=0; i < iArr1.length; i++){
            iArr1[i] = i + 1; // 1~10의 숫자를 순서대로 배열에 넣는다.
        }

        for (int i=0; i < iArr2.length; i++) {
            iArr2[i] = (int)(Math.random()*10) + 1; // 1~10의 값을 배열에 저장
        }

        // 배열에 저장된 값들을 출력한다.
        for(int i=0; i< iArr1.length; i++) {
            System.out.print(iArr1[i] + ","); // # iArr1의 배열의 값을 ','를 구분자로 하여 출력한다
        }
        System.out.println();
        System.out.println(Arrays.toString(iArr2)); // # 배열을 보기 쉽게 문자열로 보여줌
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(chArr));
        System.out.println(iArr3); // # 배열이 몇 차원인지와 주소값이 출력
        System.out.println(chArr); // # 문자형 배열의 경우 문자 리스트가 출력이 된다.
    }
}
