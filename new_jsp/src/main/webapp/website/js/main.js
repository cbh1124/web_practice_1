/**
 * 
 /*다음주소 api  start */
    //본 예제에서는 도로명 주소 표기 방식에 대한 법령에 따라, 내려오는 데이터를 조합하여 올바른 주소를 구성하는 방법을 설명합니다.
    function sample4_execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var roadAddr = data.roadAddress; // 도로명 주소 변수
                var extraRoadAddr = ''; // 참고 항목 변수

                // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                    extraRoadAddr += data.bname;
                }
                // 건물명이 있고, 공동주택일 경우 추가한다.
                if(data.buildingName !== '' && data.apartment === 'Y'){
                   extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                }
                // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                if(extraRoadAddr !== ''){
                    extraRoadAddr = ' (' + extraRoadAddr + ')';
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('sample4_postcode').value = data.zonecode;
                document.getElementById("sample4_roadAddress").value = roadAddr;
                document.getElementById("sample4_jibunAddress").value = data.jibunAddress;
                
                // 참고항목 문자열이 있을 경우 해당 필드에 넣는다.
                if(roadAddr !== ''){
                    document.getElementById("sample4_extraAddress").value = extraRoadAddr;
                } else {
                    document.getElementById("sample4_extraAddress").value = '';
                }

                var guideTextBox = document.getElementById("guide");
                // 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.
                if(data.autoRoadAddress) {
                    var expRoadAddr = data.autoRoadAddress + extraRoadAddr;
                    guideTextBox.innerHTML = '(예상 도로명 주소 : ' + expRoadAddr + ')';
                    guideTextBox.style.display = 'block';

                } else if(data.autoJibunAddress) {
                    var expJibunAddr = data.autoJibunAddress;
                    guideTextBox.innerHTML = '(예상 지번 주소 : ' + expJibunAddr + ')';
                    guideTextBox.style.display = 'block';
                } else {
                    guideTextBox.innerHTML = '';
                    guideTextBox.style.display = 'none';
                }
            }
        }).open();
    }
 /*다음주소 api  end */
/* 회원탈퇴 [ ajax : jquery  ] */ 

	// $( function(){ 실행문 });	: js함수 정의하기
	$(function(){ 
		// 버튼을 클릭했을때 이벤트 걸기 
		$("#delete").click( function(){ 
			// ajax : 비동기식 통신 [ 페이지전환없이 통신 ]
				//$.ajax({ 속성명:값 , 속성명:값 , 속성명:값  });
			$.ajax({
				url : "../../controller/memberdeletecontroller.jsp" ,
				/* url : 통신 경로 */
				data : {password:document.getElementById("deleteform").password.value} ,
				/* data : { 변수명 : 값 } */ 
				success : function( result  ){
					if( result == 1 ){
						alert('회원탈퇴 되었습니다');
						location.href='../../controller/logoutcontroller.jsp';
					}else{
						document.getElementById("deleteresult").innerHTML = "회원정보가 다릅니다.";
					}
				
				}
			});
		} ); // 버튼 클릭했을때 함수 끝
	 }); // 전체 함수 끝 


/* 회원탈퇴 */

/* */
/* 아이디 중복체크 [ajax] */   
	$(function(){
		$("#id").change(function(){
				// 비동기식 : $.ajax({속성명 : "값", 속성명:"값" , 속성명 :"값" })
				$.ajax({
					url : "idcheck.jsp", /* 통신할 경로 페이지 */ 
					data :{ userid : document.getElementById("signupform").id.value }, 				/* 이동할 데이터 */
					success : function( result ){ /*통신이 성공했을때*/
						if(result == 1){
							
							document.getElementById("idresult").innerText = "현재 사용중인 아이디 입니다.";
						}else{
							
							document.getElementById("idresult").innerText = "사용 가능한 아이디 입니다.";
						}
					}
				});
		});
		// 태그의 id가 
	});
/*   */
function namechange(){ 
	document.getElementById("tdname").innerHTML = "<input type='text' id='name' class='form-control'> <button id='namechangebtn' class='form-control'>확인</button>"
	
	$(function(){
		$("#namechangebtn").click(function(){
			$.ajax({
				url : "../../controller/changecontroller.jsp",
				data : { name : document.getElementById("name").value },
				success : function( result ){
					if(result == 1){
						alert("값을 수정하셨네요");
					}else{
						alert("값을 불수정하셨습니다.");
					}
					
				}
			});
		});
		
	});
}		

	

