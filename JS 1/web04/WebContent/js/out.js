function 로그인() {
	id2 = 'root';
	id = prompt('아이디 입력')
	if (id == id2) {
		alert('로그인 성공')
	} else {
		alert('로그인 실패')
	}
}

function 비교() {
	n1 = 100
	n2 = 200
	if (n1 == n2) {
		alert('동일합니다.')
	} else {
		alert('동일하지 않습니다.')
	}
}

function 비교2() {
	mood1 = prompt('친구의 기분 >> 굿 / 별로 / 나빠 중에 입력하세요.')
	mood2 = prompt('나의 기분>> 굿 / 별로 / 나빠 중에 입력하세요.')
	
	if (mood1 == mood2) {
		alert('기분이 똑같네요')
	} else {
		alert('기분이 다르군요.')
	}
}