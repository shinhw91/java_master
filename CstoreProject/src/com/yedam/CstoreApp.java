package com.yedam;

import java.util.Scanner;

public class CstoreApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		AccountDAO aDao = new AccountDAO();
		ProductDAO pDao = new ProductDAO();
		
		// 메인메뉴
		while(run) {
			System.out.println("1.로그인 2.계정관리 3.종료");
			int menu = Integer.parseInt(sc.nextLine());
			boolean exist = false;
			
			switch(menu) {
			// 메인메뉴 - 1.로그인
			case 1 :
				System.out.print("1) 사원코드 입력 : ");
				String accountCode = sc.nextLine();
				System.out.print("2) 비밀번호 입력 : ");
				String accountPw = sc.nextLine();
				
				if(aDao.login(accountCode, accountPw)) {
					System.out.println("로그인되었습니다.");
					exist = true;
					
				} else {
					System.out.println("로그인에 실패하였습니다.");
					continue;
				}
				
				if(exist) {
					System.out.println("1.상품관리 2.상품입고 3.상품판매 4.내역관리 5.재고관리");
					int subMenu = Integer.parseInt(sc.nextLine());
					
					switch(subMenu) {
						// 메인메뉴 - 1.로그인 - 1.상품관리
						case 1 :
							System.out.println("1.상품등록 2.상품수정 3.상품조회 4.상품삭제 5.상품목록");
							int subMenu1 = Integer.parseInt(sc.nextLine());
							
							switch(subMenu1) {
							// 메인메뉴 - 1.로그인 - 1.상품관리 - 1.상품등록
							case 1 :
								System.out.print("1) 상품코드 입력 : ");
								String productCode = sc.nextLine();
								System.out.print("2) 상품명 입력 : ");
								String productName = sc.nextLine();
								System.out.print("3) 가격 입력 : ");
								int productPrice = Integer.parseInt(sc.nextLine());
								
								if(pDao.addProduct(productCode, productName, productPrice)) {
									System.out.println("상품이 등록되었습니다.");
								} else {
									System.out.println("상품 등록을 실패하였습니다.");
								}
								continue;
							
							// 메인메뉴 - 1.로그인 - 1.상품관리 - 2.상품수정
							case 2 :
								System.out.print("1) 상품코드 입력 : ");
								productCode = sc.nextLine();
								System.out.print("2) 가격 입력 : ");
								productPrice = Integer.parseInt(sc.nextLine());
								
								if(pDao.modifyProduct(productCode, productPrice)) {
									System.out.println("상품이 수정되었습니다.");
								} else {
									System.out.println("상품 수정을 실패하였습니다.");
								}
								continue;
								
							// 메인메뉴 - 1.로그인 - 1.상품관리 - 3.상품조회
							case 3 :
								System.out.print("1) 상품코드 입력 : ");
								productCode = sc.nextLine();
								
								System.out.printf("%-15s %-15s %-15s %-15s %-15s\n", "상품코드", "상품명", "가격", "마지막 입고일", "수량");
								Product product = pDao.getProduct(productCode);
								if(product != null) {
									product.showInfo();
								} else {
									System.out.println("존재하지 않는 정보입니다.");
								}
								continue;
								
							// 메인메뉴 - 1.로그인 - 1.상품관리 - 4.상품삭제
							case 4 :
								System.out.println("1) 상품코드 입력 : ");
								productCode = sc.nextLine();
								
								if(pDao.removeProduct(productCode)) {
									System.out.println("상품이 삭제되었습니다.");
								} else {
									System.out.println("상품 삭제를 실패하였습니다.");
								}
								continue;
								
							// 메인메뉴 - 1.로그인 - 1.상품관리 - 5.상품목록
							case 5 :
								System.out.printf("%-15s %-15s %-15s %-15s %-15s\n", "상품코드", "상품명", "가격", "마지막 입고일", "수량");
								for(Product list : pDao.productList()) {
									list.showInfo();
								}
								continue;
								
							}
						
						// 메인메뉴 - 1.로그인 - 2.상품입고
						case 2 :
							System.out.print("1) 상품코드 입력 : ");
							String productCode = sc.nextLine();
							System.out.print("2) 상품명 입력 : ");
							String productName = sc.nextLine();
							System.out.print("3) 가격 입력 : ");
							int productPrice = Integer.parseInt(sc.nextLine());
							System.out.print("4) 입고일 입력 : ");
							String productEnterDate = sc.nextLine();
							System.out.print("5) 수량 입력 : ");
							int productCount = Integer.parseInt(sc.nextLine());
							pDao.enterProduct(productCode, productName, productPrice, productEnterDate, productCount);
							System.out.println("상품이 입고되었습니다.2");
							continue;
							
					}
				}
			
			// 메인메뉴 - 2.계정관리
			case 2 :
				System.out.println("1.계정등록 2.계정수정 3.계정삭제 4.계정목록");
				int subMenu = Integer.parseInt(sc.nextLine());

				switch(subMenu) {
				// 메인메뉴 - 2.계정관리 - 1.계정등록
				case 1 :
					System.out.print("1) 사원코드 입력 : ");
					accountCode = sc.nextLine();
					System.out.print("2) 사원명 입력 : ");
					String accountName = sc.nextLine();
					System.out.print("3) 사원구분 입력 : ");
					String accountGrade = sc.nextLine();
					System.out.print("4) 비밀번호 입력 : ");
					accountPw = sc.nextLine();
					
					if(aDao.addAccount(accountCode, accountName, accountGrade, accountPw)) {
						System.out.println("계정이 등록되었습니다.");
					} else {
						System.out.println("계정 등록을 실패하였습니다.");
					}
					continue;
				
				// 메인메뉴 - 2.계정관리 - 2.계정수정
				case 2 :
					System.out.print("1) 사원코드 입력 : ");
					accountCode = sc.nextLine();
					System.out.print("2) 사원구분 입력 : ");
					accountGrade = sc.nextLine();
					
					if(aDao.modifyAccount(accountCode, accountGrade)) {
						System.out.println("계정이 수정되었습니다.");
					} else {
						System.out.println("계정 수정을 실패하였습니다.");
					}
					continue;
					
				// 메인메뉴 - 2.계정관리 - 3.계정삭제
				case 3 :
					System.out.print("1) 사원코드 입력 : ");
					accountCode = sc.nextLine();
					System.out.print("2) 비밀번호 입력 : ");
					accountPw = sc.nextLine();
					
					if(aDao.removeAccount(accountCode, accountPw)) {
						System.out.println("계정이 삭제되었습니다.");
					} else {
						System.out.println("계정 삭제를 실패하였습니다.");
					}
					continue;
					
				// 메인메뉴 - 2.계정관리 - 4. 계정목록
				case 4 :
					System.out.printf("%-15s %-15s %-15s\n", "사원코드", "사원명", "사원구분");
					
					for(Account list : aDao.accountList()) {
						list.showInfo();
					}
					continue;
					
				}
				
			// 메인메뉴 - 3.종료	
			case 3 :
				System.out.println("프로그램을 종료합니다.");
				run = false;
				
			}	// end 메인메뉴 switch
			
		}	// end 메인메뉴
		
	}	// end main

}	// end class
