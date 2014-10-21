package com.borodatos.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class ImageUploadController implements ServletContextAware {

    private ServletContext servletContext;
    
    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;      
    }
    
    @RequestMapping(value = "/imgUpload", method = RequestMethod.GET)
    public String impUploadPage() {
        return "imgUpload";
    }
    
    @RequestMapping(value = "/imgUp", method = RequestMethod.POST)
    public String addPersonFromForm(@RequestParam(value = "image", required = false) MultipartFile image) {

        if (!image.isEmpty()) {
            try {
                validateImage(image);
            } catch (RuntimeException re) {
                return "redirect:/imgUpload";
            }

            try {
                saveImage(/*person.getName() + ".jpg", */image);
            } catch (IOException e) {
                //bindingResult.reject(e.getMessage());
                return "redirect:/imgUpload";
            }
        }

        //getPersonService().addPerson(person);
        return "redirect:/imgUpload";
    }
    
    private void validateImage(MultipartFile image) {
        if (!image.getContentType().equals("image/jpeg")) {
            throw new RuntimeException("Only JPG images are accepted");
        }
    }
    
    private void saveImage(/*String filename, */MultipartFile image) throws RuntimeException, IOException {
        try {
            //File file = new File(servletContext.getRealPath("/") + "/" + image.getOriginalFilename());
            File file = new File("D:/" + image.getOriginalFilename());

            FileUtils.writeByteArrayToFile(file, image.getBytes());
            System.out.println("Go to the location:  " + file.toString() + " on your computer and verify that the image has been stored.");
        } catch (IOException e) {
            throw e;
        }
    }

}
