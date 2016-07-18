package com.alive.test2.controllers;

import org.springframework.stereotype.Controller;

import com.alive.test2.entities.Product;
import com.alive.test2.entities.ProductList;
import com.alive.test2.entities.ProductMap;
import com.alive.test2.entities.User;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MyController {
	@RequestMapping("/action01")
	public String action01(Model model,Product product){
		model.addAttribute("message",product);
		return "index";
	}
	@RequestMapping("/action02")
	public String action02(Model model,User user){
		model.addAttribute("message",user.getUsername()+","+user.getProduct().getName());
		return "index";
	}
	@RequestMapping("/action03")
	public String action3(Model model,ProductList products){
		model.addAttribute("message",products.getItems().get(0) + "<br/>" + products.getItems().get(1));
		return "index";
	}
	@RequestMapping("/action04")
	public String action4(Model model,ProductMap map){
		model.addAttribute("message", map.getItems().get("p1") + "<br/>" + map.getItems().get("p2"));
        return "index";
	}
	@RequestMapping("/action05")
	public String action5(Model model,@RequestParam("u") List<String> users){
		model.addAttribute("message", users.get(0) + "," + users.get(1));
        return "index";
	}
	
	@RequestMapping("/action06")
	public String action6(Model model,@RequestParam("id") List<Integer> ids){
		model.addAttribute("message",Arrays.deepToString(ids.toArray()));
		return "index";
	}
	@RequestMapping("/action07")
	public void action07(@RequestBody List<Product> products,HttpServletResponse response) throws IOException{
		response.setCharacterEncoding("UTF-8");
		System.out.println(Arrays.deepToString(products.toArray()));
		response.getWriter().write("Ìí¼Ó³É¹¦"); 
	}
	
	@RequestMapping("/action07form")
	public String action7Form(Model model) {
		System.out.println(model.containsAttribute("product"));
		return "myform07";
	}
	
	
	@RequestMapping("/action08")
	@ResponseBody
	public List<Product> action8(@RequestBody List<Product> products)
	{
		products.get(0).setPrice(999.99);
		return products;
	}
	@RequestMapping("/action09")
	public String action09(Model model,RedirectAttributes redirectAttributes) {
		Product product = new Product(2, "iPhone7 Plus", 6989.5);
		model.addAttribute("message","action09");
		redirectAttributes.addFlashAttribute("product",product);
		return "redirect:action07form";
	}
	@RequestMapping("/action10")
	public String action10(Model model,@ModelAttribute(name="product",binding=true) Product entity){
		model.addAttribute("message",model.containsAttribute("product")+"<br/>"+entity);
		return "index";
	}
	
	//test git 
	
}
