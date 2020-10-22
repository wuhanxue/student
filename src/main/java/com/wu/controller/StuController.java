package com.wu.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.wu.dao.StuMapper;
import com.wu.entity.Student;
import com.wu.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/stu")
public class StuController {

    @Autowired
    StuService stuService;
    @Autowired
    StuMapper stuMapper;


    @RequestMapping("/list")
    public String list(Model model) throws Exception {
//        List<Student> studentList = stuService.list();
        List<Student> studentList = stuMapper.selectList(Wrappers.emptyWrapper());
        model.addAttribute("stus", studentList);
        return "stulist";
    }

    @RequestMapping("/delete")
    public String delete(Integer id) {
        stuMapper.deleteById(id);
        return "redirect:/stu/list";
    }


}
