package com.gyojincompany.member;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member1 = new Member();
//		member1.setID("tiger");
		member1.setId("tiger");
		member1.setAge(27);
		member1.setName("홍길동");
		member1.setPw("12345");
		member1.setEmail("hong@gmail.com");
		
//		member1.id = "tiger";
//		member1.pw = "12345";
//		member1.name = "홍길동";
//		member1.email = "hong@abc.com";
//		member1.age = 27;
		
		Member member2 = new Member();
//		member2.id = "lion";
//		member2.pw = "12333";
//		member2.name = "이순신";
//		member2.email = "lee@abc.com";
//		member2.age = 32;
		
		Member member3 = new Member("whitecat", "8888", "김우신", "white@abc.com", 41);
		// 생성자를 이용하여 초기화
		
		System.out.println("회원1이름: "+ member1.getId());
		System.out.println("회원3 email: "+ member3.getEmail());
//		System.out.println("회원1 이름:"+ member1.name); //홍길동
//		System.out.println("회원2 이름:"+ member2.name); //이순신
		
	}	

}
