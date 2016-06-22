package jason.code.spring.service.impl;

import jason.code.spring.dao.BoardDAO;
import jason.code.spring.domain.BoardVO;
import jason.code.spring.domain.Criteria;
import jason.code.spring.service.BoardService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by Jason on 2016-06-15.
 */
@Service
public class BoardServiceImpl implements BoardService {
    @Inject
    private BoardDAO dao;

    @Override
    public void regist(BoardVO vo) throws Exception {
        dao.create(vo);
    }

    @Override
    public BoardVO read(Integer bno) throws Exception {
        return dao.read(bno);
    }

    @Override
    public void modify(BoardVO vo) throws Exception {
        dao.update(vo);
    }

    @Override
    public void remove(Integer bno) throws Exception {
        dao.delete(bno);
    }

    @Override
    public List<BoardVO> listAll() throws Exception {
        return dao.listAll();
    }

    @Override
    public List<BoardVO> listCriteria(Criteria cri) throws Exception {
        return dao.listCriteria(cri);
    }

    @Override
    public int listCountCriteria(Criteria criteria) throws Exception {
        return dao.countPaging(criteria);
    }
}
