# Unit Test
## The Three Laws of TDD
1. You may not write production code until you have written a failing unit test.  
2. You may not write more of a unit test than is sufficient to fail, and not compiling is failing.  
3. You may not write more production code than is sufficient to pass the currently failing test.  
   **unit test -> production code이며 필요 이상의 unit test를 적지 말고 unit test를 넘어서는 production code를 적지 말지어다**  

## Clean Test  
**가독성**  
**One Assert per Test**  
## F.I.R.S.T**  
**Fast** 빨라야 많이 돌리지  
**Independent** 뭐 때문에 문제인지 모르게 되잖아  
**Repeatable** 왜 틀린지 모르게 되잖아  
**Self-Validating** pass or fail 명확하게  
**Timely** 프로덕션 코드보다 테스트 코드를 먼저 써야 한다고  

# Classes

encapsulation 덕분에 class가 좋다!  

## Good Class

**Small Class**  
**The Single Responsibility Principle (SRP)**: Only one changes(responsibility)  
**Cohesion**: small number of instance variables  

