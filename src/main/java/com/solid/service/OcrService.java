package com.solid.service;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.springframework.stereotype.Service;

import java.io.File;
@Service
public class OcrService {
    public String extractText(File file) throws TesseractException {
        ITesseract tesseract = new Tesseract();

        // Set path to tessdata (IMPORTANT)
        tesseract.setDatapath("D:/LocalDisk(E)/tessdata");
        // Set language to English
        tesseract.setLanguage("eng");

        return tesseract.doOCR(file);
    }
}
