## Try to solve facebook code challenge

### Problem 1: Travel Restriction

Question in this [link](https://www.facebook.com/codingcompetitions/hacker-cup/2020/qualification-round/problems/A)

Build the jar file

```bash
gradle jar
```

Execute it

```bash
java -jar build/libs/coding-challenge-1.0-SNAPSHOT.jar < in.txt > out.txt
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