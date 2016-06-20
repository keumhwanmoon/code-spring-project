package jason.code.spring;

import jason.code.spring.dao.BoardDAO;
import jason.code.spring.dao.MemberDAO;
import jason.code.spring.domain.BoardVO;
import jason.code.spring.domain.MemberVO;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by Jason on 2016-06-07.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/**/*.xml")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MemberDAOTest {
    private Logger logger = LoggerFactory.getLogger(MemberDAOTest.class);

    @Inject
    private MemberDAO dao;

    @Test
    public void test1Time() throws Exception {
        System.out.println(dao.getTime());
    }

    @Test
    public void test2InsertMember() throws Exception {
        MemberVO vo = new MemberVO();
        vo.setUserid("user00");
        vo.setUserpw("user00");
        vo.setUsername("USER00");
        vo.setEmail("user00@aaa.com");

        dao.insertMember(vo);
    }

    @Test
    public void test3DeleteMember() throws Exception {
        dao.deleteMember("user00");
    }
}
