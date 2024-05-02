package static2.ex;

public class MathArrayUtils {

    // 다른사람이 인스턴스 생성 하지 못하도록 막음
    private MathArrayUtils() { }

    /*
        배열의 모든 요소를 더하여 합계를 반환합니다.
     */
    public static int sum (int[] array) {
        int result = 0;

        for (int num : array) {
            result += num;
        }

        return result;
    }

    /*
        배열의 모든 요소를 더하여 평균값을 계산합니다.
     */
    public static double average (int[] array) {
        double result = (double)sum(array) / array.length;

        return result;
    }

    /*
        배열에서 최소값을 찾습니다.
     */
    public static int min (int[] array) {
        int result = array[0];

        for (int num : array) {
            result = Math.min(result, num);
        }

        return result;
    }

    /*
        배열에서 최대값을 찾습니다.
     */
    public static int max (int[] array) {
        int result = array[0];

        for (int num : array) {
            result = Math.max(result, num);
        }

        return result;
    }
}