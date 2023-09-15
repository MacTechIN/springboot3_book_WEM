package org.mactechin.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired // TestService &#xBE48; &#xC8FC;&#xC785;
    TestService testService;

    @GetMapping ("/test")
    public List<Member> getAllMembers() {
        List<org.mactechin.springbootdeveloper.Member> members = testService.getAllMembers();
        return members;
    }

}
