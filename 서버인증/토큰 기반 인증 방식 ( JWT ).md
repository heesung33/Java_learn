## 토큰 기반 인증 방식 ( JWT )

<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Ft1.daumcdn.net%2Fcfile%2Ftistory%2F995EC2345B53368912" width="1000px" />

1. 사용자가 로그인을 한다.

2. 서버에서는 계정정보를 읽어 사용자를 확인 후, 사용자의 고유한 ID값을 부여한 후, 기타 정보와 함께 Payload에 넣습니다.

3. JWT 토큰의 유효기간을 설정합니다.

4. 암호화할 SECRET KEY를 이용해 ACCESS TOKEN을 발급합니다.

5. 사용자는 Access Token을 받아 저장한 후, 인증이 필요한 요청마다 토큰을 헤더에 실어 보냅니다.

6. 서버에서는 해당 토큰의 Verify Signature를 SECRET KEY로 복호화한 후, 조작 여부, 유효기간을 인합니다.

7. 검증이 완료된다면, Payload를 디코딩하여 사용자의 ID에 맞는 데이터를 가져옵니다. 

