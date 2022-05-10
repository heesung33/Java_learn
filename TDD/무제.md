# TDD

TDD란 TestDrivenDevelopment의 약자로 "테스트 주도 개발"이라고 한다. 작은 단위에 테스트 케이스를 작성하고 이를 통과하는 코드를 추가하는 단계를 반복하여 구현한다.

![img](https://blog.kakaocdn.net/dn/mG0Pb/btqBZMj04hL/iFrPHyeudxXYfxkWANylY0/img.png)

## TDD 개발주기

- 위의 그림은 TDD개발주기를 표현한 것이다.

  <RED> 단계에서는 실패하는 테스트 코드를 먼저 작성한다.

  <GREEN>단계에서는 테스트코드를 성공시키기 위한 실제 코드를 작성한다.

  <YELLOW>단계에서는 중복 코드 제거, 일반화 등의 리팩토링을 수행한다.

중요한 것은 실패하는 테스트코드를 작성할 때까지 실제 코드를 작성하지 않는 것과, 실패하는 테스트를 통과할 정도의 최소 실제 코드를 작성해야 하는 것이다. 이를 통해, 불필요한 설계를 피할 수 있고, 정확한 요구 사항에 집중할 수 있다.



## 일반 개발 방식과 TDD 개발 방식의 비교

![img](https://blog.kakaocdn.net/dn/cXoUol/btqBWrI2z2l/ezsoBHstfTXgZfzGKQzOwK/img.png)

![img](https://blog.kakaocdn.net/dn/n7tzF/btqBYtFtylr/PNz12MTxKTiEblbhdCCDKK/img.png)



## TDD 개발 방식의 장점

- 보다 튼튼한 객체 지향적인 코드 생산
- 재설계 시간의 단축
- 디버깅 시간의 단축
- 테스트 문서의 대체 가능
- 추가 구현의 용이함



## TDD 개발 방식의 단점

- 생산성의 저하

  