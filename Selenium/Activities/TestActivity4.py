# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.color import Color

# Start the Driver
with webdriver.Firefox() as driver:
    # Navigate to the URL
    driver.get("https://training-support.net/webelements/target-practice")
    # Print the title of the page
    print("Page title is: ", driver.title)

    print(driver.find_element(By.XPATH, "//h3[text()='Heading #3']").text)

    fifth_heading_color = Color.from_string(driver.find_element(By.XPATH, "//h5[contains(text(), '#5')]").value_of_css_property("color"))
    print("Fifth heading colour as Hexcode: ", fifth_heading_color.hex)
    print("Fifth heading colour as RGB: ", fifth_heading_color.rgb)

    purple_button = driver.find_element(By.XPATH, "//button[text()='Purple']")
    print("Purple button's classes are: ", purple_button.get_attribute("class"))

    slate_button = driver.find_element(By.CSS_SELECTOR,"button.text-slate-900").text
    print(slate_button)
    
    driver.quit




