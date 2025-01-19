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

        #Printing odd rows names from table
        for i in range(1, 11):
            name_text = driver.find_element(By.XPATH, f"//table[contains(@class,'table-responsive')]/tbody/tr[{i}]/td[3]").text
            user_text = driver.find_element(By.XPATH, f"//table[contains(@class,'table-responsive')]/tbody/tr[{i}]/td[8]").text
            print(f"{i}. Name: {name_text} ; User: {user_text}")

driver.quit()