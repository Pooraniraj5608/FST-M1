# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver import ActionChains

# Start the Driver
with webdriver.Firefox() as driver:
    builder = ActionChains(driver)
    # Navigate to the URL
    driver.get("https://training-support.net/webelements/mouse-events")
    # Print the title of the page
    print("Page title is: ", driver.title)

    lock_button = driver.find_element(By.XPATH,"//h1[text()='Cargo.lock']")
    toml_button = driver.find_element(By.XPATH,"//h1[text()='Cargo.toml']")
    src_button = driver.find_element(By.XPATH,"//h1[text()='src']")
    target_button = driver.find_element(By.XPATH,"//h1[text()='target']")

    builder.click(lock_button).move_to_element(toml_button).click().pause(2).perform()
    print(driver.find_element(By.ID,"result").text)

    builder.double_click(src_button).context_click(target_button).perform()

    open_button = driver.find_element(By.XPATH,"//div[@id='menu']//ul/li[1]")

    builder.click(open_button).pause(2).perform()
    print(driver.find_element(By.ID,"result").text)
    driver.quit()


