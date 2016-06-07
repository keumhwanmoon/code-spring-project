package jason.code.spring.dao.impl;

import jason.code.spring.dao.MemberDAO;
import jason.code.spring.domain.MemberVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;

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
}
