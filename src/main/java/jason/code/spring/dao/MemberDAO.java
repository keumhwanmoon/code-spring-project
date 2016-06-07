package jason.code.spring.dao;

import jason.code.spring.domain.MemberVO;

/**
 * Created by Jason on 2016-06-07.
 */
public interface MemberDAO {
    public String getTime();

    public void insertMember(MemberVO vo);

    public MemberVO readMember(String userId) throws Exception;

    public MemberVO readWithPw(String userId, String userPw) throws Exception;
}
