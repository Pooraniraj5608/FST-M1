# Import 
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from CRM_Activity4 import verify_login
from selenium.webdriver import ActionChains

# Start the Driver
with webdriver.Chrome() as driver:
    # Navigate to the URL
        driver.get("https://alchemy.hguy.co/crm/")

        #Login
        verify_login(driver)

        #Navigate Sales -> Leads
        sales = driver.find_element(By.XPATH,"*//a[@id='grouptab_0']")
        actions = ActionChains(driver)
        actions.move_to_element(sales).click().perform()

        leads = driver.find_element(By.XPATH,"*//a[@id='grouptab_0']//following-sibling::ul[@class='dropdown-menu']/li/a[text()='Leads']")
        actions.move_to_element(leads).click().pause(5).perform()

        info = driver.find_element(By.XPATH,"*//table[contains(@class,'table-responsive')]/tbody/tr[1]/td[10]")
        actions.move_to_element(info).click().pause(5).perform()

        #get phone number
        phone = driver.find_element(By.XPATH,"*//span[@class='phone']").text
        assert phone=="9000001234"
        print("Phone number : ",phone)

#close browser
driver.quit()
