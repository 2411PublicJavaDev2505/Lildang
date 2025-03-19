<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Mypage - boss</title>
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
            .hiretitle{
                text-align: left;
                margin:20px 0px -50px 30px;
                font-size: 25px;
                font-weight: bolder;
                width: 200px;
            }
            
            .writebtn{
                border-radius: 15px;
                height: 40px;
                width: 120px;           
                font-size: 15px;
                background-color: #1ED483;
                font-weight: bolder;
                margin: 15px 0px 15px 450px;
                
            }
            .hirename1{
                font-weight: bolder;
            }
            .hireplace1{
                border: 1px solid black;
                width: 800px;
                height: 150px;
                border-radius: 10px;
                
            }
            .chatbtn{
                border-radius: 15px;
                height: 25px;           
                font-size: 14px;
                background-color: #1ED483;
            }
            .ybtn{
                border-radius: 15px;
                height: 25px;           
                font-size: 14px;
                background-color: #1ED483;
            }
            .nbtn{
                border-radius: 15px;
                height: 25px;           
                font-size: 14px;
                background-color: #1ED483;
            }
            .employeedata{
                text-align: left;
                margin-left: 20px;
                display: flex;
                margin-bottom: 3px;
            }
            .btn{
                margin-left: 500px;
            }
            .picktitle{
                text-align: left;
                margin:20px 0px -50px 30px;
                font-size: 25px;
                font-weight: bolder;
                width: 230px;
            }
            .pickplace{
                border: 1px solid black;
                width: 800px;
                height: 150px;
                border-radius: 10px;
                font-size: 20px;
                padding: 10px 0px 0px 0px;
                margin-top: 80px;
                font-weight: bold;
            }
            .employeeinfo{
                width: 200px;
                margin: 10px;
                font-weight: bold;
            }
        </style>
    </head>
    <body>
        <h1>마이페이지</h1>
        <div id="container">
            <div id="left-main">
                <img src="./img/profile.png" alt="profile"> <br>
                <button class="imgbtn">사진변경</button>
                <div id="information">
                    아이디: Hula<br>
                    이름: 일용자 <br>
                    성별: 남 <br>
                    나이: 50 <br>
                    평점: 3.5/5.0
                </div>
                <button class="modifybtn">수정하기</button>
                <button class="deletebtn">탈퇴하기</button>
            </div>
            <div id="right-main">
                <div class="myhire">
                    <p class="hiretitle">내 공고글</p>
                    <button class="writebtn">공고글 작성</button>
                    <div class="hirename1">
                        KH정보교육원 종로지원&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        IT.기술             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        서울 중구           &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        25.05.14            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    </div>
                    <div class="hireplace1">
                        <p class="employeeinfo">이 공고에 지원한 알바생</p>
                        <div class="employeedata">
                            황수만 1.0/5.0
                            <div class="btn">
                                <button class="chatbtn">채팅하기</button>
                                <button class="ybtn">수락</button>
                                <button class="nbtn">거절</button>
                            </div>
                        </div>
                        <div class="employeedata">
                            박재준 5.0/5.0
                            <div class="btn">
                                <button class="chatbtn">채팅하기</button>
                                <button class="ybtn">수락</button>
                                <button class="nbtn">거절</button>
                            </div>
                        </div>
                        <div class="employeedata">
                            박재일 3.0/5.0
                            <div class="btn">
                                <button class="chatbtn">채팅하기</button>
                                <button class="ybtn">수락</button>
                                <button class="nbtn">거절</button>
                            </div>
                        </div>
                        
                    </div>
                </div>
                <div class="mypick">
                    <p class="picktitle">내가 찜한 알바생</p>
                <div class="pickplace">내가 찜한 알바생이 없어요...ㅠㅠ</div>
                </div>
                <div class="mypick">
                    <p class="picktitle">내가 제의한 알바생</p>
                <div class="pickplace">
                    최제우                                      &nbsp;&nbsp;&nbsp;&nbsp;
                    zeus12                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    KH정보교육원 종로지원 자바개발자 모집(급구!!!)  &nbsp;&nbsp;&nbsp;&nbsp;
                    확인중                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                </div>
                </div>
            </div>
        </div>
    </body>
</html>