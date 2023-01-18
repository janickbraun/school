with open("data.txt", "r", encoding="utf-8") as f:
    lines = f.read().splitlines()

names = []
emails = []

for i, line in enumerate(lines):
    if i % 2 == 1:
        names.append(line)

for name in names:
    pre, last = name.split(" ")[0], name.split(" ")[1]
    email = pre + "." + last + "@gymnasium-penzberg.de"
    char_map = {ord('ä'): 'ae', ord('ü'): 'ue', ord('ö'): 'oe', ord('ß'): 'ss'}
    print(email.lower().translate(char_map).replace(",", ""))
