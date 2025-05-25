package com.xiyan.xiaiagent.tools;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PDFGenerationToolTest {

    @Test
    void generatePDF() {
        PDFGenerationTool tool = new PDFGenerationTool();
        String fileName = "编程项目.pdf";
        String content = "编程项目 https://github.com";
        String result = tool.generatePDF(fileName, content);
        assertNotNull(result);
    }
}