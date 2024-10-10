package com.prj.kfs.Controller;

import com.prj.kfs.dto.userdto;
import com.prj.kfs.entity.userEntity;
import com.prj.kfs.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class userController {

    @Autowired
    public userRepository ur;

    @GetMapping("/intro")
    public String fdsafdsafdsa()
    {
        return "userinput";
    }
    @GetMapping("/intro/{num}")
    public String fdsafdsafdsa(Long num)
    {
        return "userinput";
    }

    @PostMapping("/regist")
    public String asasasasasa(userdto ud)
    {
       userEntity ue = ud.toEntity();
       userEntity uk = ur.save(ue);
       System.out.println(ud.toString());
       return "";
    }

}
