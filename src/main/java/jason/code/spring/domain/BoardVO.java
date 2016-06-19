package jason.code.spring.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by Jason on 2016-06-12.
 */
@Data
@Getter
@Setter
public class BoardVO {
    private Integer bno;
    private String title;
    private String content;
    private String writer;
    private Date regdate;
    private int viewcnt;
}
