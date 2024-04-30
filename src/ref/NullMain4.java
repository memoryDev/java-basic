package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        // 여기서 Null Pointer Exception 예외 발생
        System.out.println("bigData.data.value = " + bigData.data.value);
    }
}
