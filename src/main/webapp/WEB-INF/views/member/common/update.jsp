<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>mypage-modify employee</title>
        <style>
            h1{
                font-size: 60px;
                text-align: center;
            }
            #container{
                display: flex;
                justify-content: center;
            }
            #left-main{
                border-right: 1px solid black;
                width: 350px;
                text-align: center;
                
            }
            .imgbtn{
                border-radius: 20px;
                height: 40px;
                width: 120px;
                margin: 15px;
                font-size: 20px;
                background-color: #1ED483;
                font-weight: bolder;
            }
            #information {
                font-size: 30px;
                margin: 15px 30px 30px 100px;
                text-align: start;
                font-weight: bolder;
            }
            .modifybtn{
                border-radius: 20px;
                height: 40px;
                width: 120px;
                
                font-size: 20px;
                background-color: #1ED483;
                font-weight: bolder;
            }
            .deletebtn{
                border-radius: 20px;
                height: 40px;
                width: 120px;           
                font-size: 20px;
                background-color: #1ED483;
                font-weight: bolder;
            }
            #right-main{
                text-align: center;           
                width: 1000px;
                margin-left: 100px;
            }
            .modify{
                text-align: right;
                width: 700px;
                margin: 150px 100px 0px -150px;
            }
            .modify label{
                font-weight: bolder;
                font-size: 30px;
                margin: 0 auto;
            }
            
            .modify input{
                width: 400px;
                height: 40px;
                border-radius: 10px;
                margin-bottom: 20px;
                font-size: 25px;
                background-color: #D9D9D9;
            } 
            .returnbtn{
                border-radius: 20px;
                height: 40px;
                width: 120px;           
                font-size: 20px;
                background-color: #D9D9D9;
                font-weight: bolder;
            }
            .modifybtn{
                border-radius: 20px;
                height: 40px;
                width: 120px;           
                font-size: 20px;
                background-color: #1ED483;
                font-weight: bolder;
            }
            .rightbtn{
                width: 600px;
                margin-top: 100px;
            }
        </style>
    </head>
    <body>
        <h1>마이페이지 - 정보수정</h1>
        <div id="container">
            <div id="left-main">
                <img src="./img/profile.png" alt="profile"> <br>
                <button class="imgbtn">사진변경</button>
                <div id="information">
                    아이디: Ola<br>
                    이름: 이용자 <br>
                    성별: 여성 <br>
                    나이: 25 <br>
                </div>
                <button class="modifybtn">수정하기</button>
                <button class="deletebtn">탈퇴하기</button>
            </div>
            <div id="right-main">
                <div class="modify">
                    <label>PW:</label>
                    <input type="password"></input><br>
                    <label>이메일:</label>
                    <input type="text"></input><br>
                    <label>주소:</label>
                    <input type="text"></input><br>
                    <label>전화번호:</label>
                    <input type="text"></input><br> 
                    
                
                </div>
                <div class="rightbtn">
                    <button class="returnbtn">초기화</button>
                    <button class="modifybtn">수정하기</button>
                </div>
            </div>
        </div>
    </body>
</html>