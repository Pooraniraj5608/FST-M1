
num_list = list(input("Enter number sequence separated by commas to be added to the list ").split(","))

sum = 0

for i in num_list:
    sum=sum+ int(i)

print(sum)