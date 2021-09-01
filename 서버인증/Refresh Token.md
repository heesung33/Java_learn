## Refresh Token

### Refresh Token 이란?

###### Refresh Token은 Access Token과 똑같은 형태의 JWT입니다. 처음에 로그인을 완료했을 때 Access Token과 동시에 발급되는 Refresh Token은 긴 유효기간을 가지면서, Access Token이 만료됐을 때 새로 발급해주는 열쇠가 됩니다(여기서 만료라는 개념은 그냥 유효기간을 지났다는 의미입니다.)

######  

#####  Access Token + Refresh Token 인증 과정

<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Ft1.daumcdn.net%2Fcfile%2Ftistory%2F99DB8C475B5CA1C936" width="1000px" />

1. 사용자가 ID , PW를 통해 로그인합니다.

 

2. 서버에서는 회원 DB에서 값을 비교합니다(보통 PW는 일반적으로 암호화해서 들어갑니다)

 

   3~4. 로그인이 완료되면 Access Token, Refresh Token을 발급합니다. 이때 일반적으로 회원DB에   	        Refresh Token을 저장해둡니다.

 

5. 사용자는 Refresh Token은 **안전한 저장소**에 저장 후, Access Token을 헤더에 실어 요청을 보냅니다.

 

   6~7. Access Token을 검증하여 이에 맞는 데이터를 보냅니다.

 

8. 시간이 지나 Access Token이 만료됐다고 보겠습니다.

 

9. 사용자는 이전과 동일하게 Access Token을 헤더에 실어 요청을 보냅니다.

 

 10~11. 서버는 Access Token이 만료됨을 확인하고 권한없음을 신호로 보냅니다.

12. 사용자는 Refresh Token과 Access Token을 함께 서버로 보냅니다.

 

13. 서버는 받은 Access Token이 조작되지 않았는지 확인한후, Refresh Token과 사용자의 DB에 저장되어 있던 Refresh Token을 비교합니다. Token이 동일하고 유효기간도 지나지 않았다면 새로운 Access Token을 발급해줍니다.

 

14. 서버는 새로운 Access Token을 헤더에 실어 다시 API 요청을 진행합니다. 