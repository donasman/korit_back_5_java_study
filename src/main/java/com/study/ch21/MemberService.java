package com.study.ch21;

import com.study.ch19.Member;

import java.util.ArrayList;

public interface MemberService {
    // 인터페이스 설계시 throws Exception 꼭 달아준다.
    // 인터페이스 메소드를 무조건 예외처리를 검사하게 한다.
    public void printMemberList(ArrayList<Member> members) throws Exception;


}
