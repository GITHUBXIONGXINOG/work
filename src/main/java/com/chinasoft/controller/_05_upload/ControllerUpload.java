package com.chinasoft.controller._05_upload;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;


@Controller
@RequestMapping("upload")
public class ControllerUpload {
	
	@RequestMapping(value="method01",method=RequestMethod.POST)
	public String method01(MultipartFile file,Model model) throws IOException{
		System.out.println("文件是否进来了！");
		System.out.println(file);
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		
		
		InputStream inputStream = file.getInputStream();
		FileOutputStream fileOutputStream = new  FileOutputStream("D:/java/"+file.getOriginalFilename());
		
		
		IOUtils.copy(inputStream, fileOutputStream);
		model.addAttribute("message", "成功！");
		return "upload";
		
	}
}
