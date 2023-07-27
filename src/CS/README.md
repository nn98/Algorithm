<h1> CS 정리 </h1>
<h2> 테마별 </h2>

<details>
    <summary><h4>General</h4></summary>


</details>

<details>
    <summary><h4>Java</h4></summary>


</details>

<details>
    <summary><h4>JS</h4></summary>


</details>

<details>
    <summary><h4>DB</h4></summary>


</details>

<details>
  <summary><h4>Server</h4></summary>

- Image<sup>[1](#이미지)</sup>: 일반적으로 운영체제와 애플리케이션 소프트웨어 등을 포함한 완전한 실행 환경을 특정 상태로 캡처한 정적인 파일

</details>

<h2> 일자별 </h2>

<details>
  <summary><strong>2023</strong></summary>

  <details>
    <summary><i>June/06</i></summary>
      <details>
        <summary>16th</summary>

- Chat GPT3.5 중간에 끊기던거 continue generate 기능
- 서버 코드 테스트: Docker / VM / etc...
- Docker Hyper-V WSL(Windows Subsystem for Linux)
- Image<sup>[1](#이미지)</sup>: 일반적으로 운영체제와 애플리케이션 소프트웨어 등을 포함한 완전한 실행 환경을 특정 상태로 캡처한 정적인 파일
- [[Windows 10] Docker 설치 완벽 가이드(Home 포함)](https://www.lainyzine.com/ko/article/a-complete-guide-to-how-to-install-docker-desktop-on-windows-10/)
      </details>
      <details>
         <summary>20th</summary>
    
    - Docker
        - Docker : 컨테이너 기반의 오픈소스 가상화 플랫폼
            - Container
                - 독립된 가상 곤간에서 프로세스가 동작하는 기술
                - 1서버 - n컨테이너
                - 프로그램, 실행환경 추상화, 동일 인터페이스 제공 <br> 프로그램 배포/관리 단순화
                - 독립/연동 실행 자유
                - 가상 머신: 각 가상 머신에 자원 할당 및 운영체제 구축 필요 <br> 컨테이너 기반 가상화: 도커 엔진 위에서 동작, 필요 자원
                  활용 <br> ![구조 비교](https://blog.kakaocdn.net/dn/mE4qK/btr1EcLMZMg/qGN0wmhM9qKjPqVoGiYKG1/img.png)
        - Docker Image
            - 소스 코드/실행에 필요한 툴/파일/라이브러리/설정값 등 포함
            - 같은 이미지에서 여러개의 컨테이너 생성 가능, <br> 컨테이너의 상태가 바뀌거나 삭제되더라도 이미지는 변하지 않음
            - Docker Image는 Docker Hub에 업로드, 공유/다운 가능
        - Docker File
            - Docker Image 생성용 파일
            - 생성할 이미지 정보 기술
            - Docker File 열람을 통해 이미지 구성 파악
        - [설치](https://www.lainyzine.com/ko/article/a-complete-guide-to-how-to-install-docker-desktop-on-windows-10/)
        - [테스트](https://www.lainyzine.com/ko/article/a-complete-guide-to-how-to-install-docker-desktop-on-windows-10/)
            - 도커 vm 실행 확인 <br> wsl -l -v
            - 리눅스 버전 확인 <br> wsl -d docker-desktop busybox
            - 도커 버전 확인 <br> docker version
            - 실행중인 컨테이너 확인 <br> docker ps
            - 최신버전의 nginx 이미지 기반 컨테이너 생성/싱행 <br> docker run -p 4567:80 -d nginx:latest <br> [결과 확인](127.0.0.1:4567)
              호스트 포트:컨테이너 포트

      </details>
      <details>
        <summary>23th</summary>
      
        - WSL`GPT IS GOD`
          - Ubuntu
            - MS Store에서 설치
            - 설치된 앱을 실행 || cmd 등에서 wsl -d Ubuntu 실행
            - __Shift+Insert__ 안먹음; 우클릭으로 붙여넣기 가능
            - __Nginx__ 수정했으면 꼭 재시작
            - iptables 
              - `!ERR` sudo iptables -I INPUT 5 -i ens3 -p tcp --dport 9818 -m state --state NEW,ESTABLISHED -j ACCEPT 
              - `!ERRMSG` iptables: Index of insertion too big.
              - `!SOL`sudo iptables -A INPUT -i ens3 -p tcp --dport 9818 -m state --state NEW,ESTABLISHED -j ACCEPT  
      </details>
      <details>
        <summary>28th</summary>
      
        - Ubuntu
          - Symbolic Link
            - *윈도우의 바로가기 개념? 참조값?*
            - !https용 pem 파일 복사/압축/압축해제/이동 등 작업 시도했더니 관련 오류 발생
            - `심볼릭 링크를 생성할 수없습니다` `cannot operate on dangling symlink`
            - 권한문제인줄 알았더니 심볼릭링크문제
            - letsencrypt key 파일이 자동 갱신될때마다 아카이브 폴더에 새로운 pem 파일 생성.
            - 생성된 최신 파일을 참조하는 pem 파일을 프로젝트에서 사용
      </details>
      <details>
        <summary>th</summary>
      
        - Theme
      </details>
  </details>
</details>

[//]: # (<details>)

[//]: # (  <summary>년</summary>)

[//]: # (  이 부분은 년에 대한 내용입니다.)

[//]: # ()

[//]: # (  - <details>)

[//]: # (    <summary>월</summary>)

[//]: # (    이 부분은 월에 대한 내용입니다.)

[//]: # (    )

[//]: # (    - <details>)

[//]: # (      <summary>일</summary>)

[//]: # (      이 부분은 일에 대한 내용입니다.)

[//]: # (    </details>)

[//]: # (    )

[//]: # (    - <details>)

[//]: # (      <summary>일</summary>)

[//]: # (      이 부분은 일에 대한 내용입니다.)

[//]: # (    </details>)

[//]: # ()

[//]: # (  </details>)

[//]: # (</details>)

<hr>
<a name="이미지">1</a>: 
서버에서의 이미지는 일반적으로 운영체제와 애플리케이션 소프트웨어 등을 포함한 완전한 실행 환경을 특정 상태로 캡처한 정적인 파일입니다. 이 이미지를 사용하여 서버를 설정하고 배포할 수 있습니다.<br>
서버 이미지는 서버의 운영체제, 소프트웨어 패키지, 라이브러리, 환경 설정 등을 포함하며, 이를 기반으로 서버를 구성하고 실행할 수 있습니다. 이미지는 일반적으로 가상화 기술이나 컨테이너화 기술을 사용하여 만들어지며, 도커 이미지는 가장 일반적으로 사용되는 서버 이미지 형식 중 하나입니다.<br>
서버 이미지를 사용하면 개발 환경, 테스트 환경, 프로덕션 환경 등에서 동일한 실행 환경을 구성할 수 있습니다. 또한, 이미지를 쉽게 공유하고 배포할 수 있으며, 확장성과 유연성을 제공하여 서버 인스턴스를 신속하게 생성하고 관리할 수 있습니다.<br>
서버 이미지는 클라우드 플랫폼이나 가상화 기술에 따라 다양한 형식과 관리 방법이 있을 수 있습니다. 예를 들어, Amazon Web Services(AWS)에서는 Amazon Machine Image(AMI)를 사용하고, Google Cloud Platform(GCP)에서는 Compute Engine 이미지를 사용합니다.