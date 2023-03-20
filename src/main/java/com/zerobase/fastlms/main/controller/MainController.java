package com.zerobase.fastlms.main.controller;


import com.zerobase.fastlms.banner.dto.BannerDto;
import com.zerobase.fastlms.banner.service.BannerService;
import com.zerobase.fastlms.components.MailComponents;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RequiredArgsConstructor
@Controller
public class MainController {

    private final MailComponents mailComponents;
    private final BannerService bannerService;

    @RequestMapping("/")
    public String index(Model model) {
        List<BannerDto> bannerList = bannerService.frontList();

        bannerList.sort((x, y) -> y.getSortValue() - x.getSortValue());

        model.addAttribute("bannerList", bannerList);

        System.out.println();

        return "index";
    }

    @RequestMapping("/error/denied")
    public String errorDenied() {

        return "error/denied";
    }
}
