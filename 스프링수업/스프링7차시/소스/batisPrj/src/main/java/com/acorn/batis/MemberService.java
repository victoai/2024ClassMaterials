package com.acorn.batis;


 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service 
public class MemberService {

    @Autowired
    private MemberDao memberDao;

    public int getTotalMemberCount() throws Exception {
        return memberDao.count();
    }

    public List<Member> getAllMembers() throws Exception {
        return memberDao.selectAll();
    }

    public int deleteAllMembers() throws Exception {
        return memberDao.deleteAll();
    }

    public int deleteMemberById(String memberId) throws Exception {
        return memberDao.delete(memberId);
    }

    public int registerNewMember(Member member) throws Exception {
        return memberDao.insert(member);
    }

    public Member getMemberById(Integer memberId) throws Exception {
        return memberDao.select(memberId);
    }

    public int updateMemberInfo(Member member) throws Exception {
        return memberDao.update(member);
    }
}
