package jason.code.spring.dao;

import jason.code.spring.domain.BoardVO;

import java.util.List;

/**
 * Created by Jason on 2016-06-12.
 */
public interface BoardDAO {
    public void create(BoardVO vo ) throws Exception;
    public BoardVO read(Integer bno) throws Exception;
    public void update(BoardVO vo) throws Exception;
    public void delete(Integer bno) throws Exception;
    public List<BoardVO> listAll() throws Exception;
    public List<BoardVO> listPage(int page) throws Exception;
}
