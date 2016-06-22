package jason.code.spring.controller;

import jason.code.spring.domain.BoardVO;
import jason.code.spring.domain.Criteria;
import jason.code.spring.domain.PageMaker;
import jason.code.spring.service.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.inject.Inject;

/**
 * Created by Jason on 2016-06-15.
 */
@Controller
@RequestMapping("/board")
public class BoardController {
    private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

    @Inject
    private BoardService service;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public void registGET(BoardVO vo, Model model) throws Exception {
        logger.info("regist get ......");
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registPOST(BoardVO vo, RedirectAttributes rttr) throws Exception {
        logger.info("regist post ......");
        logger.info(vo.toString());

        service.regist(vo);

        rttr.addFlashAttribute("msg", "SUCCESS");

        return "redirect:/board/listAll";
    }

    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    public void listAll(Model model) throws Exception {
        logger.info("show all list ......");
        model.addAttribute("list", service.listAll());
    }

    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public void read(@RequestParam("bno") int bno, Model model) throws Exception {
        model.addAttribute(service.read(bno));
    }

    @RequestMapping(value = "/remove", method = RequestMethod.POST)
    public String remove(@RequestParam("bno") int bno, RedirectAttributes rttr) throws Exception {
        service.remove(bno);

        rttr.addFlashAttribute("msg", "SUCCESS");

        return "redirect:/board/listAll";
    }

    @RequestMapping(value = "/modify", method = RequestMethod.GET)
    public void modifyGET(int bno, Model model) throws Exception {
        model.addAttribute(service.read(bno));
    }

    @RequestMapping(value = "/modify", method = RequestMethod.POST)
    public String modifyPOST(BoardVO vo, RedirectAttributes rttr) throws Exception {
        logger.info("mod post .......");

        service.modify(vo);

        rttr.addFlashAttribute("msg", "SUCCESS");

        return "redirect:/board/listAll";
    }

    @RequestMapping(value = "/listCri", method = RequestMethod.GET)
    public void listAll(Criteria cri, Model model) throws Exception {
        logger.info("show list Page with Criteria...............");
        model.addAttribute("list", service.listCriteria(cri));
    }

    @RequestMapping(value = "/listPage", method = RequestMethod.GET)
    public void listPage(Criteria criteria, Model model) throws Exception {
        logger.info(criteria.toString());

        model.addAttribute("list", service.listCriteria(criteria));
        PageMaker pageMaker = new PageMaker();
        pageMaker.setCriteria(criteria);
        pageMaker.setTotalCount(service.listCountCriteria(criteria));

        model.addAttribute("pageMaker", pageMaker);
    }
}
