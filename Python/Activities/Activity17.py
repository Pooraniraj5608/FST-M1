# Import pandas
import pandas
 
# Create a Dictionary that will hold our data
data = {
  "Usernames": ["admin", "charles", "deku"],
  "Passwords": ["password", "charl13", "allMight"]
}

#convert dictionary to list of dataframe
dataframe = pandas.DataFrame(data)

#convert dataframe to csv file
dataframe.to_csv("activity/outputs/sample.csv",index=False)

#Read csv file
pandas.read_csv("activity/outputs/sample.csv")