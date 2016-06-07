package jason.code.spring.dao.impl;

import jason.code.spring.dao.MemberDAO;
import jason.code.spring.domain.MemberVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jason on 2016-06-07.
 */
@Repository
public class MemberDAOImpl implements MemberDAO {
    @Inject
    private SqlSession sqlSession;

    private static final String namespace = "jason.code.spring.mapper.MemberMapper";

    @Override
    public String getTime() {
        return sqlSession.selectOne(namespace + ".getTime");
    }

    @Override
    public void insertMember(MemberVO vo) {
        sqlSession.insert(namespace + ".insertMember", vo);
    }

    @Override
    public MemberVO readMember(String userId) throws Exception {
        return sqlSession.selectOne(namespace + ".selectMember", userId);
    }

    @Override
    public MemberVO readWithPw(String userId, String userPw) throws Exception {
        Map<String, Object> paramMap = new HashMap<>();

        paramMap.put("userid", userId);
        paramMap.put("userpw", userPw);

        return sqlSession.selectOne(namespace + ".selectMember", paramMap);
    }
}
