package membershipmanagement_hashmap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import memberfixedInfo.GRADE;
import memberfixedInfo.Member;

public class MemberShipManagementMap {
    private Map<Integer,Member> members;

    public MemberShipManagementMap() {
        this.members = new HashMap<>();
    }

    public void addMemberShip(int memberId, String memberName, GRADE grade) {
        if (members.containsKey(memberId)) {
            System.out.println("이미 있는 아이디"+memberId+"의 값이 변경됩니다.");
        }
        members.put(memberId,new Member(memberId,memberName,grade));
    }

    public void showAllMember() {
        members.values().stream().sorted(Comparator.comparing(Member::getMemberId))
                .forEach(customer ->
                        System.out.println(customer.getMemberName() + "님의 아이디는 " + customer.getMemberId() + "이고 등급은 " + customer.getGrade() + "입니다."));

    }

// stream 사용시
//    public boolean removeMember(int memberId) {
//        boolean isExistId = members.entrySet().stream()
//                .anyMatch(member -> member.getKey().equals(memberId));
//
//        if (isExistId) {
//            members.remove(memberId);
//            return true;
//        } else {
//            System.out.println(memberId + "에 해당하는 멤버가 없습니다.");
//            return false;
//        }
//    }


    public boolean removeMember(int memberId) {
        if (members.containsKey(memberId)) {
            members.remove(memberId);
            return true;
        } else {
            System.out.println(memberId + "에 해당하는 멤버가 없습니다.");
            return false;
        }
    }
}
