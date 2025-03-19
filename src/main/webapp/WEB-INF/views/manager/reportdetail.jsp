<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자-신고조회</title>
    <style>
        #container{
            width: 1000px;
            margin: 10px auto;
            padding: 10px;
            border: 1px solid #000;
        }
        area {
            border-collapse: collapse;
        }
    </style>
</head>
<body>
    <div id="">
        <h1>신고 게시글 관리</h1>
            <div id="">
                <label for="">검색어</label>
                    <select name="" id="">
                        <option value="">전체</option>
                        <option value="">신고내용</option>
                        <option value="">신고자</option>
                    </select>
                <div>
                    <label for="">날짜</label>
                    <select name="" id="">
                        <option value="">접수일</option>
                        <option value="">처리일</option>
                        <input type="date">~ <input type="date">
                    </select>
                </div>
                <div>
                    <label for="">구분</label>
                    <label><input type="radio" name="check">전체</label>
                    <label><input type="radio" name="check" >처리</label>
                    <label><input type="radio" name="check">미처리</label>
                </div>
                <div>
                    <button type="submit">검색하기</button>
                    <button type="reset">초기화</button>
                </div>
            </div>
    </div>
</body>
</html>