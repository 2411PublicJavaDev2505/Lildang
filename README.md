- - -
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
## 최제우:
- 
## 박재일:
- 
## 황수만: 관리자페이지,신고관리,회원관리,회원정보수정
-
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
### [회원가입]

- 아이디, 이름, 비밀번호, 전화번호, 이메일, 주소, 생년월일, 성별을 입력 후 회원가입을 진행할 수 있습니다.
- 비밀번호는 확인 후 회원가입이 가능합니다.
  
## 박재준:
![image](https://github.com/user-attachments/assets/591643cc-c49b-4765-aeff-df59a4d505a0)
- 사장님으로 로그인 후 마이페이지에서 공고글 작성 버튼을 눌러 공고글 작성하기를 할 수 있습니다.
![image](https://github.com/user-attachments/assets/e6fd82aa-9e60-48f1-8439-188478985997)
- 공고글 작성하기에 들어가면 공고제목, 업직종, 모집인원, 모집기간, 학력, 근무지명, 근무주소, 급여, 근무기간, 근무시간, 요일, 업체사진, 상세모집내용을 작성하고 작성하기 버튼을 눌러 공고글을 등록하거나 돌아가기 버튼을 눌러 이전페이지로 돌아갈 수 있습니다.
- ![image](https://github.com/user-attachments/assets/676b1c34-0189-443d-9ed1-97ceafa67842)
- ![image](https://github.com/user-attachments/assets/7393f226-352f-41fc-b55a-0660c8800327)
- 공고글을 등록하면 공고글 리스트에 공고글이 추가가 되고 전체 공고글과 아래 페이지네이션이 뜹니다. 헤더에 있는 검색을 통해 공고글을 검색하거나 지역 선택을 통해 지역을 선택할 수 있고 공고글을 클릭해 상세정보를 조회 할 수 있습니다.
![image](https://github.com/user-attachments/assets/dd35fd06-3d4a-4907-b741-33647ba2f696)
헤더부분에서 원하는 검색어로 검색을 하게되면 해당하는 공고글만 뜨고 공고글을 클릭해 상세정보를 조회 할 수 있습니다.
![image](https://github.com/user-attachments/assets/ab3ee749-19c8-45be-9fd2-6f414092e83d)
![image](https://github.com/user-attachments/assets/dcec3cd6-2fcd-43a9-8142-a45522dbed0f)
![image](https://github.com/user-attachments/assets/6f5fd29f-0ef7-47af-a173-a8afd5429da4)

공고글을 클릭해 상세정보를 보면 공고제목, 업직종, 모집인원, 모집기간, 학력, 근무지명, 근무주소, 급여, 근무기간, 근무시간, 요일, 업체사진, 상세모집내용이 뜨고 목록으로 돌아가는 버튼과 본인이 작성한 게시물이라면 삭제하기, 수정하기 버튼이 뜨고 본인이 작성한 글이 아니면 신고하기, 채팅하기, 지원하기 버튼이 뜹니다.


## 황수만 : 
  ![회원관리 페이지](https://github.com/user-attachments/assets/a72dc0a7-ec73-4481-901f-6039557cd758)
    -관리자로 로그인 하여 관리자페이지를 누르면 전체 회원정보를 조회 할 수 있다.
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
## 황수만:  좋은 팀원들과 함께해서 너무 재밌었고, 정말 잠깐만 안 봐도 금방 잊어버린다는 걸 알았다.
 열심히도 중요하지만 꾸준히 하는 것이 
중요하다는 걸 느꼈다
-
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
