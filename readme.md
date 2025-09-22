# PJH Java Study — Notes Index

> 자바 학습 노트를 챕터별로 정리한 파일입니다.  
> 각 문서는 **핵심 포인트 → 예제 코드 링크 → 실행 결과 → 확인 문제(정답·해설 참고)** 구조로 정리되어 있습니다.
dd
---

## 챕터 01 — 자바 시작하기
- 01-1. 프로그래밍과 자바  
  ↳ [MD-File/01-1-programming-java.md](MD-File/01-1-programming-java.md)
- 01-3. 프로그램 실행 과정  
  ↳ [MD-File/01-3-program-execution.md](MD-File/01-3-program-execution.md)

---

## 챕터 02 — 기본 문법
- 02-1. 코드 예제 모음(기본)  
  ↳ [MD-File/02-1-code-examples.md](MD-File/02-1-code-examples.md)
- 02-2. 기본 타입(Basic Types)  
  ↳ [MD-File/02-2-basic-types.md](MD-File/02-2-basic-types.md)
- 02-3. 타입 변환(Type Casting)  
  ↳ [MD-File/02-3-type-casting.md](MD-File/02-3-type-casting.md)
- 02-4. 입력과 출력(Input/Output)  
  ↳ [MD-File/02-4-input-output.md](MD-File/02-4-input-output.md)

---

## 챕터 03 — 연산자
- 03-1. 연산자와 표현식(Operators & Expressions)  
  ↳ [MD-File/03-1-operators-expressions.md](MD-File/03-1-operators-expressions.md)
- 03-2. 연산자의 종류(Types of Operators)  
  ↳ [MD-File/03-2-types-of-operators.md](MD-File/03-2-types-of-operators.md)

---

## 챕터 04 — 조건문과 반복문
- 04-1. 조건문: if / switch  
  ↳ [MD-File/04-1-conditionals-if-switch.md](MD-File/04-1-conditionals-if-switch.md)
- 04-2. 반복문: for / while / do-while  
  ↳ [MD-File/04-2-loops-for-while-do-while.md](MD-File/04-2-loops-for-while-do-while.md)

---

## 프로젝트 사용 메모
- **코드 위치**: `code-examples/chapXX_X/*.java`  
- **클래스 파일**: `out/chapXX_X/*.class`  
- **이미지**: `images/XX-Y/FixedNEx.png` (문서에서 `![]()`로 참조)
- **실행 설정**: `launch.json` 각 항목에 `vmArgs: "-Dfile.encoding=UTF-8"` 포함
- **컴파일(예시)**:
  - 특정 단원: `javac -encoding UTF-8 -d out code-examples\chap04_2\*.java`
  - 전체(필요 시): 각 chap 폴더별로 동일 패턴으로 실행

---

## 문서 규칙(요약)
- 모든 MD는 **한 코드블록**으로 전달 및 관리 (언어 지정 없음)
- 이미지 경로는 문서 기준 **상대경로** 사용: `../images/XX-Y/FixedNEx.png`
- 확인 문제: 보기 괄호에 O/X 직접 표기 + `**정답 :** …` 형식, **해설 필수**

행복한 자바 공부 되세요! 🚀

---
---

https://www.hanbit.co.kr/support/supplement_survey.html?pcode=B6700167549 예제코드 링크


# 제작하며 쓰는것
**javac -encoding UTF-8 -d out code-examples\chap폴더명\자바파일명.java - class파일 생성**
- 예시
```java
javac -encoding UTF-8 -d out code-examples\chap02_1\Ex75p.java
```
**tree /f** = 명령어 터미널에서 입력하면 files.txt로 현재 폴더구조 텍스트화 시켜줌

**launch.jsom** = 여러개 폴더에 나뉜 .java파일들 바로바로 실행시키기 위해 생성
**chap00_0 >> ~.claa** 형식을 되어 있는 파일들도 같은 이유
**.class 파일들은 out폴더 안에 단원별 정리**

```java
좋습니다 주환님 🙆
지금까지 내용은 그대로 두고, 다음 단원부터는 아래 포맷을 고정 적용하겠습니다.

핵심 포인트: 각 항목에 > 한줄요약 포함

예제 코드 링크: 보기 친화적인 라벨

실행 결과: 전부 ![]() 이미지 표기

확인 문제: 제목 ### N) 형식 + O/X는 괄호에 바로 기입

.java: package chapXX_X; 포함, ISSUE/FIX/BEFORE/AFTER/EXPECTED/IMAGE PATH 헤더 주석, 실행 가능 상태

launch.json: 해당 단원 전 항목 + "vmArgs": "-Dfile.encoding=UTF-8"

컴파일 안내: javac -encoding UTF-8 -d out code-examples\chapXX_X\*.java

다음 단원은 04-2(반복문: for, while, do-while) 로 진행할까요? 사진(본문+문제+정답/해설) 보내주시면 바로 작업 들어가겠습니다.

그리고 약속대로 먼저 여쭙습니다:
JAVA 파일들을 zip으로 묶어드릴까요, 아니면 파일명+내용 그대로 적어드릴까요?
(이미지 경로는 images/04-2/FixedNEx.png, MD 파일명은 04-2-loops-for-while-do-while.md로 준비하겠습니다.)
```
