# Import 
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from CRM_Activity4 import verify_login

# Start the Driver
with webdriver.Chrome() as driver:
    # Navigate to the URL
        driver.get("https://alchemy.hguy.co/crm/")

        #Login
        verify_login(driver)

        #Verify Activity Menu
        activityText = driver.find_element(By.XPATH,"*//a[text()='Activities']").text
        assert activityText=="ACTIVITIES", "Text does not match!"
        
driver.quit()