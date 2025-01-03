#Handle the error so it doesn't halt execution.

try:
    print(x)
except NameError:
    print("please enter value for x")

print("end of program")