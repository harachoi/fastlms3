package com.zerobase.fastlms.admin.controller;

import com.zerobase.fastlms.admin.service.BannerService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class AdminMainController extends BaseController {

    // @GetMapping("/admin/main.do")
    // public String main() {

    // return "admin/main";
    // }

    private final BannerService bannerService;

    @GetMapping("/admin/main.do")
    public String main(Model model) {
        model.addAttribute("banner", bannerService.list());

        return "admin/main";
    }
}
