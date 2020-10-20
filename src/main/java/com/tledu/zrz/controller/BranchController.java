package com.tledu.zrz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tledu.zrz.model.Branch;
import com.tledu.zrz.service.IBranchService;

@Controller
@RequestMapping("/branch")
public class BranchController {
	@Autowired
	private IBranchService branchService;

	@RequestMapping("/list")
	public String list(Model model) {
		List<Branch> branchs = branchService.list();
		model.addAttribute("branchs", branchs);
		return "branch/list";
	}
}
