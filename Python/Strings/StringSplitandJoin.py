def split_and_join(line):
    ans = line.split(" ")
    return ("-".join(ans))
inp = input()
print(split_and_join(inp))

if __name__ == '__main__':
    line = input()
    result = split_and_join(line)
    print(result)