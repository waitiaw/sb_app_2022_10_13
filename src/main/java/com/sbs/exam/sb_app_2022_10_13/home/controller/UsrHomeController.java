package com.sbs.exam.sb_app_2022_10_13.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsrHomeController {
  @RequestMapping("/usr/home/main")
  @ResponseBody
  public String showmain() {
    return "안녕하세요";
  }

  @RequestMapping("/usr/home/main2")
  @ResponseBody
  public String showmain2() {
    return "알겠습니다.";
  }
}
