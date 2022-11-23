package memberfixedInfo;

import java.util.Comparator;
import java.util.Objects;

public class Member implements Comparator<Member>{
    int memberId;
    String memberName;
    GRADE grade;

    public Member(int memberId, String memberName, GRADE grade){
        this.memberId = memberId;
        this.memberName = memberName;
        this.grade = grade;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public GRADE getGrade() {
        return grade;
    }


    @Override
    public int compare(Member o1, Member o2) {
        return o1.memberId - o2.memberId;
    }

    @Override
    public boolean equals(Object o) {
        Member member = (Member) o;
        return this.memberId == member.memberId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberId);
    }
}
