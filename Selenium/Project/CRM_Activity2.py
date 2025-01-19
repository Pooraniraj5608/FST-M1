# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By

# Start the Driver
with webdriver.Chrome() as driver:
   # Navigate to the URL
    driver.get("https://alchemy.hguy.co/crm/")

    #Verify url and print to console
    headerText = driver.find_element(By.XPATH,"*//div/img[@alt='SuiteCRM']").get_attribute("src")
    print("Header url is : ",headerText)
    assert headerText=="https://alchemy.hguy.co/crm/themes/default/images/company_logo.png?v=cK7kLsY0ftg72ZVHTYUT_g"

    #closing browser
    driver.quit()