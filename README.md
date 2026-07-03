

## Difference between for loop and while loop

A `for` loop normally puts the starting point, condition, and increment on one line. It is suitable when recording exactly 30 rainfall values.

```java
for (int i = 0; i < 30; i++) {
    dailyReadings[i] = random.nextInt(61);
}
```

A `while` loop checks the condition first, then runs the body. The programmer must remember to increase the counter.

```java
int i = 0;
while (i < 30) {
    dailyReadings[i] = random.nextInt(61);
    i = i + 1;
}
```

## Single and multi-dimensional arrays

A single-dimensional array can keep one list of rainfall values for 30 days.

A multi-dimensional array can keep data for several sensors. For example, `int[][] readings = new int[3][30];` can store 30 days for 3 different sensors.

## Output of the given code

The values greater than 10 are `12`, `20`, and `15`. Their sum is `47`.

Exact output:

```text
47
```

## Program description

The program uses random numbers between 0 and 60 to represent daily rainfall. It uses a `while` loop, calculates total and average rainfall, counts wet days, and classifies the month.
