# Import webdriver from selenium
from selenium import webdriver

# Start the Driver
with webdriver.Chrome() as driver:
   # Navigate to the URL
    driver.get("https://alchemy.hguy.co/crm/")

    #get title
    title_text = driver.title

    #Asserting title
    assert title_text=="SuiteCRM"

    #closing browser
    driver.quit()