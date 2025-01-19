# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By

# Define the login verification function
def verify_login(driver):
    
    # Navigate to the URL
    driver.get("https://alchemy.hguy.co/crm/")
    driver.maximize_window()

    # Log in to the application
    driver.find_element(By.ID, "user_name").send_keys("admin")
    driver.find_element(By.ID, "username_password").send_keys("pa$$w0rd")
    driver.find_element(By.ID, "bigbutton").click()

    # Verify the homepage by checking the dashboard text
    dashboard = driver.find_element(By.XPATH, "*//a[@id='tab0']").text
    assert dashboard == "SUITECRM DASHBOARD", "Dashboard text does not match!"
    print("End of method: Login Successful!")

# Main section to execute the function
if __name__ == "__main__":
    # Start the driver
    driver = webdriver.Chrome()

    try:
        # Call the login function
        verify_login(driver)
    finally:
        # Quit the browser
        driver.quit()