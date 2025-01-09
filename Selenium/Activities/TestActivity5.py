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

    checkbox = driver.find_element(By.XPATH,"//input[@id='checkbox']")
    toggle = driver.find_element(By.XPATH,"//button[contains(text(),'Toggle')]")

    print("is checkbox visible ? ",checkbox.is_displayed())
    toggle.click()
    print("is checkbox visible ? ",checkbox.is_displayed())

    driver.quit()