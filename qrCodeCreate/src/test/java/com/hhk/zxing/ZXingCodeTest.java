package com.hhk.zxing;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.hhk.zxing1.ZXingCode;

public class ZXingCodeTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @Test
    public void testGetLogoQRCode() {
        String saveFilePath = "F://img";
        String logoFilePath = "D:/111.png";
        ZXingCode zxingCode = new ZXingCode();
        try {
            zxingCode.getLogoQRCode("https://www.baidu.com/", "跳转到百度的二维码");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
