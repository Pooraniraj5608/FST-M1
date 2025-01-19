# Import 
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from CRM_Activity4 import verify_login
from selenium.webdriver.support.color import Color

# Start the Driver
with webdriver.Chrome() as driver:
    # Navigate to the URL
        driver.get("https://alchemy.hguy.co/crm/")

        verify_login(driver)
        wait = WebDriverWait(driver,5)

        wait.until(EC.visibility_of_element_located((By.CSS_SELECTOR, "div.desktop-toolbar")))

        # Get the CSS property value of the toolbar color
        toolbar_color = Color.from_string(driver.find_element(By.CSS_SELECTOR, "div.desktop-toolbar").value_of_css_property("color"))
        print("The color of the navigation toolbar is: ",toolbar_color.hex)

        assert toolbar_color.hex=="#534d64", "Color text does not match!"

        
        driver.quit()

