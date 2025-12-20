package day20thDec;
/*
    Good question 👍 — this is a **very common beginner confusion** in Java input handling.

I’ll explain it **clearly + practically**, no jargon.

---

## 1️⃣ What is “dummy” input?

**Dummy input** means:

> An **extra input read** that you take **only to clear the buffer**, not because you actually need the value.

It is usually used when:

* Java **skips input**
* You see that `nextLine()` doesn’t wait for user input

So we take a **dummy `nextLine()`** to consume the leftover newline.

---

## 2️⃣ Why does Java “skip” input?

This happens because of **Scanner behavior**.

### Scanner methods behave differently:

| Method       | What it reads                          |
| ------------ | -------------------------------------- |
| `nextInt()`  | Reads number **only**, leaves `\n`     |
| `next()`     | Reads one word                         |
| `nextLine()` | Reads **entire line including spaces** |

---

## 3️⃣ The real problem (buffer issue)

Example 👇

```java
Scanner obj = new Scanner(System.in);

int age = obj.nextInt();     // user enters: 20⏎
String name = obj.nextLine(); // ❌ gets skipped
```

### Why skipped?

Because:

* `nextInt()` reads `20`
* **ENTER key (`\n`) remains in buffer**
* `nextLine()` reads that leftover `\n` immediately

So Java thinks:

> “Oh, line already ended” → skip

---

## 4️⃣ Solution: Dummy `nextLine()`

```java
Scanner obj = new Scanner(System.in);

int age = obj.nextInt();
obj.nextLine();  // ✅ dummy read (clears buffer)

String name = obj.nextLine(); // works correctly
```

### That dummy line:

* **Does not store useful data**
* Only removes leftover newline

---

## 5️⃣ What exactly does `obj.nextLine()` do?

> `nextLine()` reads **everything until ENTER is pressed**

Example:

Input:

```
Krishan Mohan
```

```java
String name = obj.nextLine();
```

Output:

```
Krishan Mohan
```

It captures:

* spaces
* full sentence
* till newline (`\n`)

---

## 6️⃣ When do you NEED dummy `nextLine()`?

Use dummy `nextLine()` **only when**:

✔ You use `nextInt()`, `nextDouble()`, `nextBoolean()`
✔ AND after that you want `nextLine()`

---

## 7️⃣ When you DON’T need dummy input

❌ If you use only `nextLine()` everywhere
❌ If `nextLine()` is the first input

Best practice 👇

```java
String ageStr = obj.nextLine();
int age = Integer.parseInt(ageStr);
```

No skipping, no dummy needed.

---

## 8️⃣ Simple rule to remember (EXAM READY)

> **Dummy `nextLine()` is used to consume leftover newline characters left by numeric input methods like `nextInt()` so that string input is not skipped.**

---

If you want, next I can:

* Show **diagram of Scanner buffer**
* Explain **difference between next(), nextLine(), nextInt()**
* Give **real interview question** on this topic

Just tell me 👍


 */


/*
    Scanner Class:-
    Steps :
        - import java.util.Scanner
        - full form of util -> utilities
        - Declare Scanner Class Object
        - class block and method block we can deckare, we can inherit , can make it static , can make it private

    InBuilt Methods of Scanner Class
        -nextByte(), nextShort(), nextInt(), nextLong(), nextFloat(),nextDouble(),nextBoolean()
        - next().charAt(0), next(), nextLine()
        - what is dummy ,when it skip taking input , what is obj.nextLine()

     - When we make scanner Object in method block we have to cose the scanner resource , oother wise it will resource leak it is warning, not error.




 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter roll number: ");
//        float roll = sc.nextFloat();
//        sc.nextLine();
//
//        System.out.print("Enter name: ");
//        String name = sc.nextLine(); // skipped

        // Widening
        System.out.println("Enter Byte number ");
        int b = sc.nextByte();
        System.out.println(b);

        // Narrowing
        System.out.println("Enter int number ");
        byte a = (byte)sc.nextInt();
        System.out.println(a);

        System.out.println("enter char ");
        int c = sc.next().charAt(0);
        System.out.println(c);

        char ch = (char) sc.nextShort();
        System.out.println(ch);





    }
}
