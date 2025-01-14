# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.wait import WebDriverWait

# Start the Driver
with webdriver.Firefox() as driver:
    # Declare the actions variable
    wait = WebDriverWait(driver,timeout=10)
    # Navigate to the URL
    driver.get("https://training-support.net/webelements/dynamic-controls")
    # Print the title of the page
    print("Page title is: ", driver.title)

    checkbox = driver.find_element(By.ID,"checkbox")
    print("Checkbox is visible? ", checkbox.is_displayed())
    toggle = driver.find_element(By.XPATH,"//button[text()='Toggle Checkbox']")
    
    toggle.click()
    wait.until(EC.invisibility_of_element(checkbox))
    print("Checkbox is visible? ", checkbox.is_displayed())

    toggle.click()
    wait.until(EC.element_to_be_clickable(checkbox))
    checkbox.click()

    print("is checbox selected? ", checkbox.is_selected())

driver.quit()