## 변수

### let

변수 선언

```javascript
let name
name = 'monkey'
```

### const

상수 선언

```javascript
const onShowModal = () => {
	....  
}
```



### 화살표 함수

```jsx
const add = (a, b) => {
	return a + b;
};
console.log(add(1, 2)); //3
```

```jsx
onst add = (a, b) => a + b;
```



### 함수에서 객체를 파라미터로 받기

```jsx
// 자바스크립트에서는 카멜케이스 표기법을 사용한다.
const ironMan = {
  name: '토니 스타크',
  actor: '로버트 다우니 주니어',
  alias: '아이언맨'
};

const captainAmerica = {
  name: '스티븐 로저스',
  actor: '크리스 에반스',
  alias: '캡틴 아메리카'
};

function print(hero) {
  const text = `${hero.alias}(${hero.name}) 역할을 맡은 배우는 ${
    hero.actor
  } 입니다.`; // 템플릿 리터럴 방식을 사용해서 문자열로 출력
  console.log(text);
}

print(ironMan);
//아이언맨(토니 스타크) 역할을 맡은 배우는 로버트 다우니 주니어 입니다.
print(captainAmerica);
//캡틴 아메리카(스티븐 로저스) 역할을 맡은 배우는 크리스 에반스 입니다.
```



### 객체 비구조화 할당

```jsx
const ironMan = {
  name: '토니 스타크',
  actor: '로버트 다우니 주니어',
  alias: '아이언맨'
};

const captainAmerica = {
  name: '스티븐 로저스',
  actor: '크리스 에반스',
  alias: '캡틴 아메리카'
};

function print(hero) {   // 이는 객체 구조 분해라고 부른다.
  const { alias, name, actor } = hero;
	//이 코드가 객체에서 값들을 추출해서 새로운 상수로 선언해 주는 것 입니다.
  const text = `${alias}(${name}) 역할을 맡은 배우는 ${actor} 입니다.`;
  console.log(text);
}

print(ironMan);
print(captainAmerica);
```

