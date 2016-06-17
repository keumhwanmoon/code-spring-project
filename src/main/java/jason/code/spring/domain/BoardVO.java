package jason.code.spring.domain;

import lombok.Data;

import java.util.Date;

/**
 * Created by Jason on 2016-06-12.
 */
@Data
public class BoardVO {
    private Integer bno;
    private String title;
    private String content;
    private String writer;
    private Date regdate;
    private int viewcnt;
}
