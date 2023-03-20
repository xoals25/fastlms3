package com.zerobase.fastlms.banner.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class BannerController {
    @GetMapping("/admin/banner")
    public String findPassword() {

        return "member/find_password";
    }
}
