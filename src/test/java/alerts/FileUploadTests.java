package alerts;

import base.BaseTests;
import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("/home/test/Ale/Selenium-Test-Automation-University/Tests/src/main/resources/Capítulo 1 - Configuración.pdf");
        assertEquals(uploadPage.getUploadedFiles(), "Capítulo 1 - Configuración.pdf", "Uploaded files incorrect");

    }

}
