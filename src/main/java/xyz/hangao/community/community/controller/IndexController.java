package xyz.hangao.community.community.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import xyz.hangao.community.community.dto.PaginationDTO;
import xyz.hangao.community.community.dto.QuestionDTO;
import xyz.hangao.community.community.service.QuestionService;

import java.util.List;

/**
 * Created By gh
 */
@Controller
public class IndexController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/")
    public String index(Model model,
                        @RequestParam(name = "page", defaultValue = "1") Integer page,
                        @RequestParam(name = "size", defaultValue = "5") Integer size,
                        @RequestParam(name = "search", required = false) String search) {

        PaginationDTO pagination = questionService.list(search,page, size);
        model.addAttribute("pagination", pagination);
        model.addAttribute("search",search);
        return "index";
    }
}
