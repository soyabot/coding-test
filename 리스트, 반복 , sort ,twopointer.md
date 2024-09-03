-contiuous 
-4byte 
int arr[5[] ={3,7,4,2,6}

3,7,4,2,6 
arr[1] => 4byte => 7 

random access 주소값을 알아야함 
배열변수는 첫번째 주소값을 가리킨다

-array 1번연산만 가능
linked list 는 n번의 연산
1.고정된 저장공간
2.연속 순차적

static array 
데이터의 갯수가 정해져 있는경우는 
static array를 사용하는 것이 효율적

size가 5개인 배열을 선언
7개를 넣으면 메모리 비효율... 

이러한 문제점을 해결 
dynamic array

-정적배열은 고정된 저장공간을 한계로 봄
동적배열 : 배열을 다시할당을 함으로서 정의를 할 수 있다

dynamic array 할당된 메모리가 가득참
하나하나 옮겨야되기때문에 O(n)이 된다

resize는 기존의 배열보다 두배더큰 배열을할당을 한다

선언시에 배열의 크기를 정하지 않아도 되기 때문에 코딩테스트에서 dynamic array를 자주사용하게 됩니다 

array list를 dynamic array로 구현하는것은
시간복잡도는

```python
a=[1,2,3]
a[0]
a[1]=9
a.append(4)
a.append(5)
a.append(6)
a.pop()
a.pop()
a.insert(1,10)
a.pop(2)
```

delete back O(1)

list<-> set 
- array lis = array, dynamic array
- Linked list = Node

arraylist - 연산 시간복잡도 
-array 
-dynamic array
linked list - node

(static)array
1.고정된 저장공간
2.순차적

배열은 선언시 size를 정화여 연속된 메모리를 할당 data를 연속적. 순차적으로 저장
array 선언 in c언어

int arr [5] = {3,7,4,2,6}
= 배열에 데이터를 연속적으로 순차적으로 저장

arr[0] 0x 4af57
arr[1] 

random access
- 메모리에 저장된 데이터에 접근하려면 주소값을 알아야함 배열변수는 자신이 할당받은 메모리의 첫 번째 주소를 가리킨다.
1. 고정된 저장공간
2. 연속 순차적


고정된 저장공간
dynamic array 동적배열

선언이후에 size를 변경할 수 없는 정적배열과 다르게 동적배열(dynamic array는)size를 늘릴수 있습니다

dynamic array = array로 구성 - 동적배열

기존에있던 배열보다 더 큰배열을 할당

더블링 = resize

dynamic array 선언시에 배열의 크기를 정하지 않아도됨 list를 선언하여 사용 

array list = static array / dynamic array

dynamic array(list)
```python
a=[1,2,3]
a[0]
a[1] =9
a.append(4)
a.append(5)
a.append(6)
a.pop()
a.pop()
a.insert(1,10)
a.pop(2)
```

배열의 다양한 활용
1. 반복문
two sum
정수가 저장된배열 nums nums의 운소중 두숫자를 더해 target이
2. sort & two pointer

## 반복문 - 예제 

1.반복문
2.sort & two pointer

list 순서가 있는 

step1 문제이해하기
정수가 저장된 배열 nums의 원소중 두 숫자를 더해서 target이 될 수 있으면 true 불가능하면 false를 반환하세요

제약조건
nums.length = n 
O(n)제곱으로 풀 수 있지만 
작은 시간복잡도도 가능하다
int형 변수 크기

step2 접근방법
1.직관적으로 생각하기
	- 보통 완전탐색으로 시작
	- 문제 상황을 단순화 하여 생각
	- 문제 상황을 극한화 하여 생각

2.자료구조와 알고리즘 활용
- 문제이해에서 파악한 내용을 토대로 자료구조를 사용하는게 적합한지
3.메모리 사용
	- 시간 복잡도를 줄이기 위해 메모리를 사용하는 방법
	- 대표적으로 해시테이블 


Q 
input : nums = {4,1,9,7,5,3,16} target : 14
output = true
nums[i] +  nums[j] =14?
		return ture
	return false
	
Q 
input : nums={2,1,5,7} target :4
output : false




->


```python 
def twosun(nums, target):
	n = len(nums)
	for i in range(n):
		for j in range(i+1, n):
			 if nums[i] + nums[;] ==target:
			 reture True
	return Flase

```


