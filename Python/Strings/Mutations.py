string=input()
k=input()
j=k.split()
string=string[:int(j[0])]+j[1]+string[int(j[0])+1:]
print (string)

if __name__ == '__main__':
    s = input()
    i, c = input().split()
    s_new = mutate_string(s, int(i), c)
    print(s_new)