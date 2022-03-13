# 문제

![Untitled](%E1%84%86%E1%85%AE%E1%86%AB%E1%84%8C%E1%85%A6%20e3cfa/Untitled.png)

![Untitled](%E1%84%86%E1%85%AE%E1%86%AB%E1%84%8C%E1%85%A6%20e3cfa/Untitled%201.png)

num이 에러 뜨는 이유

- 우선 위 코드에서 실행 시 메모리에 올라가는 것을 체크해보자.
- static이 있는 main이  static 메모리에 올라간다.
- int num = 10; 은 메모리에 올라오지 않았기 때문에 출력을 하지 못한다.