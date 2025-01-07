import pytest
import math

def test_sqrt():
   num = 25
   assert math.sqrt(num) == 5

def testsquare():
   num = 7
   assert num*num == 40

def testequality():
   assert 10 == 11

   #to run pytest -> pytest
   #to watch test-> pytest -f
   #to watch stop -> ctrl+c
   #to see pass and fail func name-> pytest - v