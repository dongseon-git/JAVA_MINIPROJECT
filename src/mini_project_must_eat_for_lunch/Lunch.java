package mini_project_must_eat_for_lunch;

import java.util.Random;
import java.util.Scanner;

public class Lunch {

	public static void main(String[] args) {

		int num = 0;

		System.out.println("원하는 음식의 장르를 고르세요.");// 콘솔 질문
		System.out.println("1.분식 2.양식 3.중식 4.한식 5.일식 ");// 콘솔 질문
		Scanner scanner = new Scanner(System.in); // 질문중에 원하는 장르의 음식을 입력받기 위해 스캐너 사용

		num = scanner.nextInt();
		System.out.println(num + "번을 고르셨습니다."); // 몇번을 골랐는지 출력
// 1번을 골랐을 때 나오는 출력값 코드
		if (num == 1) {
			System.out.println("오늘 수강생의 점심메뉴는 ");
//13개의 메뉴중 하나의 메뉴를 랜덤으로 출력하기 위한 코드
			Random random = new Random();
			int small = (int) (Math.random() * 13) + 1;
			if (small == 1) {
				System.out.println("빨간모자김밥의 참치김밥2줄입니다.");
				System.out.println("빨간모자김밥의 주소는 서울 마포구 서강로 142 서일빌딩 1층입니다.");

			} else if (small == 2) {
				System.out.println("빨간모자김밥의 곤드레김밥2줄입니다.");
				System.out.println("빨간모자김밥의 주소는 서울 마포구 서강로 142 서일빌딩 1층입니다.");

			} else if (small == 3) {
				System.out.println("빨간모자김밥의 계란김밥2줄입니다.");
				System.out.println("빨간모자김밥의 주소는 서울 마포구 서강로 142 서일빌딩 1층입니다.");

			} else if (small == 4) {
				System.out.println("빨간모자김밥의 (쌀)빨간떡볶이입니다.");
				System.out.println("빨간모자김밥의 주소는 서울 마포구 서강로 142 서일빌딩 1층입니다.");

			} else if (small == 5) {
				System.out.println("김밥천국의 치즈라면입니다.");
				System.out.println("김밥천국의 주소는 서울 마포구 백범로 8입니다.");

			} else if (small == 6) {
				System.out.println("김밥천국의 떡라면입니다.");
				System.out.println("김밥천국의 주소는 서울 마포구 백범로 8입니다.");

			} else if (small == 7) {
				System.out.println("김밥천국의 만두라면입니다.");
				System.out.println("김밥천국의 주소는 서울 마포구 백범로 8입니다.");

			} else if (small == 8) {
				System.out.println("김밥천국의 떡만두라면입니다.");
				System.out.println("김밥천국의 주소는 서울 마포구 백범로 8입니다.");

			} else if (small == 9) {
				System.out.println("김밥천국의 라볶이입니다.  ");
				System.out.println("김밥천국의 주소는 서울 마포구 백범로 8입니다.");

			} else if (small == 10) {
				System.out.println("김밥천국의 떡볶이입니다.  ");
				System.out.println("김밥천국의 주소는 서울 마포구 백범로 8입니다.");

			} else if (small == 11) {
				System.out.println("김밥천국의 치즈떡볶이입니다.  ");
				System.out.println("김밥천국의 주소는 서울 마포구 백범로 8입니다.");

			} else if (small == 12) {
				System.out.println("김밥천국의 치즈라볶이입니다.  ");
				System.out.println("김밥천국의 주소는 서울 마포구 백범로 8입니다.");

			} else {
				System.out.println("없습니다.");
				System.out.println("강의실로 돌아가 코딩공부나 더하세요. 밥먹을 자격이 없습니다.");
			}
			// 2번을 골랐을 때 나오는 출력값 코드
		} else if (num == 2) {
			System.out.println("오늘 수강생의 점심메뉴는 ");
			// 16개의 메뉴중 하나의 메뉴를 랜덤으로 출력하기 위한 코드
			Random random = new Random();
			int american = (int) (Math.random() * 16) + 1;
			if (american == 1) {
				System.out.println("버거리 프레쉬 버거 SET입니다.");
				System.out.println("버거리의 주소 서울 서대문구 신촌로 87-8 1층입니다.");

			} else if (american == 2) {
				System.out.println("버거리 클래식 치즈 버거 SET입니다.6900원입니다.");
				System.out.println("버거리의 주소는 서울 서대문구 신촌로 87-8 1층입니다.");
			} else if (american == 3) {
				System.out.println("버거리 클래식 치즈 버거 SET입니다.7900원입니다.");
				System.out.println("버거리의 주소는 서울 서대문구 신촌로 87-8 1층입니다.");
			} else if (american == 4) {
				System.out.println("버거리 쉬림프 버거 SET입니다.7900원입니다.");
				System.out.println("버거리의 주소는 서울 서대문구 신촌로 87-8 1층입니다.");
			} else if (american == 5) {
				System.out.println("버거리 버거 SET입니다.9300원입니다.");
				System.out.println("버거리의 주소는 서울 서대문구 신촌로 87-8 1층입니다.");
			} else if (american == 6) {
				System.out.println("버거리 하와이안 버거 SET입니다.9500원입니다.");
				System.out.println("버거리의 주소는 서울 서대문구 신촌로 87-8 1층입니다.");
			} else if (american == 7) {
				System.out.println("버거리 더블클래식 치즈버거 SET입니다. 금액은 9900원입니다.");
				System.out.println("버거리의 주소는 서울 서대문구 신촌로 87-8 1층입니다.");
			} else if (american == 8) {
				System.out.println("버거리 비프 앤 쉬림프버거 SET입니다. 금액은 9900원입니다.");
				System.out.println("버거리의 주소는 서울 서대문구 신촌로 87-8 1층입니다.");
			} else if (american == 9) {
				System.out.println("써브웨이 신촌로데오점 메뉴중 원하는 메뉴로 드세요.");
				System.out.println("써브웨이 신촌로데오점 주소는 서울 서대문구 연세로 23입니다.");
			} else if (american == 10) {
				System.out.println("KFC 징거박스 입니다.");
				System.out.println("KFC의 주소는 서울 서대문구 신촌로 79 입니다.");
			} else if (american == 11) {
				System.out.println("KFC 블랙라벨더블다운박스 입니다.");
				System.out.println("KFC의 주소는 서울 서대문구 신촌로 79 입니다.");
			} else if (american == 12) {
				System.out.println("KFC 블랙라벨풀인치즈박스 입니다.");
				System.out.println("KFC의 주소는 서울 서대문구 신촌로 79 입니다.");
			} else if (american == 13) {
				System.out.println("KFC 핫통삼겹베이컨박스 입니다.");
				System.out.println("KFC의 주소는 서울 서대문구 신촌로 79 입니다.");
			} else if (american == 14) {
				System.out.println("KFC 타워박스 입니다.");
				System.out.println("KFC의 주소는 서울 서대문구 신촌로 79 입니다.");
			} else if (american == 15) {
				System.out.println("KFC 켄터키치킨업그레이비버거 입니다.");
				System.out.println("KFC의 주소는 서울 서대문구 신촌로 79 입니다.");
			} else {
				System.out.println("없습니다.");
				System.out.println("강의실로 돌아가 코딩공부나 더하세요. 밥먹을 자격이 없습니다.");
			}

			// 3번을 골랐을 때 나오는 출력값 코드
		} else if (num == 3) {

			System.out.println("오늘 수강생의 점심메뉴는 ");
			// 11개의 메뉴중 하나의 메뉴를 랜덤으로 출력하기 위한 코드
			Random random = new Random();
			int china = (int) (Math.random() * 11) + 1;

			if (china == 1) {
				System.out.println("일일향의 짜장면 입니다.");
				System.out.println("일일향의 주소는 서울 마포구 신촌로 92 지하1층입니다.");

			} else if (china == 2) {
				System.out.println("일일향 삼선간짜장 입니다.");
				System.out.println("일일향의 주소는 서울 마포구 신촌로 92 지하1층입니다.");
			} else if (china == 3) {
				System.out.println("일일향 갑오징어쟁반짜장 입니다.");
				System.out.println("일일향의 주소는 서울 마포구 신촌로 92 지하1층입니다.");
			} else if (china == 4) {
				System.out.println("일일향 옛날짬뽕 입니다.");
				System.out.println("일일향의 주소는 서울 마포구 신촌로 92 지하1층입니다.");
			} else if (china == 5) {
				System.out.println("일일향 하얀짬뽕 입니다.");
				System.out.println("일일향의 주소는 서울 마포구 신촌로 92 지하1층입니다.");
			} else if (china == 6) {
				System.out.println("일일향 삼선짬뽕밥 입니다.");
				System.out.println("일일향의 주소는 서울 마포구 신촌로 92 지하1층입니다.");
			} else if (china == 7) {
				System.out.println("일일향 옛날볶음밥 입니다.");
				System.out.println("일일향의 주소는 서울 마포구 신촌로 92 지하1층입니다.");
			} else if (china == 8) {
				System.out.println("일일향 잡채볶음밥 입니다.");
				System.out.println("일일향의 주소는 서울 마포구 신촌로 92 지하1층입니다.");
			} else if (china == 9) {
				System.out.println("일일향 마파두부밥 입니다.");
				System.out.println("일일향의 주소는 서울 마포구 신촌로 92 지하1층입니다.");
			} else if (china == 10) {
				System.out.println("일일향 해물잡탕밥 입니다.");
				System.out.println("일일향의 주소는 서울 마포구 신촌로 92 지하1층입니다.");
			} else {
				System.out.println("없습니다.");
				System.out.println("강의실로 돌아가 코딩공부나 더하세요. 밥먹을 자격이 없습니다.");
			}

			// 4번을 골랐을 때 나오는 출력값 코드
		} else if (num == 4) {
			System.out.println("오늘 수강생의 점심메뉴는 ");
			// 6개의 메뉴중 하나의 메뉴를 랜덤으로 출력하기 위한 코드
			Random random = new Random();
			int korea = (int) (Math.random() * 6) + 1;

			if (korea == 1) {
				System.out.println("신촌수제비의 수제비 입니다.");
				System.out.println("신촌수제비의 주소는 서울 서대문구 신촌로 87-8 금은동빌딩입니다.");
			} else if (korea == 2) {
				System.out.println("담산 신촌본점의 양푼등갈비찜입니다.");
				System.out.println("담산 신촌본점의 주소는 서울 서대문구 연세로5다길 5 1층 담산 신촌본점입니다.");
			} else if (korea == 3) {
				System.out.println("쭈꾸미블루스 신촌본점의 신촌쭈꾸미 1인분 입니다.");
				System.out.println("쭈꾸미블루스 신촌본점의 주소는 서울 마포구 백범로1길 21입니다.");
			} else if (korea == 4) {
				System.out.println("쭈꾸미블루스 신촌본점의 쭈삼1인+홍합탕 입니다.");
				System.out.println("쭈꾸미블루스 신촌본점의 주소는 서울 마포구 백범로1길 21입니다.");
			} else if (korea == 5) {
				System.out.println("쭈꾸미블루스 신촌본점의 점심쭈삼 입니다.");
				System.out.println("쭈꾸미블루스 신촌본점의 주소는 서울 마포구 백범로1길 21입니다.");
			} else {
				System.out.println("없습니다.");
				System.out.println("강의실로 돌아가 코딩공부나 더하세요. 밥먹을 자격이 없습니다.");
			}

			// 5번을 골랐을 때 나오는 출력값 코드
		} else if(num == 5) {
			System.out.println("오늘 수강생의 점심메뉴는 ");
			// 16개의 메뉴중 하나의 메뉴를 랜덤으로 출력하기 위한 코드
			Random random = new Random();
			int japan = (int) (Math.random() * 16) + 1;

			if (japan == 1) {
				System.out.println("히노키공방의 가츠나베정식입니다.");
				System.out.println("히노키공방의 주소는 서울 마포구 신촌로14안길 3입니다.");

			} else if (japan == 2) {
				System.out.println("히노키공방의 가츠나베정식입니다.");
				System.out.println("히노키공방의 주소는 서울 마포구 신촌로14안길 3입니다.");
			} else if (japan == 3) {
				System.out.println("히노키공방의 김치 가츠 나베 정식입니다.");
				System.out.println("히노키공방의 주소는 서울 마포구 신촌로14안길 3입니다.");
			} else if (japan == 4) {
				System.out.println("히노키공방의 아사히 새우 텐동입니다.");
				System.out.println("히노키공방의 주소는 서울 마포구 신촌로14안길 3입니다.");
			} else if (japan == 5) {
				System.out.println("히노키공방의 규 야사이 무시야끼 정식입니다.");
				System.out.println("히노키공방의 주소는 서울 마포구 신촌로14안길 3입니다.");
			} else if (japan == 6) {
				System.out.println("히노키공방의 하야시 니코미 정식입니다.");
				System.out.println("히노키공방의 주소는 서울 마포구 신촌로14안길 3입니다.");
			} else if (japan == 7) {
				System.out.println("히노키공방의 고등어미소조림정식입니다.");
				System.out.println("히노키공방의 주소는 서울 마포구 신촌로14안길 3입니다.");
			} else if (japan == 8) {
				System.out.println("히노키공방의 쇼가나베 정식입니다.");
				System.out.println("히노키공방의 주소는 서울 마포구 신촌로14안길 3입니다.");
			} else if (japan == 9) {
				System.out.println("히노키공방의 새우 텐푸라 나베 정식입니다.");
				System.out.println("히노키공방의 주소는 서울 마포구 신촌로14안길 3입니다.");
			} else if (japan == 10) {
				System.out.println("히노키공방의 아나고 텐동입니다.");
				System.out.println("히노키공방의 주소는 서울 마포구 신촌로14안길 3입니다.");
			} else if (japan == 11) {
				System.out.println("히노키공방의 돼지고기 조림정식(카쿠니정식)입니다.");
				System.out.println("히노키공방의 주소는 서울 마포구 신촌로14안길 3입니다.");
			} else if (japan == 12) {
				System.out.println("히노키공방의 생선구이 정식입니다.");
				System.out.println("히노키공방의 주소는 서울 마포구 신촌로14안길 3입니다.");
			} else if (japan == 13) {
				System.out.println("히노키공방의 모츠니코미(돼지곱창조림)입니다.");
				System.out.println("히노키공방의 주소는 서울 마포구 신촌로14안길 3입니다.");
			} else if (japan == 14) {
				System.out.println("정육면체의 홍탄1인분과 초유린기1인분 입니다.");
				System.out.println("정육면체의 주소는 서울 서대문구 연세로5다길 22-8 1층 정육면체 입니다.");
			} else if (japan == 15) {
				System.out.println("돈우마미의 김치치즈가츠동 입니다.");
				System.out.println("돈우마미의 주소는 서울 서대문구 연세로5길 38 입니다.");
			} else {
				System.out.println("없습니다.");
				System.out.println("강의실로 돌아가 코딩공부나 더하세요. 밥먹을 자격이 없습니다.");
			}

		}else {
			System.out.println("입력을 제대로 하세요");
		}
		System.out.println("오늘 남은 수강시간도 화이팅입니다.");
	}
}
