package com.example.tharani.employee_database;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.ByteArrayOutputStream;

/**
 * Created by Tharani on 12/3/2017.
 */
  //created class Blob_Format
public class Blob_Format {
    /*Static identifies class related thing and getBytes which is a data type*
    Bitmap represents bitmap images/
     */
    public static byte[] getBytes(Bitmap bitmap) {
        // ByteArrayOutputStream class is used to write common data into multiple files.
        ByteArrayOutputStream stream = new ByteArrayOutputStream(); // Creating object
        /*
         compress() method will write a compressed version of the bitmap to the specified
          output stream.
         */
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, stream);
        // Will return a newly allocated Byte array
        return stream.toByteArray();
    }

    // Converting from byte array to bitmap
    public static Bitmap getPhoto(byte[] image) {
        return BitmapFactory.decodeByteArray(image, 0, image.length);
    }
}
