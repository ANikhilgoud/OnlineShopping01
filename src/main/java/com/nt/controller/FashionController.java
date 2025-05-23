package com.nt.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.Categories.Fashion;
import com.nt.service.IFashionServiceMngt;

@Controller
public class FashionController {

    @Autowired
    private IFashionServiceMngt fashionService;

    @GetMapping("/Add_Fashion_items")
    public String showFashionForm(@ModelAttribute("items") Fashion fashion) {
        return "Add_Fashion_items_Form";
    }

    @PostMapping("/Add_Fashion_items")
    public String addFashionItems(
            @ModelAttribute("items") Fashion fashion,
            @RequestParam("imagefile") MultipartFile file,
            RedirectAttributes atts,@RequestParam(value = "lang", required = false) String lang) {

        try {
            if (!file.isEmpty()) {
                fashion.setImage(file.getBytes());
            }
            String msg = fashionService.InsertCloth(fashion);
            atts.addFlashAttribute("resultdata", msg);
            return "redirect:retrieve-fashion-items";
        } catch (IOException e) {
            e.printStackTrace(); 
            atts.addFlashAttribute("resultdata", "Error uploading item");
            return "redirect:home";
        }
       
    }

    @GetMapping("/retrieve-fashion-items")
    public String retrieveFashionItems(Map<String, Object> map) {
        List<Fashion> items = fashionService.ReteiveCloth();
        map.put("items", items);
        return "Fashion_list";
    }
}
