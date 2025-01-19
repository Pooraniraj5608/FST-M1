# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By

# Start the Driver
with webdriver.Chrome() as driver:
   # Navigate to the URL
    driver.get("https://alchemy.hguy.co/crm/")


     #Print and verify text copyright to console
    copyrightText = driver.find_element(By.ID,"admin_options").text
    print("The first copyrighttext in the footer is : ",copyrightText)
    assert copyrightText=="© Supercharged by SuiteCRM"

    

    #closing browser
driver.quit()