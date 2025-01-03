#Write a function sum() such that it can accept a list of elements and print the sum of all elements
list1 = list(input("Enter number separated by comma ").split(","))
def sum(numbers):
    sum=0
    for num in numbers:
        sum += int(num)
        
    return sum

result = sum(list1)

print("The sum is ", result)