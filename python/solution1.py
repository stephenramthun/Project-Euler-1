t = int(input())
for i in range(t):
    n=int(input())-1
    a=3*(n//3)*((n//3)+1)//2
    b=5*(n//5)*((n//5)+1)//2
    c=15*(n//15)*((n//15)+1)//2
    print(a+b-c)

'''
Consider; the sum of all numbers from 1 to n is equal to n*(n+1)/2. 
Also the sum of all numbers less than n that divides d equals d times the sum of all numbers less than n/d.

So the sum of all numbers less than 1000 that divides 3 is

a = 3*floor(999/3)*(floor(999/3)+1)/2

Likewise the sum of all numbers less than 1000 that divides 5 is

b = 5*floor(999/5)*(floor(999/5)+1)/2

Adding the two numbers would overcount though. Since the numbers that divides both 3 and 5 would get counted twice. The numbers that divides both 3 and 5 is precisely the numbers that divides 3*5/gcd(3,5)=15/1=15.

The sum of all numbers less than 1000 that divides 15 is

c = 15*floor(999/15)*(floor(999/15)+1)/2

So the final result is that the sum of all numbers less than 1000 that divides either 3 or 5 equals:

result = a + b - c
'''