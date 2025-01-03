#Given a two list of numbers create a new list such that new list should contain only odd numbers from the first list and even numbers from the second list.

list1 = [2,3,4,5]
list2 = [6,7,8,9]
list3 = []

print("List1: ",list1)
print("List2: ",list2)

for i in list1:
    if(i%2!=0):
        list3.append(i)

for i in list2:
    if(i%2==0):
        list3.append(i)

print("List3: " ,list3)