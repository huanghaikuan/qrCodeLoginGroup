package com.hhk.zxing2;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class QrcodeUtilsTest {
    private static Logger logger = LoggerFactory.getLogger(QrcodeUtils.class);
    private String content = "abc";

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @Test
    public void testCreateQrcodeStringIntFile() throws IOException {
        byte[] bytes = QrcodeUtils.createQrcode(content, 800, null);
        Path path = Files.createTempFile("qrcode_800_", ".jpg");
        logger.info("{}", path.toAbsolutePath());
        Files.write(path, bytes);

        bytes = QrcodeUtils.createQrcode(content, null);
        path = Files.createTempFile("qrcode_400_", ".jpg");
        logger.info("{}", path.toAbsolutePath());
        Files.write(path, bytes);
    }

    @Test
    public void testCreateQrcodeStringFile() {
        fail("Not yet implemented");
    }

    @Test
    public void testDecodeQrcode() {
        fail("Not yet implemented");
    }

}
