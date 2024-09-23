## Error Handling

**Use Exceptions Rather Than Return Codes**
**Write Your Try-Catch-Finally Statement First**
예외가 발생할 코드라면 TRY CATCH부터 준비해라
TDD(Test Driven Development)
**Use Unchecked Exceptions**
자바의 checked exception보다는 unchecked exception을 사용해라
**Provide Context with Exceptions**
정보가 있는 예외를 작성해라
**Define Exception Classes in Terms of a Caller’s Needs**
예외들을 분류할 때 중요한 것은 어떻게 그 에러가 caught됐냐다.
wrapping the API: 외부 라이브러리를 처리할 땐 클래스를 하나 만들어서 함수 하나로 예외 처리를 구현하자
**Define the Normal Flow**
try-catch에 집착하지는 말고 흐름을 더 중시하라
**Don’t Return or Pass Null**
