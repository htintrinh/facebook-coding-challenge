## Try to solve facebook code challenge

### Problem 1: Travel Restriction

Question in this [link](https://www.facebook.com/codingcompetitions/hacker-cup/2020/qualification-round/problems/A)

Build the jar file

```bash
gradle travelRestrictionJar
```

Execute it

```bash
java -jar build/libs/coding-challenge-travel-restriction-1.0-SNAPSHOT.jar < in.txt > out.txt
```

With the sample input here:

```text
5
2
YY
YY
2
NY
YY
2
NN
YY
5
YNNYY
YYYNY
10
NYYYNNYYYY
YYNYYNYYNY
```

Produce the output as expected.

```text
Case #1:
YY
YY
Case #2:
YY
NY
Case #3:
YN
NY
Case #4:
YNNNN
YYNNN
NNYYN
NNNYN
NNNYY
Case #5:
YYYNNNNNNN
NYYNNNNNNN
NNYNNNNNNN
NNYYNNNNNN
NNYYYNNNNN
NNNNNYNNNN
NNNNNNYYYN
NNNNNNYYYN
NNNNNNNNYN
NNNNNNNNYY
```

### Problem 2: Alchemy

Question in this [link](https://www.facebook.com/codingcompetitions/hacker-cup/2020/qualification-round/problems/B)

This seems to be an easier problem. I just have to count the number of shard A or B.
After that make a condition check on it.

Build the jar file

```bash
gradle alchemyJar
```

Execute it

```bash
java -jar build/libs/coding-challenge-alchemy-1.0-SNAPSHOT.jar < in.txt > out.txt
```

With the sample input here:

```text
6
3
BAB
3
BBB
5
AABBA
7
BAAABAA
11
BBBAABAAAAB
11
BABBBABBABB
```

Produce the output as expected.

```text
Case #1: Y
Case #2: N
Case #3: Y
Case #4: N
Case #5: Y
Case #6: N
```