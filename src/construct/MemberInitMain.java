package construct;

public class MemberInitMain {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.name = "user1";
        member1.age = 15;
        member1.grade = 90;

        MemberInit member2 = new MemberInit();
        member2.name = "user1";
        member2.age = 15;
        member2.grade = 90;

        MemberInit[] members = new MemberInit[2];
        members[0] = member1;
        members[1] = member2;

        for (MemberInit s : members) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + "성적: " + s.grade);
        }

    }
}
