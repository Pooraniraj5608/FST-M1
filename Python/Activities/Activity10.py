#Given a tuple of numbers, iterate through it and print only those numbers which are divisible by 5

num_tuple = tuple(input("Enter number sequence separated by commas to be added to the list ").split(","))
print("Given list is ", num_tuple)
print("Elements that are divisible by 5:")
for i in num_tuple:
    if(int(i)%5 == 0):
        print(i)