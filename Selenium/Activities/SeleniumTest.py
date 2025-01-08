# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.firefox.service import Service

# Start the Driver
with webdriver.Firefox() as driver:
  
  # Open the browser to the URL
  driver.get("https://training-support.net")
  print("page title is " + driver.title)

  driver.get()
  driver.back()
  driver.forward()
  driver.refresh()
  
  # Perform testing and assertions
  ...
  
  # Close the browser
  # Feel free to comment out the line below
  # so it doesn't close too quickly
  driver.quit()