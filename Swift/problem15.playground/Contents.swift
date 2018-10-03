func factorial(n: Double) -> Double {
    if n <= 1 {
        return 1
    }
    return n * factorial(n: n-1)
}

func problem15(size: Double) -> Double {
    return factorial(n: size*2)/(factorial(n: size)*factorial(n: size))
}

print("Size: \(problem15(size: 20))")