package jason.code.spring;

import jason.code.spring.dao.BoardDAO;
import jason.code.spring.domain.BoardVO;
import jason.code.spring.domain.Criteria;
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

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/**/*.xml")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
/**
 * Created by Jason on 2016-06-20.
 */
public class BoardDAOTest {
    private Logger logger = LoggerFactory.getLogger(BoardDAOTest.class);

    @Inject
    private BoardDAO dao;

    @Test
    public void test1ListPage() throws Exception {
        int page = 3;

        List<BoardVO> list = dao.listPage(page);

        for (BoardVO vo : list) {
            logger.info(vo.getBno() + ":" + vo.getTitle());
        }
    }

    @Test
    public void test2ListCriteria() throws Exception {
        Criteria cri = new Criteria();
        cri.setPage(2);
        cri.setPerPageNum(20);

        List<BoardVO> list = dao.listCriteria(cri);

        for (BoardVO boardVO : list) {
            logger.info(boardVO.getBno() + ":" + boardVO.getTitle());
        }
    }
}
