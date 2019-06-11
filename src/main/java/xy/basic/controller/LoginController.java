package xy.basic.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import xy.basic.entity.User;
import xy.basic.service.UserService;

import javax.validation.Valid;

/**
 * @Description
 * @Date 2019/6/11
 * @Created by xiayun
 */
@Controller
@RequestMapping(value="/login")
public class LoginController {

    private UserService userService;


    @RequestMapping(value="/login",method= RequestMethod.POST)
    public String login(@Valid User user, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        try {
            if(bindingResult.hasErrors()){
                return "/login";
            }
            UsernamePasswordToken token= new UsernamePasswordToken(user.getLoginName(),user.getPassword());
            SecurityUtils.getSubject().login(token);
            //使用权限工具进行用户登录，登录成功后跳到shiro配置的successUrl中，与下面的return没什么关系！
            return "redirect:/user";
        } catch (AuthenticationException e) {
            redirectAttributes.addFlashAttribute("message","用户名或密码错误");
            return "redirect:/login";
        }
    }


}
