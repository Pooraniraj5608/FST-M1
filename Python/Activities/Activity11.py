#Create a Python dictionary that contains a bunch of fruits and their prices.
#Write a program that checks if a certain fruit is available or not.

fruits = {
    "apple" : 100,
    "papaya" : 80,
    "grapes" : 60,
    "pineapple" : 90
}

search_term = input("Enter the fruit you want to know the price ")
if(search_term in fruits):
    print(search_term +" cost is " +str(fruits[search_term]))
else:
    print(search_term +" is out of stock")