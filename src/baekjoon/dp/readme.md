# 동적 계획법(Dynamic Programming)

- 큰 문제를 작은 문제로 나누어서 푸는 방식
- 처음 주어진 문제를 더 작은 문제들로 나눈 뒤 각 조각의 답을 계산
- 답들로 부터 원래 문제에 대한 답을 계산해 낸다는 점에서 분할 정복(Divide & Conquer, D&C)과 비슷
    - 가장 큰 차이점은 동적 계획법에서는 쪼개진 작은 문제가 중복되지만, 분할 정복은 절대로 중복될수가 없다는 점이다


## 조건

- 두 가지 속성을 만족해야 동적 계획법으로 문제를 풀 수 있다.
1. **Overlapping Subproblem** : 겹치는 부분(작은) 문제
2. **Optimal Substructure** : 최적 부분구조

### 겹치는 부분 문제

어떤 문제가 여러개의 부분문제(subproblem)으로 쪼개질 수 있을때 사용하는 용어이다. 이때 '부분 문제'란, 항상 새로운 부분 문제를 생성해내기 보다는 계속해서 같은 부분 문제가 여러번 재사용되거나 재귀 알고리즘을 통해 해결되는 문제를 가리킨다.

### **최적 부분구조**

어떤 문제의 최적의 해결책이 그 부분 문제의 최적의 해결책으로 부터 설계될 수 있는 경우를 말한다. 즉, 최적 부분구조 일때 **문제의 정답을 작은 문제의 정답에서 부터 구할 수 있다.** 이 속성은 동적 계획법이나 그리디 알고리즘의 유용성을 판별하는데 사용되기도 한다.

## 메모이제이션(Memoization)

동적 계획법에서 각 문제는 **한 번만** 풀어야 한다. 중복되는 부분 문제를 여러번 풀지 않는다는 뜻이다. Optimal Substructure를 만족하기 때문에 같은 문제는 구할 때마다 정답이 같다. 따라서 정답을 한 번 구했으면 그 정답을 캐시에 메모해놓는다. 이렇게 메모하는 것을 코드의 구현에서는 배열에 저장하는 것으로 할 수 있다. 이를 메모이제이션(Memoization)이라고 한다.

## 구현 방식

동적 계획법의 구현 방식에는 두 가지 방법이 있다.

1. **Top-down** : 큰 문제를 작은 문제로 쪼개면서 푼다. **재귀**로 구현
2. **Bottom-up** : 작은 문제부터 차례대로 푼다. **반복문**으로 구현

### Top-down

- 큰 문제를 작은 문제로 나눈다.
- 작은 문제를 푼다.
- 작은 문제를 풀었으니, 이제 큰 문제를 푼다.

### Buttom-up

- 문제를 크기가 작은 문제부터 차례대로 푼다.
- 문제의 크기를 조금씩 크게 만들면서 문제를 점점 푼다.
- 작은 문제를 풀면서 왔기 때문에, 큰 문제는 항상 풀 수 있다.
- 반복하다 보면 가장 큰 문제를 풀 수 있다.