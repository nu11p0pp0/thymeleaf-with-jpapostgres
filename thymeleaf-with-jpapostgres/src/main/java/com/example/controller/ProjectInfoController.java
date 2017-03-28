/**
 * 
 */
package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.ProjectInfo;
import com.example.model.ProjectInfoRepository;

@Controller
public class ProjectInfoController {

	@Autowired
	protected ProjectInfoRepository projectInfoRepository;

	@RequestMapping(method = RequestMethod.GET, path = "/project-info")
	public String projectInfo(Model model) {
		Iterable<ProjectInfo> all = projectInfoRepository.findAll();
		model.addAttribute("results", all);
		return "project-info";
	}

}
