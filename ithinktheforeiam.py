import time
import sys
def lprint(s):
    for c in s:
        sys.stdout.write(c)
        sys.stdout.flush()
        time.sleep(0.03)
    print('')
for num in range(100):
    lprint("I think thefore i am")