package com.borodatos.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.borodatos.model.ImageList;

/**
 * @author Vitali Usik
 *
 */
@Service
public class ImageService {
    
    //private static final String LOCAL_HARDCODE_LINK = "C:/Users/Vitali_Usik/workspace/borodatos/src/main/webapp/resources/pic";
    private static final String LOCAL_HARDCODE_LINK = "/Users/macbook/Documents/workspace/borodatos/src/main/webapp/resources/pic";
    private static final String BORO_HARDCODE_LINK = "http://localhost:8080/borodatos/resources/pic/";
    
    public List<ImageList> listImages() {

        List<ImageList> imageList = new ArrayList<ImageList>();
        ImageList image = null;
        File []fileList;        
        File F = new File(LOCAL_HARDCODE_LINK);                
        fileList = F.listFiles();
                        
        for(int i = 0; i < fileList.length; i++) {
             if(fileList[i].isFile())
                 image = new ImageList();
                 image.setImageDate(fileList[i].lastModified());
                 image.setImageLink(fileList[i].getAbsolutePath());
                 image.setLink(BORO_HARDCODE_LINK + fileList[i].getName());
                 imageList.add(image);
        }
        return imageList;
    }

}
