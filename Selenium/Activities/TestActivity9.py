# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver import Keys,ActionChains

# Start the Driver
with webdriver.Firefox() as driver:
    builder = ActionChains(driver)
    # Navigate to the URL
    driver.get("https://training-support.net/webelements/keyboard-events")
    # Print the title of the page
    print("Page title is: ", driver.title)

    textbox = driver.find_element(By.XPATH,"//h1[@class='mt-3 text-center text-4xl font-semibold text-black']")
    builder.send_keys("Hi from selenium").send_keys(Keys.RETURN).perform()
    print(textbox.text)

    driver.quit()
