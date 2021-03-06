package com.jhlee.hardshop.store;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import com.jhlee.hardshop.utility.*;


/**
 * 이 프로그램은 <strong>하드디스크</strong>의 전문 판매 쇼핑몰을 구현한다.
 * 이 프로그램의 깃허브 저장소는 다음과 같다.
 * 
 * @see <a href="git@github.com:LEE-JONGHWAN/Hard_hom.git">Hard_hom,하드샵 메인</a>
 * @see <a href="git@github.com:LEE-JONGHWAN/Hard_module.git">Hard_module,하드샵 모듈</a>
 * @see <a href="git@github.com:LEE-JONGHWAN/webstore_jh.git">웹페이지</a>
 * 
 * @author 이종환(Lee JongHwan)
 * @version 1.0.0
 *
 */

public class JH_Hardshop {
	
	/**
	 * stringbuilder ==> stringbuffer로
	 */
	
	public static void main(String[] args) {
//		var brnam = BrandName.삼성전자;
		System.out.println("====================");
		System.out.println("JH 하드샵에 환영합니다");
		System.out.println("==================== \n\n");
		var brandNames = BrandName.values();
		boolean run = true; // 무한 루프 돌릴 때 사용한다.
		
		/**
		 * 나중에 Enum to List 사용하여 깔끔하게 정리
		 */

//삼성전자,SK하이닉스,WD,마이크론,씨게이트, 웨스턴디지털, 샌디스크, 크루셜 리스트 업 (switch문에서 "없이 문자열 입력 가능하게 됨.
		System.out.println("===================================================================");
		String menu = String.join("/","[ ",
				BrandName.삼성전자.toString() + (BrandName.삼성전자.ordinal() + 1),
				BrandName.SK하이닉스.toString() + (BrandName.SK하이닉스.ordinal() + 1),
				BrandName.WD.toString() + (BrandName.WD.ordinal() + 1),
				BrandName.마이크론.toString() + (BrandName.마이크론.ordinal() + 1) +"/\n",
				BrandName.씨게이트.toString() + (BrandName.씨게이트.ordinal() + 1),
				BrandName.웨스턴디지털.toString() + (BrandName.웨스턴디지털.ordinal() + 1),
				BrandName.샌디스크.toString() + (BrandName.샌디스크.ordinal() + 1),
				BrandName.크루셜.toString() + (BrandName.크루셜.ordinal() + 1)," ]");
		
		System.out.println(menu);
		int idx = LocalDate.now().getDayOfYear() % brandNames.length;
		
		String weekDay = LocalDateTime.now().format(DateTimeFormatter.ofPattern("E")  // E => Weekday
		.withLocale(Locale.KOREAN));
		System.out.println("===================================================================");
		System.out.println(weekDay + "요일 특가 세일 : "
					+ "##" + brandNames[idx]  + "##" + "\n");

		while(run) {
		System.out.println("1.삼성전자|2.SK하이닉스|3.WD|4.마이크론|5.씨게이트"
						 + "|6.웨스턴디지털|7.샌디스크|8.크루셜|9.선택종료");
		System.out.println("원하는 브랜드를 입력: ");
		
		Scanner s = new Scanner(System.in);
		int 제품번호 = s.nextInt();
			switch (제품번호){
			case 1 : System.out.println("삼성전자를 선택하셨습니다.\n");
			break;
			case 2 : System.out.println("SK하이닉스를 선택하셨습니다.\n");
			break;
			case 3 : System.out.println("WD를 선택하셨습니다.\n");
			break;
			case 4 : System.out.println("마이크론을 선택하셨습니다.\n");
			break;
			case 5 : System.out.println("씨게이트를 선택하셨습니다.\n");
			break;
			case 6 : System.out.println("웨스턴디지털을 선택하셨습니다.\n");
			break;
			case 7 : System.out.println("샌디스크를 선택하셨습니다.\n");
			break;
			case 8 : System.out.println("크루셜를 선택하셨습니다.\n");
			break;
			default: 
			run = false; // 무한 루프에서 작업에서 빠져나온다.
			break; }	
			
			if(run == true) {
			Scanner scanner = new Scanner(System.in);
			Size[] values = Size.values();
			System.out.println("=====================");
			for(Size si: values) { System.out.println(si + "(" + 
								   si.getAbbreviation() + ")"); }
			System.out.println("=====================");
			System.out.println("하드의 용량을 선택해 주세요.");
			System.out.println("선택은: ");
			String input = scanner.nextLine();
			input = input.trim().toUpperCase();
			Size size = null;
			
			switch(input) {
			case "SMALL" : 
			case "250" : 
				size = Size.SMALL;
				System.out.println("250GB를 선택하셨습니다.");
				break;
			case "MEDIUM" :
			case "500" :
				size = Size.MEDIUM;
				System.out.println("500GB를 선택하셨습니다.");
				break;
			case "LARGE" :
			case "1" :
				size = Size.LARGE;
				System.out.println("1TB를 선택하셨습니다.");
				break;
			default : 
				System.out.println("대상품목을 잘못 입력하셨습니다.");
				System.out.println("다시 입력해 주세요.");
				run = false; // 무한 루프에서 작업에서 빠져나온다.
				break; 	
			}	
			switch (size) {
			case SMALL :
				size = Size.SMALL;
				System.out.println("\n대상품목을 출력합니다");
				run = false; // 무한 루프에서 작업에서 빠져나온다.
				break;
			case MEDIUM :
				size = Size.MEDIUM;
				System.out.println("\n대상품목을 출력합니다");
				run = false; // 무한 루프에서 작업에서 빠져나온다.
				break;
			case LARGE :
				size = Size.LARGE;
				System.out.println("\n대상품목을 출력합니다");
				run = false; // 무한 루프에서 작업에서 빠져나온다.
				break;
				}
			} else {
				System.out.println("\n시스템을 종료합니다.");
			}
		}
	}
}
