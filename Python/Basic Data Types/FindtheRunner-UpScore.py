if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    R = sorted(set(list(map(int, arr))))
    print (R[-2])
    
