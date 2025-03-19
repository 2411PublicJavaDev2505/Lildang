<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구인글-작성!</title>
    <style>
        body {
            width: 450px;
            padding: 30px;
            border: 1px solid #ddd;
            border-radius: 8px;
            background-color: white;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
        }
    </style>
</head>
<body>
    <form action="">
        <div>
            <div>
                <label for="">공고제목</label>
                <input type="text">
            </div>
                <div>
                    <label for="">업직종</label>
                    <select name="" id="">
                        <option value="">선택</option>
                        <option value="">외식음료</option>
                        <option value="">매장관리,판매</option>
                        <option value="">서비스</option>
                        <option value="">사무직</option>
                        <option value="">고객상담,리서치,영업</option>
                        <option value="">생산,건설,노무</option>
                        <option value="">IT,기술</option>
                        <option value="">교육.강사</option>
                        <option value="">운전,배달</option>
                        <option value="">사무회계</option>
                        <option value="">미디어</option>
                        <option value="">유통</option>
                        <option value="">문화,여가</option>
                        <option value="">병원,간호,연구</option>
                        <option value="">기타</option>
                    </select>
                </div>
                <div>
                    <label for="">모집인원</label>
                    <input type="number">명
                </div>
                <div>
                    <label for="">모집기간</label>
                    <input type="date">~<input type="date">
                </div>
                <div>
                    <label for="">학력</label>
                    <select>
                        <option value="">선택</option>
                        <option value="">대학원</option>
                        <option value="">대학(4년)</option>
                        <option value="">대학(2,3년)</option>
                        <option value="">고등학교</option>
                        <option value="">중학교</option>
                        <option value="">초등학교</option>
                    </select>
                </div>
                <div>
                    <label for="">근무지명</label>
                    <input type="text">
                </div>
                <div>
                    <label for="">동정보</label>
                    <input type="text">
                </div>
                <div>
                    <label for="">급여</label>
                    <input type="text">
                </div>
                <div>
                    <label for="">근무기간</label>
                    <input type="date">
                </div>
                <div>
                    <label for="">근무시간</label>
                    <input type="time">~<input type="time">
                </div>
                <div>
                    <label for="">요일</label>
                    <select>
                        <option value="">요일선택</option>
                        <option value="">평일(월~금)</option>
                        <option value="">주말(토,일)</option>
                        <option value="">월</option>
                        <option value="">화</option>
                        <option value="">수</option>
                        <option value="">목</option>
                        <option value="">금</option>
                        <option value="">토</option>
                        <option value="">일</option>
                        <option value="">요일협의의</option>
                    </select>
                </div>
                <div>
                    업체사진<input type="file" name="">
                </div>
                <div>
                    상세모집내용<br> 
                    <textarea name="" id="" rows="5" cols="60"></textarea>
                </div>
            </div>
    </form>
        <button type="submit">작성하기</button><button type="submit">돌아가기</button>
</body>
</html>