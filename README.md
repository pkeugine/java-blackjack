# java-blackjack
블랙잭 게임 미션 저장소

## 기능 요구사항
- [x] 카드 52장을 생성한다.
- [x] 이름을 입력받는다.
    - [x] [예외] 이름은 최소 1개 이상
    - [x] [예외] 이름의 빈 칸은 불가능
    - [x] [예외] 이름은 콤마로 구분된다.
- [x] 플레이어 각각의 베팅 금액을 입력한다
    - [x] [예외] 금액은 숫자여야 한다.
    - [ ] [예외] 금액은 음수가 되면 안된다.
- [x] 카드를 섞는다.
- [x] 플레이어에게 카드 두 장을 나눠준다.
- [x] 딜러에게 카드 두 장을 준다.
- [x] 플레이어의 카드 두 장을 출력한다.
- [x] 딜러의 카드 한 장을 출력한다.
- [x] 플레이어마다 추가 카드 여부를 묻는다.
    - [x] [예외] y/n만 입력가능하다. (대문자 가능)
    - [x] y인 경우 한 장 준다.
- [x] 딜러의 카드 합이 16 이하이면 카드 한장을 추가한다.
- [x] 플레이어, 딜러의 결과를 계산한다.
    - [x] A를 11로 계산한다.
    - [x] A가 1일 때를 고려한다.
- [x] 플레이어 각각 딜러와 결과를 비교한다.
- [x] 게임의 결과를 출력한다.
    - [x] 모든 참여자의 카드를 출력한다.
    - [x] 모든 참여자의 카드와 결과 포인트를 함께 출력한다.
    - [x] 승패 여부를 출력한다.
- [x] 딜러의 손익을 출력한다.
- [x] 플레이어들의 손익을 출력한다.

# java-rent
상속, interface - 연료 주입

## 요구사항
현재 보유하고 있는 차량은 Sonata 2대, Avante 1대, K5 2대로 총 5대의 차량을 보유하고 있다. 
고객이 인터넷으로부터 예약할 때 여행할 목적지의 대략적인 이동거리를 입력 받는다. 
이 이동거리를 활용해 차량 별로 필요한 연료를 주입한다. 
차량 별로 주입해야 할 연료량을 확인할 수 있는 보고서를 생성해야 한다.

각 차량별 연비는 다음과 같다.

* Sonata : 10km/리터
* Avante : 15km/리터
* K5 : 13km/리터

## 기능 요구사항
