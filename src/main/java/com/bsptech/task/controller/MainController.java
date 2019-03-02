
package com.bsptech.task.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ruslandadashov
 */
@Controller
public class MainController {

    @RequestMapping("/main")
    public String main() {

        return "main";
    }

    @RequestMapping("/logout")
    public String logout() {

        return "logout";
    }

}
