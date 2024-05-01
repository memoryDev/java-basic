package access.ex;

public class ShppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {

        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        items[itemCount] = item;
        itemCount++;
    }

    public void displayItem () {
        int sum = 0;

        System.out.println("장바구니 상품 출력");
        for (Item item : items) {
            if (item == null) {
                break;
            }

            sum += item.getTotalPrice();
            System.out.println("상품명:" + item.getName() + ", 합계:" + item.getTotalPrice());
        }

        System.out.println("전체 가격 합 : " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i< itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }

        return totalPrice;
    }
}
