/**
 * 
 */

		var price = 5; // 변수선언
		var num1 = 14; // 변수선언
		var total = price * num1;  // 변수 연산
		
		// 현재 문서의 id 가져오기 [ span을 객체로 가져오기]
		var elem = document.getElementById("number");
		elem.textContent = total;
		
		var minus = price - num1; // 변수 연산
		var plus = price + num1; // 변수 연산
		var elem1 = document.getElementById("number1");
		elem1.textContent = plus;
		if(price == num1){
			elem1.textContent = minus;
		}else{
			elem1.textContent = plus;
		}
		
	function start(){ // 함수 선언 [function 메소드명 () {실행문} ]
		
		// 배열
		// 전달 아이디를 객체에 전달 하여서 아이디를 지정하고 나서 해당 전달 값을 전달 따라서 id값과 데이터값이 한 var에 위치하게 됨
		var color = ['red', 'white', 'black'];
		var colorName = document.getElementById("color"); // colorName을 getElementById("color")접근객체로 설정 
		colorName.textContent = color[0];
		colorName.style.color = color[0];
		
		// "colors"라는 아이디와 colors의 갯수를 전달 
		var colors = color.length;
		var colorLength = document.getElementById("colors")
		colorLength.textContent = colors;
		
		// 백그라운드 색상 전달
		document.body.style.backgroundColor = "blue";
	}
	
	
	function start2(){ // 정의부
		
		var text = ""; // 변수선언 [자료형 없음]
		var count = 1; // 변수선언
		while(count < 10){ // 반복문
			text += "<li> 여기는 숫자" + count + "</li>";
				// 변수는 "" 처리 불가
				// html 태그는 문자 처리	
				count ++ ;	
		}	
		document.getElementById("list").innerHTML = text;
		
		// for문 
		var text1 = "";
		for(var i = 1; i<6; i++){
			text1 += "<li> 여기는 숫자 : " + i + "</li>";

		}
		document.getElementById("list1").innerHTML = text1;
		
		// 배열
		var text2 = "";
		var phones = ["아이폰", "갤럭시폰" , "엘지폰"];
		for(var i = 0; i<phones.length; i++){
			text2 += "<li>" + phones[i] +"</li>";
		}
		document.getElementById("list2").innerHTML = text2;
		
	}
	
	function cancel(){
		document.getElementById("list").innerHTML = "";
		document.getElementById("list1").innerHTML = "";
		document.getElementById("list2").innerHTML = "";
	}
	
	
	function start3(){
		// 기존 리스트 가져오기
		var text = document.getElementById("list").innerHTML ;
		var product = "콜라"; // 변수
		text += "<li>" + product + "</li>"; //콜라 변수 추가
		document.getElementById("list").innerHTML = text;
	}
	
	function start4(num1, num2){ // 변수를 인수로 받음
		
		var total = num1 * num2; // 인수 연산
		document.getElementById("result").textContent = total;
	}
	
	
	
	
	