/* 회원가입 유효성검사 */
	function signupcheck(){
	
		// 1. 폼 가져오기 [ 폼에 id 존재 ]	//	document.getElementById("signupform")
		// 2. 폼내 아이디 입력 input 가져오기
		var id = document.getElementById("signupform").id.value;
		var password = document.getElementById("signupform").password.value;
		var passwordconfirm = document.getElementById("signupform").passwordconfirm.value;
		var name = document.getElementById("signupform").name.value;
		var birth = document.getElementById("signupform").birth.value;
		var phone = document.getElementById("signupform").phone.value;
		var sex1 = document.getElementById("signupform").sex1.checked;	// checked 유무 가져오기 
		var sex2 = document.getElementById("signupform").sex2.checked;

		// 3. 유효성검사 [ 정규표현식 : 텍스트 패턴 검사 ] 
		var idj = /^[a-z0-9]{5,15}$/;		// 아이디 정규표현식	[ 소문자 숫자 5~15]
		var pwj = /^[A-Za-z0-9]{5,15}$/;	// 비밀번호 정규표현식[ 대,소문자 숫자 5~15]
		var phonej = /^01([0|1|6|7|8|9]?)-?([0-9]{3,4})-?([0-9]{4})$/; // 연락처
		var namej = /^[A-Za-z0-9가-힣]{1,15}$/;	// 이름 정규표현식
		
		// 아이디 
		if( !idj.test( id ) ){
			document.getElementById("idresult").innerHTML="아이디는 소문자와 숫자 조합 5~15 사이만 가능 합니다";
			document.getElementById("idresult").style.color = "red";
			return false;// form submit 불가
		}else{
			document.getElementById("idresult").innerHTML="사용가능한 아이디 입니다."
			document.getElementById("idresult").style.color = "green";
		}
		
		// 패스워드 [ 두 패스워드 동일한지 검사 ]
		
		if( !pwj.test(password) || !pwj.test(passwordconfirm) ){
			document.getElementById("pwresult").innerHTML="대소문자 조합 5~15 사이만 가능합니다."; return false;
		}else if( password != passwordconfirm){
			document.getElementById("pwresult").innerHTML="패스워드가 동일하지 않습니다.";	return false;
		}else{
			document.getElementById("pwresult").innerHTML="사용가능한 패스워드 입니다.";
		}
		// 이름
		if( !namej.test(name) ){
			document.getElementById("nameresult").innerHTML="이름을 입력해주세요.[특수문자는 제외]"; return false;
		}else{
			document.getElementById("nameresult").innerHTML="";
		}
		//생년월일
		if( birth == ""){
			document.getElementById("birthresult").innerHTML="생년월일 선택해주세요"; return false;
		}else{
			document.getElementById("birthresult").innerHTML="";
		}
		// 성별
		if( !sex1 && !sex2 ){  // 둘다 false 이면 // 둘다 체크를 안했으면
			document.getElementById("sexresult").innerHTML="성별을 선택해주세요"; return false;
		}else{
			document.getElementById("sexresult").innerHTML="";
		}
		// 전화번호 
		if( !phonej.test( phone ) ){
			document.getElementById("phoneresult").innerHTML="전화번호 형식으로 입력해주세요."; return false;
		}else{
			document.getElementById("phoneresult").innerHTML="가능합니다";
		}
	}

/* 회원가입 유효성검사 end */
	

/*제품 상태 변경 */
function activeupdate(p_num){
	
	// confirm : 확인 / 취소 알람 띄우기 
	// 동기식 
		//location.href('../../controller/productdeletecontroller.jsp?p_num='+p_num);
	// 비동기식 
	
	
		// ajax 통신으로 상태를 다음 상태로 변경 	
		$(function(){
			alert("체크1");
			$.ajax({ 
				url : "../../controller/productactivecontroller.jsp",
				data : {p_num : p_num},
				success : function(result){
					alert("체크2");
					if(result == 1){ // js 자료형이 없다.
						// 현재 페이지 초기화 [현재 페이지 refresh]
						location.reload(); // jquery 메소드
					}else{
						alert("변경 실패 [ 관리자에게 문의 ] ")
					}
						
				}
			 });
		});
	
}

/* 제품 수량 변경 */

function pchange(type , stock ,price ){ // 함수 선언
	var min_count = 1; // 최소 제품 수량
	var pcount = document.getElementById("pcount").value*1;
					// 현재 수량 가져오기 // 문자열->숫자열 : 문자열*1
					
	if(type == 'm'){ // 마이너스 버튼을 눌렀을때 
		pcount -= 1;	// 현재 수량 -1
		if(pcount<min_count){ // 만약에 1보다 작아지면 
			alert("수량은 1개 이상만 가능 합니다."); // 메시지
			pcount = 1;
		} 
	}else if(type = "p"){ // 플러스 버튼을 눌렀을때
		pcount += 1; 		// 현재수량 + 1
		if(pcount > stock){  // 만약에 1보다 커지면
			alert("죄송합니다. 재고가 부족합니다.") // 메시지
			pcount = stock;
		}
	}else { // 만약에 사용자가 수량을 조절했을때 
		pcount += 0;
		if(pcount > stock){  // 만약에 1보다 커지면
			alert("죄송합니다. 재고가 부족합니다.") // 메시지
			pcount = stock;
			
		}
		if(pcount<min_count){ // 만약에 1보다 작아지면 
			alert("수량은 1개 이상만 가능 합니다."); // 메시지
			pcount = 1;
		} 
	}
	// 현재 수량을 현재 수량 입력상자에 대입 
	document.getElementById("pcount").value = pcount;
	
	var totalprice = pcount * price; // 총가격 = 제품수량 * 제품가격
	document.getElementById("total").innerHTML =  totalprice.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ',')
										// .innerHTML 속성 태그 [div]
												// 총 가격 . tostring() : 문자열 변환 
													// .replace(기존문자, 새로운 문자);
														// 정규표현식 [문자 패턴 찾기]: /\B(?=(\d{3})+(?!\d))/g
															// 1. / : 시작 
															// 2. \b : 시작, 끝 문자 [예 : 1234일경우 1, 4 ]
															// 3. \d{3} : 문자 길이 [ 예 : {3} : 숫자길이 123 ]
															// 4. !\d : 뒤에 숫자 없을경우 
															// 5. g : 글로벌 전역 검색 
															
}					

/* 찜하기 */
function plike(p_num, m_num){

	// 비동기 통신 
	$(function(){
		$.ajax({
			url : "../../controller/productlikecontroller.jsp",
			data : { p_num : p_num , m_num : m_num } ,
			success : function(result){
				if(result == 1){
					document.getElementById("btnplike").innerHTML = "찜하기♥"
				}else if(result == 2){
					document.getElementById("btnplike").innerHTML = "찜하기♡"
				}
			}  
		});
	});
	
}
	
	
	
	
/*찜하기 end */	
	
	
