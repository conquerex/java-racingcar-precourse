# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 😍 Constraint Check List
* [ ] 요구사항 1
    * [ ] 시작점 main()
    * [x] JDK 8 (모듈, 프로젝트 모두 jdk 8)
    * [ ] camp.nextstep.edu.missionutils
    * [ ] 2개의 테스트 케이스
* [ ] 요구사항 2
    * [ ] 자바 코드 컨벤션
    * [ ] Indent depth == 1
    * [ ] Stream api는 사용하지 않는다. Lambda는 가능.
    * [ ] else 사용 금지
    * [ ] 함수 라인 길이 <= 10
    * [ ] 일급콜렉션을 활용
    * [ ] 모든 원시값과 문자열을 포장
* [ ] 요구사항 3
    * [ ] 도메인 로직에 단위테스트를 구현
    * [ ] Junit 학습하기
* [ ] 과제진행 요구사항
    * [x] folk/clone으로 시작
    * [x] 기능구현 전 Readme.md에 정리
    * [ ] commit 단위는 의미있는 단위로
    * [ ] 프리코스 과제 제출 문서
* [ ] 기타
    * [ ] MVC 구조
    * [ ] Validate Code 추가

## 🍔 Feature
* [ ] 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
* [ ] 각 자동차에 이름을 부여할 수 있다.
* [ ] 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
* [ ] 자동차 이름은 쉼표(,)를 기준으로 구분하며 
* [x] 이름은 5자 이하만 가능하다.
* [ ] 사용자는 몇번의 이동을 할 것인지를 입력할 수 있어야 한다.
* [ ] 전진하는 조건은 0에서 9 사이에서 random값을 구한다.
* [x] random값이 4이상일 경우 전진하고, 3이하의 값이면 멈춘다.
* [ ] 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다.
* [ ] 우승자가 한명 이상일 경우, 쉼표(,)로 이름을 구분해 출력한다.
* [ ] 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException를 발생시키고,
  "[ERROR]"로 시작하는 에러메시지를 출력 후 그부분부터 입력을 다시 받는다.
* [ ] Exception이 아닌 IllegalArgumentException, IllegalStateException등과 같은 
  명확한 유형을 처리한다.

## ⚾️ Example
```
경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)
pobi,crong,honux
시도할 회수는 몇회인가요?
5

실행 결과

pobi : -
crong : 
honux : -

pobi : --
crong : -
honux : --

pobi : ---
crong : --
honux : ---

pobi : ----
crong : ---
honux : ----

pobi : -----
crong : ----
honux : -----

최종 우승자: pobi,honux
```

## 🐯 Task
* **branch : step0/constraint**
  * 제약사항 중 일부를 확인
  * Random 및 Scanner API 대신 사용할 라이브러리
    * camp.nextstep.edu.missionutils에서 제공하는 Randoms 및 Console API
  * 자바 코드 컨벤션
  * Readme.md 작성
* **branch : step1/model**
  * car, race 모델 생성
  * 생성에 제약이 걸리는 validate code
