package com.jinhui.community.controller;

import com.jinhui.community.Model.User;
import com.jinhui.community.dto.PaginationDTO;
import com.jinhui.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: JinHui
 * @Date: 2020-03-29 22:52
 * @version: 1.0
 */
@Controller
public class profileController {
    @Autowired
    private QuestionService questionService;

    @GetMapping("/profile/{action}")
    public String profile(@PathVariable(name = "action") String action,
                          Model model,
                          HttpServletRequest request,
                          @RequestParam(name = "page",defaultValue = "1") Integer page,
                          @RequestParam(name = "size",defaultValue = "5") Integer size){

        User user = (User) request.getSession().getAttribute("user");
        if (user==null){
            return "redirect:/";
        }

        if (action.equals("question")){
            model.addAttribute("section","question");
            model.addAttribute("sectionName","我的问题");
        }
        else if(action.equals("replies")){
            model.addAttribute("section","replies");
            model.addAttribute("sectionName","最新回复");
        }
        PaginationDTO paginationDTO = questionService.list(user.getId(), page, size);
        model.addAttribute("pagination",paginationDTO);
        return "profile";
    }
}
