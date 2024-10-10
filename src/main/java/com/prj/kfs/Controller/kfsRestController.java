package com.prj.kfs.Controller;

import com.prj.kfs.dto.userdto;
import com.prj.kfs.entity.userEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class kfsRestController {

   @PostMapping("/aiinput")
   public userdto aidata(@RequestBody userdto dtos)
   {
       System.out.println(dtos);
       return dtos;
   }
// return new userEntity(null, name, pw, address, email, mbti, iq, eq, mt, rk);
}
