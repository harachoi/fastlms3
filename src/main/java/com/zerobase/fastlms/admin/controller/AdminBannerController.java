package com.zerobase.fastlms.admin.controller;

import com.zerobase.fastlms.course.controller.BaseController;
import com.zerobase.fastlms.course.model.CourseParam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Controller
public class AdminBannerController extends BaseController {

    @GetMapping("/admin/banner/list.do")
    public String list(Model model, CourseParam parameter) {

        // parameter.init();
        // List<CourseDto> courseList = courseService.list(parameter);

        // long totalCount = 0;
        // if (!CollectionUtils.isEmpty(courseList)) {
        // totalCount = courseList.get(0).getTotalCount();
        // }
        // String queryString = parameter.getQueryString();
        // String pagerHtml = getPaperHtml(totalCount, parameter.getPageSize(),
        // parameter.getPageIndex(), queryString);

        // model.addAttribute("list", courseList);
        // model.addAttribute("totalCount", totalCount);
        // model.addAttribute("pager", pagerHtml);

        return "admin/banner/list";
    }
}
