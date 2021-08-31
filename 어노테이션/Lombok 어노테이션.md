## @NoArgsConstructor

### `@NoArgsConstructor` 어노테이션은 파라미터가 없는 기본 생성자를 생성해줍니다.





## @RequiredArgsConstructor

### `@RequiredArgsConstructor` 어노테이션은 `final`이나 `@NonNull`인 필드 값만 파라미터로 받는 생성자를 만들어줍니다.





## @AllArgsConstructor

### `@AllArgsConstructor` 어노테이션은 모든 필드 값을 파라미터로 받는 생성자를 만들어줍니다. 



## ex 

```java
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class User {
  private Long id;
  @NonNull
  private String username;
  @NonNull
  private String password;
  private int[] scores;
}
```



