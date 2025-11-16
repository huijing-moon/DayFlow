package com.huijing.dayflow;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/dayflow")
    @ResponseBody //문자열 리턴
    public String index(){
        return "안녕 뭉콩블로그";
    }
}
