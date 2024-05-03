package poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        System.out.println("child1 호출");
        Parent child1 = new Child();
        call(child1);
    }

    private static void call(Parent parent) {
        //Child 인스턴스인 경우 childMethod() 실행
        if (parent instanceof Child child) { // java 16이상 지원
            System.out.println("Child 인스턴스 맞음");
            child.childMethod();
        } else {
            System.out.println("Child 인스턴스 아님");
        }
    }
}
