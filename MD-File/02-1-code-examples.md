<p align="right"><a href="../readme.md">목차로 이동</a></p>

# 02-1 변수
---
## 변수 이름
|작성 규칙|예|
|----------|--------|
|첫 번째 글자는 문자이거나`$, _ `이어야 하고 숫자로 시작할 수 없으며, 특수 문자가 포함되면 안됩니다.(필수)|가능 : `price, $price, _companyName` / 불가능: `1v, @speed, $#value`|
|영어 대소문자를 구분합니다.(필수)|`firstname`과 `firstName`은 다른 변수|
|첫 문자는 영어 소문자로 시작하되, 다른 단어가 붙을 경우 첫 문자를 대문자로 합니다.(관례)|`maxSpeed, firstName, carBodyColor`|
|문자 수(길이)의 제한은 없습니다.||
|자바 예약어는 사용할 수 없습니다.(필수)|다음 표 참조(예약어)|

**예약어**
|분류|예약어|
|----|-----|
|기본 타입|`boolearn, byte, char, short, int, long, float, double`|
|접근 제한자|`private, protected, public`|
|클래스와 관련된 것|`class, abstract, interface, extends, implements, enum`|
|객체와 관련된 것|`new, instanceof, this, super, null`|
|메소드와 관련된 것|`void, return`|
|제어문과 관련된 것|`if, else, switch, case, default, for, do, while, break, continue`|
|논리값|`true, false`|
|예외 처리와 관련된 것|`try, catch, finally, throw, throws`|
|기타|`package, import, synchronized, final, static`|

**값 저장**
>값 저장에서 **대입 연산자(=)**를 사용하지만 같다는 뜻이 아닌 `a=b`를 예로 들면 `b`값을 `a`에 대입 으로 이해하면 됨
**예시**
- 잘못된 예시
```java
int value;                 //변수 value 선언
int result = value + 10;   //변수 value 값을 읽고 10을 더해서 변수 result에 저장
```
> 변수 value가 선언되었지만 값이 초기화되지 않았기에 `value + 10`에서 `value`변수가 존재하지 않음. 이런 경우 컴파일 에러가 발생
- 올바른 예시
```java
int value = 30;            //변수 value가 30으로 초기화됨
int result = value + 10;   //변수 value 값(30)을 읽고 10을 더해서 변수 result에 저장
```
> 이렇게 되면 오류 없이 `result`값 `40`이 출력
>예제 코드 `Ex73.java`참고

---

## 핵심 포인트 정리

- **변수**: 값을 저장할 수 있는 메모리 번지에 붙인 이름입니다. 변수를 통해 프로그램은 메모리 번지에 값을 저장하고 읽을 수 있습니다.  
> 요약: 값이 저장된 메모리 위치를 가리키는 이름표

- **변수 선언**: 변수에 어떤 타입의 데이터를 저장할지 그리고 변수 이름이 무엇인지를 결정하는 것을 말합니다.  
> 요약: 타입과 이름을 정해 변수를 만듬

- **변수 사용**: 변수의 값을 읽거나 변경하는 것을 말합니다. 출력문이나 연산식 내부에서 사용되어 변수에 저장된 값을 출력하거나 연산에 사용합니다.  
> 요약: 출력/연산에서 값을 읽거나 바꿈
>예제 코드 `Ex75p.java, Ex76p.java` 참고

- **변수 사용 범위**: 변수는 자신이 선언된 위치에서 자신이 속한 블록 내부까지만 사용 가능하고, 밖에서는 사용할 수 없습니다.  
> 요약: `{}` 블록 안에서만 쓸 수 있음(스코프 제한)
>예제 코드 `Ex77p.java` 참고

---

## 예제 코드
- [Ex73p.java](../code-examples/chap02_1/Ex73p.java) - 값 저장 예시
- [Ex75p.java](../code-examples/chap02_1/Ex75p.java) - 변수 사용 예시
- [Ex76p.java](../code-examples/chap02_1/Ex76p.java) - 변수 사용 예시2
- [Ex77p.java](../code-examples/chap02_1/Ex77p.java) - 변수 사용 범위
- [Fixed3Ex.java](../code-examples/chap02_1/Fixed3Ex02_1.java) - 3번 문제 오류 수정
- [Fixed4Ex.java](../code-examples/chap02_1/Fixed4Ex02_1.java) - 4번 문제 오류 수정

## 실행 결과
- ![Ex73p](../images/02-1/Ex73p.png) - Ex73p.java 출력값
- ![Ex75p](../images/02-1/Ex75p.png) - Ex75p.java 출력값
- ![Ex76p](../images/02-1/Ex76p.png) - Ex76p.java 출력값
- ![Ex77p](../images/02-1/Ex77p.png) - Ex77p.java 출력값
- ![Fixed3Ex](../images/02-1/Fixed3Ex.png) - Fixed3Ex정상출력
- ![Fixed4Ex](../images/02-1/Fixed4Ex.png) - Fixed4Ex정상출력

---

## 확인 문제

### 1. 변수에 대한 설명 (맞으면 O, 틀리면 X)
1) 변수는 하나의 값만 저장할 수 있다. ( O )  
> 설명: 변수는 한 시점에 하나의 값만 담을 수 있고 새 값이 들어오면 기존 값은 덮어쓴다.

2) 변수는 선언 시에 사용한 타입의 값만 저장할 수 있다. ( O )  
> 설명: int 변수에는 정수만, String 변수에는 문자열만 저장 가능하다.

3) 변수는 변수가 선언된 중괄호 {} 안에서만 사용 가능하다. ( O )  
> 설명: 변수의 유효 범위는 선언된 블록 내부로 제한된다.

4) 변수는 초기값이 저장되지 않은 상태에서 읽을 수 있다. ( X )  
> 설명: 지역변수는 반드시 초기화 후 사용해야 하며, 초기화하지 않으면 컴파일 에러 발생.

---

### 2. 변수 이름으로 사용할 수 있는 것(O) / 없는 것(X)
1) modelName ( O )  
> 설명: 영문자로 시작하고 규칙에 맞는 식별자다.

2) 6hour ( X )  
> 설명: 숫자로 시작할 수 없다.

3) class ( X )  
> 설명: 자바 예약어는 변수명으로 사용할 수 없다.

4) $value ( O )  
> 설명: $ 기호는 변수명으로 허용된다.

5) _age ( O )  
> 설명: 밑줄(_)로 시작하는 변수명은 허용된다.

6) int ( X )  
> 설명: 자바 예약어이므로 변수명 불가.

---

### 3. 컴파일 에러가 발생하는 코드를 찾고, 그 이유를 설명하세요.
```java
① int sum;
② int score1 = 0;
③ int score2;
④ sum = score1 + score2;
```
**정답 : ④ sum = score1 + score2; / int score2에 값이 초기화가 되어있지않아 읽을수가 없기때문에 에러발생**
>예제 코드 `Fixed3Ex`참고

### 4. 변수 사용 범위에 대한 내용입니다. 컴파일 에러가 발생하는 위치와 이유를 설명하세요.
```java
01 int v1 = 0;
02 if (true) {
03   int v2 = 0;
04   if (true) {
05     int v3 = 0;
06     v1 = 1;
07     v2 = 1;
08     v3 = 1;
09   }
10   v1 = v2 + v3;
11 }
12 System.out.println(v1);
```
**정답: 10번행**
>변수 v3이 선언 블록을 벗어났음. 내부 if 블록에서만 유효하기 때문에 10행에서는 사용할 수 없음
>(예제 코드 `Fixed4Ex`참고)

<p align="right"><a href="#top">위로 이동</a> 