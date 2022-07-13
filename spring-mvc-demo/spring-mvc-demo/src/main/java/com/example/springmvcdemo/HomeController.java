package com.example.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
public class HomeController {


    // Need a controller method to show the initial HTML Form
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    // Need a controller method to process the HTML form
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    // Need a controller method to read form data and
    // add data to the model
    @RequestMapping("/processFormTwo")
    public String letsShoutDude(HttpServletRequest request, Model model) {

        // read the request parametrer from the HTML form
        String theName = request.getParameter("studentName");

        // convert the data to all caps
        theName = theName.toUpperCase(Locale.ROOT);

        // create the message
        String result = "Yo~ HAHA" + theName;

        // add the message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }

    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {

        // convert the data to all caps
        theName = theName.toUpperCase(Locale.ROOT);

        // create the message
        String result = "Hey My Friend from v3! " + theName;

        // add the message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }
}
