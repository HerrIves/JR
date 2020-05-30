package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageType){
        ImageReader iReader = null;

            if(imageType == null){throw new IllegalArgumentException("Неизвестный тип картинки");}
            else
        try {
            if (imageType == ImageTypes.JPG) {
                iReader = new JpgReader();
            }
            if (imageType == ImageTypes.BMP) {
                iReader = new BmpReader();
            }
            if (imageType == ImageTypes.PNG) {
                iReader = new PngReader();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Неизвестный тип картинки");
        }

        return iReader;
    }
}
