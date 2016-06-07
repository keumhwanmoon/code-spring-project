package jason.code.spring.controller;

import jason.code.spring.domain.ProductVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Jason on 2016-06-07.
 */
@Controller
public class SampleController5 {
    private static final Logger logger =
            LoggerFactory.getLogger(SampleController5.class);

    @RequestMapping("/doJSON")
    @ResponseBody
    public ProductVO doJSON() {
        ProductVO productVO = new ProductVO("샘플상품", 30000);
        return productVO;
    }
}
