package poly.basic;

public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent = new Child();
        Child child1 = (Child) parent;
        child1.childMethod(); //문제 없음

        Parent parent2 = new Parent();
        Child child2 = (Child)parent2;//런타임 오류 - ClassCastingException
        child2.childMethod(); //실행 불가
    }
}
