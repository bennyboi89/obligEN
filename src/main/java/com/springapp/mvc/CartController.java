package com.springapp.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.View;

/**
 * Created by benny on 08.09.15.
 */

@Controller
@RequestMapping("/")
public class CartController {

    @Autowired private VareRepository vareRepository;

    @RequestMapping(method = RequestMethod.GET)
    public String listAll(Model model) {
        model.addAttribute("vareListe", vareRepository.findAll());


        return "home";
    }


    @RequestMapping(value = "/addProdukt", method = RequestMethod.POST)
    public String addProdukt(@ModelAttribute("home") Vare vare){
        vareRepository.save(vare);
        return "redirect:/";
    }

    @RequestMapping(value = "/deleteProdukt", method = RequestMethod.GET)
    public String deleteProdukt(@ModelAttribute("home")Vare vare){
        vareRepository.delete(vare);
        return "redirect:/";
    }

}
