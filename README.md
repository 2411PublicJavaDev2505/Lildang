![image](https://github.com/user-attachments/assets/2835b6a0-6ce0-44c9-b367-b2667ed6bbd9)- - -
***Lildang README***
# 0. 일당해라
![Image](https://github.com/user-attachments/assets/fdec391c-f484-42b3-a647-fd3693d733e7)
#  사장님과 알바생이 서로 믿고 고용하고 지원할 수 있는 사이트
## 프로젝트 소개
![Image](https://github.com/user-attachments/assets/f0d13215-7896-4004-8289-2b9fad08e637)
## 팀소개
![Image](https://github.com/user-attachments/assets/2c561cbf-86ba-4e1c-ba6e-f6aab4cc4805)
## 기획의도
![Image](https://github.com/user-attachments/assets/f0585001-ee75-4b84-b46f-57f18acfe683)
## 차별성
![Image](https://github.com/user-attachments/assets/5b4f5f53-3c55-4eef-984d-7aa5884771a8)
- - -
## 프로젝트 개발환경
- DB : Oracle 23 xe 버전 이용
- sts-3.9.18 버전 사용
## 프로젝트 실행 환경 구축(로컬)
1. 오라클 23 설치 후 로컬에 db 계정 생성 
2. 계정 생성 후 권한 부여 및 테이블 생성

- 테이블, 시퀀스 생성 및 데이터 삽입 스크립트
- [Lildang.sql](https://drive.google.com/file/d/1bysvIiAhOmzkNAyiigMQpFvjC_11DM0Y/view?usp=drive_link)

3. 이후 sts에 및 root-context.xml 파일을 이용해 db와 연결 

# 1. 기술스택
![Oracle](https://img.shields.io/badge/Oracle-F80000?style=for-the-badge&logo=oracle&logoColor=white)
![java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)<br>
![html5](https://img.shields.io/badge/html5-%23E34F26.svg?style=for-the-badge&logo=html5&logoColor=white)
![CSS3](https://img.shields.io/badge/css3-%231572B6.svg?style=for-the-badge&logo=css3&logoColor=white)
![java  Script](https://img.shields.io/badge/javascript-%23323330.svg?style=for-the-badge&logo=javascript&logoColor=%23F7DF1E)<br>
![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white)
![Eclipse](https://img.shields.io/badge/Eclipse-FE7A16.svg?style=for-the-badge&logo=Eclipse&logoColor=white)
![Apache Tomcat](https://img.shields.io/badge/apache%20tomcat-%23F8DC75.svg?style=for-the-badge&logo=apache-tomcat&logoColor=black)


# 2. 브랜치 전략
## Git Flow 방식
- 팀원 각자의 브랜치를 만들어 개발 진행
- 기능 구현이 완료되면 Main 브랜치에 병합
  ![git_flow](https://github.com/2405PublicjavaDev/sulgilddara/blob/main/img/github_flow.png?raw=true)
# 3. 프로젝트 구조
[프로젝트 구조.pdf](https://drive.google.com/file/d/1zm0MfbttcI_01ZdY3qzfOGAMqikyBkWs/view?usp=drive_link)


# 4. 프로젝트 역할 분담
## 최제우: 회원관리, 알바 매칭, 이력서 관리, 채팅관리, 후기 관리
- 회원가입: 회원가입 아이디, 이름, 비밀번호, 전화번호, 이메일, 생년월일, 주소를 기입하여 회원가입을 할 수 있다.
- 로그인: 사장님 세션으로 로그인 할 수 있다. 알바생 세션으로 로그인 할 수 있다. 관리자 로그인시 관리자계정으로 로그인이 가능하다.
- 로그아웃: 로그인 상태에서 로그아웃을 할수 있다. 
- 마이페이지: 회원 정보 조회 이름, 전화번호, 성별, 이메일, 주소, 아이디, 비밀번호, 나이, 이력서, 프로필 사진를 조회 할수 있다.
- 알바 제의: 사장님 회원은 맘에 드는 알바생에게 알바를 제의할 수 있다.
- 알바 지원: 알바생 회원은 맘에 드는 알바공고에 지원을 할 수 있다.
- 이력서 작성: 알바생은 희망직종, 학력, 경력, 자격증, 짧은글, 자기소개서을 입력하여 이력서를 작성 할 수 있다.
- 이력서 조회: 마이페이지에서 자신의 이력서를 조회할 수 있다. 이력서 삭제 마이페이지에서 자신의 이력서를 삭제할 수 있다. 
- 이력서 수정: 자신이 작성한 이력서를 수정할 수 있다.
- 채팅 조회: 전에 나눴던 채팅들을 조회할 수 있다.
- 채팅 작성: 채팅창에 메세지를 보낼 수 있다.
- 후기 작성: 근무가 끝난 알바생에 대해 평점과 후기를 작성할 수 있고 근무가 끝나면 해당 사장님과 해당 알바에 대한 평점과 후기를 작성할 수 있다.
- 후기 수정: 자신이 작성한 후기를 수정할 수 있다.
## 박재일:
- 
## 황수만: 관리자페이지,신고관리,회원관리,회원정보수정
- 마이페이지 회원정보 수정 : 마이페이지에서 수정페이지를 통해 전화번호, 이메일, 주소, 비밀번호, 이력서, 프로필 사진을 수정 할 수 있다.
- 신고관리(관리자) 공고글 신고 불건전한 공고글을 신고할 수 있다.
- 알바생 신고 불건전한 행위를 한 알바생을 신고할 수 있다.
- 신고 조회 회원들이 작성한 신고목록을 조회할 수 있다.
- 신고 상세 조회 어떠한 신고가 들어왔는지 상세내용을 확인할 수 있다.
- 신고 삭제 타당하지 않은 신고를 삭제할 수 있다.
- 회원관리(관리자)
- 회원 조회 관리자 페이지에서 회원목록을 조회할 수 있다.
- 회원 정지 신고가 들어온 회원중 규약 위반을 한 회원이면 활동을 정지시킬 수 있다.
- 게시물(관리자) 게시물 삭제 불건전한 게시물을 삭제할 수 있다.

## 박재준:구인공고 관리, 알바생 관리
- 공고글 작성: 사장님으로 로그인 했을 경우 공고글 제목, 근무지주소, 업종, 근무기간, 근무일시, 시급, 모집인원, 모집기간, 학력, 근무 요일, 근무지 명을 작성하고 일에 대한 상세한 설명, 사업장사진을 작성하여 등록이 가능하다.
- 공고글 수정: 자신이 등록한 공고글을 수정할 수 있다.
- 공고글 삭제: 자신이 등록한 공고글을 삭제할 수 있다.
- 공고글 검색: 지역별로 공고글을 검색할 수 있다.
- 공고글 정렬: 최근순, 평점순으로 공고글을 정렬할 수 있다.
- 공고글 상세조회: 공고글 상세정보를 조회할 수 있다.
- 알바생 검색: 성별 별로 알바생을 검색할 수 있다.
- 알바생 정렬: 평점순으로 알바생 목록을 정렬할 수 있다.
- 알바생 상세 조회: 알바생 상세정보를 조회할 수 있다.

# 5. 개발 기간 및 작업 관리
![Image](https://github.com/user-attachments/assets/1024fa90-0b10-48bc-bb02-4ea7bf8ac8f7)

# 6. 페이지별 기능
## 최제우:
![image](https://github.com/user-attachments/assets/c6889dfb-75de-403c-b1aa-bec2a3d22f27)
![image](https://github.com/user-attachments/assets/ab06c2ac-b360-49da-b96b-99054fb3c80d)
- 사장님, 알바생 선택 후 아이디, 이름, 비밀번호, 전화번호, 이메일, 주소, 생년월일, 성별을 입력 후 회원가입을 진행할 수 있습니다. 비밀번호는 확인 후 회원가입이 가능합니다. 회원가입 버튼을 눌러 회원가입이 가능합니다.
![image](https://github.com/user-attachments/assets/dce82fcf-672d-4e62-bac7-04f907b2331a)
- 아이디와 비밀번호를 입력한 후 로그인 버튼을 눌러 로그인 할 수 있습니다.
![image](https://github.com/user-attachments/assets/a6029b4c-3e55-4ac7-867c-8658c6eca4c5)
- 우측 상단에 있는 로그아웃을 통해 로그아웃을 할 수 있습니다.
![image](https://github.com/user-attachments/assets/2b49f9c9-cf48-4edb-b7dd-11b0e1ba378c)
 회원 정보 조회 이름, 전화번호, 성별, 이메일, 주소, 아이디, 비밀번호, 나이, 이력서, 프로필 사진를 조회 할 수 있고 파일 선택을 눌러 원하는 사진을 선택 후 사진변경 버튼을 통해 프로필 사진 변경이 가능하고 수정하기 버튼을 통해 회원 정보 수정이 가능하고 탈퇴하기 버튼을 통해 회원탈퇴가 가능하다. 우측 상단에 있는 공고글 작성 버튼을 통해 공고글 작성이 가능하다. 

  
## 박재준:
![image](https://github.com/user-attachments/assets/591643cc-c49b-4765-aeff-df59a4d505a0)
- 사장님으로 로그인 후 마이페이지에서 공고글 작성 버튼을 눌러 공고글 작성하기를 할 수 있습니다.
![image](https://github.com/user-attachments/assets/e6fd82aa-9e60-48f1-8439-188478985997)
- 공고글 작성하기에 들어가면 공고제목, 업직종, 모집인원, 모집기간, 학력, 근무지명, 근무주소, 급여, 근무기간, 근무시간, 요일, 업체사진, 상세모집내용을 작성하고 작성하기 버튼을 눌러 공고글을 등록하거나 돌아가기 버튼을 눌러 이전페이지로 돌아갈 수 있습니다.
 ![image](https://github.com/user-attachments/assets/676b1c34-0189-443d-9ed1-97ceafa67842)
 ![image](https://github.com/user-attachments/assets/7393f226-352f-41fc-b55a-0660c8800327)
- 공고글을 등록하면 공고글 리스트에 공고글이 추가가 되고 전체 공고글과 아래 페이지네이션이 뜹니다. 헤더에 있는 검색을 통해 공고글을 검색하거나 지역 선택을 통해 지역을 선택할 수 있고 공고글을 클릭해 상세정보를 조회 할 수 있습니다.
![image](https://github.com/user-attachments/assets/dd35fd06-3d4a-4907-b741-33647ba2f696)
- 헤더부분에서 원하는 검색어로 검색을 하게되면 해당하는 공고글만 뜨고 공고글을 클릭해 상세정보를 조회 할 수 있습니다.
![image](https://github.com/user-attachments/assets/b7b54fb0-f4fa-49a1-a3bb-17a04fb9576e)
![image](https://github.com/user-attachments/assets/23895ae2-3868-4812-932f-f6b817a09add)
- 정렬하기를 통해 최근등록순, 평점순으로 정렬할 수 있으며 공고글을 클릭해 상세정보를 조회할 수 있고 지역별 검색과 동시에 할 수 있습니다.
![image](https://github.com/user-attachments/assets/ab3ee749-19c8-45be-9fd2-6f414092e83d)
![image](https://github.com/user-attachments/assets/dcec3cd6-2fcd-43a9-8142-a45522dbed0f)
![image](https://github.com/user-attachments/assets/6f5fd29f-0ef7-47af-a173-a8afd5429da4)
- 공고글을 클릭해 상세정보를 보면 공고제목, 업직종, 모집인원, 모집기간, 학력, 근무지명, 근무주소, 급여, 근무기간, 근무시간, 요일, 업체사진, 상세모집내용이 뜨고 목록으로 돌아가는 버튼과 본인이 작성한 게시물이라면 삭제하기, 수정하기 버튼이 뜨고 본인이 작성한 글이 아니면 신고하기, 채팅하기, 지원하기 버튼이 뜹니다.
![image](https://github.com/user-attachments/assets/51f1af93-f483-427a-a432-004edc8405fa)
- 신고하기 버튼을 누르면 신고하기 모달창이 뜨고 신고사유와 신고내용을 입력하여 신고하기 버튼을 통해 신고할 수 있고 뒤로가기 버튼을 통해 돌아갈 수 있다.
![image](https://github.com/user-attachments/assets/5f996649-1aa1-4c6a-abcc-7c6f1a5a0491)
![image](https://github.com/user-attachments/assets/991cf20e-b9ef-4a8c-bf13-7e496f1b8c57)
- 수정하기 버튼을 누르면 alert창이 뜨고 확인을 누르면 공고제목, 업직종, 모집인원, 모집기간, 학력, 근무지명, 근무주소, 급여, 근무기간, 근무시간, 요일, 업체사진, 상세모집내용을 수정할 수 있고 수정하기 버튼을 통해 수정을 완료하거나 돌아가기 버튼을 통해 수정을 취소할 수 있습니다.
![image](https://github.com/user-attachments/assets/c452e906-cc87-418e-a097-36c6ae67e454)
- 삭제하기 버튼을 누르면 정말 삭제하시겠습니까? 라는 alert 창이 뜨고 확인을 누르게 되면 삭제가 완료되고 취소를 통해 삭제 하지 않을 수 있습니다.
![image](https://github.com/user-attachments/assets/b362c28b-ed4e-418f-8334-8e0ab7ab75a3)
![image](https://github.com/user-attachments/assets/4a962b41-28ad-431f-89f2-97feca409a98)
- 헤더에서 알바생 찾기를 누르면 알바생 리스트가 뜨고 알바생을 클릭해 상세정보를 조회할 수 있습니다.
![image](https://github.com/user-attachments/assets/8859d95f-e40c-48cd-94be-5c8b8be61f8b)
- 알바생 찾기 위쪽 부분에서 현재 대기중인 알바생이 몇 명인지 확인할 수 있고 지역별로 어떤 알바생이 있는지 찾을 수 있습니다.
![image](https://github.com/user-attachments/assets/2cf7474a-0334-4dfe-b006-1b1e0d1aa55a)
- 우측에 있는 정렬하기에서 평점순으로 알바생을 정렬할 수 있고 지역별 평점순 두가지 동시에도 가능합니다.
 




## 황수만 : 
![회원관리 페이지](https://github.com/user-attachments/assets/a72dc0a7-ec73-4481-901f-6039557cd758)
- 관리자로 로그인 하여 관리자페이지를 누르면 전체 회원정보를 조회 할 수 있다.
![신고관리](https://github.com/user-attachments/assets/6bdc14aa-75d6-4f66-b8c4-d86093a20547)
- 회원들이 신고한 내역을 조회 할 수 있다.
![신고관리 상세보기(사장님이 알바생신고)](https://github.com/user-attachments/assets/0da55c4b-b003-4ef2-96c7-f557c17e71f0)
- 클릭하여 상세보기로 들어가서 사장님이 알바생을 신고한 내역을 보고 신고삭제 혹은 회원삭제가 가능하다.
![신고관리 상세보기(알바생이 사장님 신고)](https://github.com/user-attachments/assets/80196af7-0ef0-48b4-97c9-cb5f1587cecd)
- 알바생이 사장님을 신고했을 경우에는 신고한 내역을 보고 신고삭제 혹은 공고글삭제가 가능하다.
![image](https://github.com/user-attachments/assets/182131b4-69ed-4422-a30b-3888de50ff9d)
- 아이디, 이름, 성별, 나이를 제외한 정보는 수정이 가능하다.



# 7. 프로젝트 후기
## 최제우:
- 
## 박재일:
- 
## 황수만:    
- 세미 프로젝트를 통해 이해가 부족했던 부분들을 확실히 알게 되었고,
코드의 역할과 동작 방식을 더 깊이 이해할 수 있는 계기가 되었습니다.
이번 경험을 통해 한층 더 성장할 수 있어 의미 있는 시간이었습니다.
## 박재준: 
- 이번 세미 프로젝트를 하면서 느낀점은 제가 개발하고자 하는 방향성과 구조에 대해서 깊게 고민하고 이해해야 테이블 셋팅을 원활하게 할 수 있고, 구조가 깔끔해져서 코드를 짜기 편하다는 것을 느꼈습니다. 프로젝트 중 테이블과 VO 구조를 여러번 수정하다 보니 많은 코드들을 수정해야 했고, 효율적으로 시간을 사용하지 못했던 부분이 있었습니다. 조회, 등록, 수정, 삭제 기능을 반복적으로 구현함으로써 기본적인 웹 개발 능력을 확실히 다질 수 있었고, 특히 평소 어려움을 느꼈던 여러 테이블의 데이터를 다양한 조건에 따라 처리하는 복잡한 쿼리문 작성에 대한 이해도가 이전보다 크게 나아져 이를 더 효율적으로 활용할 수 있게되었다 생각합니다. 앞으로는 이러한 경험을 바탕으로 더 복잡한 기능도 자신있게 구현할 수 있을 것 같습니다.
    

# 프로젝트 산출문서
- [기획보고서](https://drive.google.com/file/d/10fwJsdPEcbjCskX2__Ka4sWysmIDfmJP/view?usp=drive_link)
- [요구사항정의서](https://drive.google.com/file/d/1nmAulBOum8D5iWk6tECTmIeWMvDWyL5h/view?usp=drive_link)
- [요구사항 리스트](https://drive.google.com/file/d/1W6fTkRrArwK4776ugT7zzDM5YLd3gITf/view?usp=drive_link)
- [와이어프레임](https://drive.google.com/file/d/1ZIlCLxENEWpxQsmp5W-4ZfBVcd8OwYkz/view?usp=drive_link)
- [DB설계](https://drive.google.com/file/d/1UDvzS6LaflDXpRDo59QjMxlckBNSR1sb/view?usp=drive_link)
- [시퀀스다이어그램](https://drive.google.com/file/d/1naMSrborqkdk9IPR4dmh68QbqH060Uhn/view?usp=drive_link)
- [최종보고서](https://drive.google.com/file/d/1MMKjX51QPCfE5MNMhmgw4pGOWmnL2Tee/view?usp=drive_link)
- [프로젝트 소스 DB](https://drive.google.com/file/d/1bysvIiAhOmzkNAyiigMQpFvjC_11DM0Y/view?usp=drive_link)
- [시연영상](https://drive.google.com/file/d/1njht_mPTW020cWp5kbst8CBU-qA_20zN/view?usp=drive_link)
