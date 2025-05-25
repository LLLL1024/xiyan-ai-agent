package com.xiyan.xiaiagent.tools;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WebScrapingToolTest {

    @Test
    void scrapeWebPage() {
        WebScrapingTool webScrapingTool = new WebScrapingTool();
        String url = "https://www.baidu.cn";
        String result = webScrapingTool.scrapeWebPage(url);
        Assertions.assertNotNull(result);
    }
}