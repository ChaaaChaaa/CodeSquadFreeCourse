package membershipmanagement_hashset;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

import memberfixedInfo.GRADE;
import memberfixedInfo.Member;

public class MemberShipManagementSet {
    private Set<Member> members;

    public MemberShipManagementSet() {
        this.members = new HashSet<>();
    }

    public void addMemberShip(int memberId, String memberName, GRADE grade) {
        if (!members.add(new Member(memberId, memberName, grade))) {
            System.out.println("이미 있는 아이디" + memberId + "는 추가할 수 없습니다.");
        }
    }

    public void showAllMember() {
        members.stream().sorted(Comparator.comparing(Member::getMemberId))
                .forEach(customer ->
                        System.out.println(customer.getMemberName() + "님의 아이디는 " + customer.getMemberId() + "이고 등급은 " + customer.getGrade() + "입니다."));

    }

    public boolean removeMember(int memberId) {
        Member removeMember = members.stream()
                .filter(m -> m.getMemberId() == memberId)
                .findFirst()
                .orElse(null);
        if (removeMember != null) {
            members.remove(removeMember);
            return true;
        } else {
            System.out.println(memberId + "에 해당하는 멤버가 없습니다.");
            return false;
        }
    }
}
