package Chapter01_Variable;

public class FloatEx1 {
    public static void main(String[] args){
        float f = 9.12345678901234567890f;
        float f2 = 1.2345678901234567890f;
        double d = 9.12345678901234567890d;

        System.out.printf("       123456789012345678901234%n");
        System.out.printf("f  : %f%n", f); // 소수점 이하 6번째자리까지 출력 %f는ㄴ 기본적으로 6자리까지만 출력
        System.out.printf("f  : %24.20f%n", f); // 전체 24자리 중 소수점 20자리는 소수점 이하의 수를 출력
        System.out.printf("f2 : %24.20f%n", f2);
        System.out.printf("d  : %24.20f%n", d);
    }
}
