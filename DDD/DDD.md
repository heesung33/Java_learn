# DDD(Domain Driven Design)



### 정의

- DDD(Domain Driven Design) 또는 도메인 설계라고 부른다. 도메인 패턴을 중심에 놓고 설계하는 방식을 일컫는다.

### 특징

- 도메인 그 자체와 도메인 로직에 초점을 맞춘다. 일반적으로 많이 사용하는 데이터 중심의 접근법을 탈피해서 순수한 도메인의 모델과 로직에 집중한다.
- **_보편적(ubiquitous)_**언어의 사용이다. 도메인 전문가와 소프트웨어 개발자 간의 커뮤니케이션 문제를 없애고 상호가 이해할 수 있고 모든 문서와 코드에 이르기까지 동일한 표현과 단어로 구성된 단일화된 언어체계를 구축해나가는 과정을 말한다. 통일된 방식으로 커뮤니케이션이 가능해진다.
- **_소프트웨어 엔티티와 도메인 컨셉트를 가능한 가장 가까이 일치 시키는 것이다._** 분석 모델과 설계가 다르고 그것과 코드가 다른 구조가 아니라 도메인 모델부터 코드까지 항상 함께 움직이는 구조의 모델을 지향하는 것이 DDD의 핵심원리이다.

### 데이터 주도 설계란?

- 데이터 주도 설계란 객체가 가져야 할 데이터에 초점을 두고 설계를 하는 방식을 일컫는다.
- 설계 시 협력에 고민을 하지 않았기 때문에 **_과도한 접근자와 수정자_**가 탄생하게 된다.
- 결과 적으로 데이터 중심 설계는 외부에 대부분의 구현이 노출되기 때문에 캡슐화의 원칙을 위반하게 된다.
- 내부 구현이 **_퍼블릭 인터페이스_**에 노출 되며 이 때문에 다른 객체들과 강하게 결합되게 된다. 이로 인해 객체의 내부 구현이 변경될 때 이 인터페이스에 의존하는 모든 객체들이 함께 변경되므로 높은 결합도를 유지하게 된다.

### 왜 도메인 주도 설계를 해야하는가?

- 도메인 모델의 적용 범위를 구현까지 확장하여 도메인 지식을 구현 코드에 반영
- 공통의 언어(유비쿼터스 언어)를 사용하여 도메인과 구현을 충분히 만족하는 모델을 만든다.
- 실제 코드로 구현 가능한 현실성있는 도메인 모델 분석과 그것을 추상화하는 설계

### 유비쿼터스언어란

- 도메인에서 사용하는 용어로 코드에 반영하지 않으면 그 코드는 개발자에게 코드의 의미를 해야 하는 부담을 준다. 코드의 가독성을 높여서 코드를 분석하고 이해하는 시간을 절약, 용어가 정의 될 때 마다 용어 사전에 이를 기록하고 명확하게 정의 함으로써 추후 또는 다른 사람들도 공통된 언어를 사용할 수 있도록 한다.
