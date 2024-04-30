package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입려하세요: ");
        int n = scanner.nextInt();
        scanner.nextLine();


        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] orders = new ProductOrder[n];

        for (int i = 0; i < n; i++) {
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = scanner.nextLine();

            System.out.print("가격: ");
            int price = scanner.nextInt();

            System.out.print("수량: ");
            int quantity = scanner.nextInt();

            scanner.nextLine(); //입력 버퍼를 비우기 위한 코드

            orders[i] = createOrder(productName, price, quantity);
        }

        // printOrders()를 사용해서 상품 주문 정보 출력
        printOrders(orders);

        // getTotalAmount()를 사용해서 총 결제 금액 계산
        int totalAmount = getTotalAmount(orders);

        // 총 결제 금액 출력
        System.out.println("총 결제 금액: " + totalAmount);
    }

    // productOrder 인스턴스 생성 및 초기값 설정
    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;

        return order;
    }

    // productOrder 출력
    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격 = " + order.price + ", 수량 = " + order.quantity);
        }
    }

    // 총결제금액 출력
    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0; // 총 결제 금액

        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }

        return totalAmount;
    }
}
