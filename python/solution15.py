def factorial(n):
	if(n <= 1):
		return 1
	return factorial(n-1)*n

def problem15(size):
	return factorial(size*2)/(pow(factorial(size), 2))

print(problem15(20))