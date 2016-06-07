package jason.code.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Created by Jason on 2016-06-07.
 */
@Controller
public class SampleController4 {
    private static final Logger logger =
            LoggerFactory.getLogger(SampleController4.class);

    @RequestMapping("/doE")
    public String doD(RedirectAttributes rttr) {
        logger.info("doD called but redirect to /doF...............");

        rttr.addFlashAttribute("msg", "This is Message!! with redirected!");

        return "redirect:/doF";
    }
}
