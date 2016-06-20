package jason.code.spring.service;

import jason.code.spring.domain.BoardVO;
import jason.code.spring.domain.Criteria;

import java.rmi.server.ExportException;
import java.util.List;

/**
 * Created by Jason on 2016-06-15.
 */
public interface BoardService {
    public void regist(BoardVO vo) throws Exception;
    public BoardVO read(Integer bno) throws Exception;
    public void modify(BoardVO vo) throws Exception;
    public void remove(Integer bno) throws Exception;
    public List<BoardVO> listAll() throws Exception;
    public List<BoardVO> listCriteria(Criteria cri) throws Exception;
}