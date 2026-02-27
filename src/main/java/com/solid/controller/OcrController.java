package com.solid.controller;

import com.solid.service.OcrService;
import net.sourceforge.tess4j.TesseractException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/api/ocr")
public class OcrController {

    @Autowired
    private OcrService ocrService;


    @PostMapping("/upload")
    public String uploadImage(@RequestParam("file") MultipartFile file)
            throws IOException, TesseractException {

        // Save temporarily
        File convFile = new File(System.getProperty("java.io.tmpdir")
                + file.getOriginalFilename());

        file.transferTo(convFile);

        // Extract text
        String result = ocrService.extractText(convFile);

        // Delete temp file
        convFile.delete();

        return result;
    }
}
