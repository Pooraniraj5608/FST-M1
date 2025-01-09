# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.color import Color

# Start the Driver
with webdriver.Firefox() as driver:
    # Navigate to the URL
    driver.get("https://training-support.net/webelements/dynamic-controls")
    # Print the title of the page
    print("Page title is: ", driver.title)

    text_field = driver.find_element(By.XPATH,"//input[@id='textInput']")
    enable_input = driver.find_element(By.XPATH,"//button[@id='textInputButton']")
    print("is text field enabled ? : ",text_field.is_enabled())
    enable_input.click()
    print("is text field enabled ? : ",text_field.is_enabled())

    driver.quit()