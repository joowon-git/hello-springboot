# ✅ Spring Boot 최신 기술을 학습하고 실습하기 위한 저장소입니다.

수시로 커밋하며 학습 내용을 기록합니다.


<br>
<br>
<br>
<br>

## 📚 목차 
1. [프로젝트 소개](#-Spring-Boot-최신-기술을-학습하고-실습하기-위한-저장소입니다)
2. [banner.txt](#-bannertxt-파일-추가)
3. [build.gradle 의존성 추가 이력](#-buildgradle에-추가한-dependency)


<br>
<br>
<br>
<br>


## 🎁 banner.txt 파일 추가 
### 📂 banner.txt 파일 위치 

```
src/
├── main
│   ├── java
│   └── resources
│       ├── application.yml
│       ├── banner.txt
│       ├── static
│       └── templates
└── test
    └── java
```

<br>
<br>
<br>
<br>

### 📝 `banner.txt`에 대해 
`src/main/resources/banner.txt` 파일은 Spring Boot 애플리케이션이 시작될 때 출력되는 콘솔의 배너를 설정하는 데 사용됩니다. 

<br>
<br>
<br>

### 📝 배너 작성 방법 
- 텍스트 배너는 단순히 텍스트나 ASCII 아트로 구성됩니다.
- 원하는 배너를 직접 작성하거나 [ASCII 아트 생성기](https://patorjk.com/software/taag/#p=display&h=1&v=1&f=Graffiti&t=Spring%20Boot) 같은 도구를 사용해 생성할 수 있습니다.

  #### 📝 patorjk 사이트 추천 폰트 
  - Big
  - Standard
  - Doom
  - Star wars
  - ANSI Shadow
  - Slant 


<br>
<br>
<br>


### 📝 본인 배너 내용 


```

███████╗████████╗ █████╗ ██████╗ ████████╗    ██╗
██╔════╝╚══██╔══╝██╔══██╗██╔══██╗╚══██╔══╝    ██║
███████╗   ██║   ███████║██████╔╝   ██║       ██║
╚════██║   ██║   ██╔══██║██╔══██╗   ██║       ╚═╝
███████║   ██║   ██║  ██║██║  ██║   ██║       ██╗
╚══════╝   ╚═╝   ╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝       ╚═╝
                 ██╗ ██████╗  ██████╗ ██╗    ██╗ ██████╗ ███╗   ██╗███████╗
                 ██║██╔═══██╗██╔═══██╗██║    ██║██╔═══██╗████╗  ██║██╔════╝
                 ██║██║   ██║██║   ██║██║ █╗ ██║██║   ██║██╔██╗ ██║███████╗
            ██   ██║██║   ██║██║   ██║██║███╗██║██║   ██║██║╚██╗██║╚════██║
            ╚█████╔╝╚██████╔╝╚██████╔╝╚███╔███╔╝╚██████╔╝██║ ╚████║███████║
             ╚════╝  ╚═════╝  ╚═════╝  ╚══╝╚══╝  ╚═════╝ ╚═╝  ╚═══╝╚══════╝
███╗    ███████╗██████╗ ██████╗ ██╗███╗   ██╗ ██████╗     ██████╗  ██████╗  ██████╗ ████████╗    ███╗
██╔╝    ██╔════╝██╔══██╗██╔══██╗██║████╗  ██║██╔════╝     ██╔══██╗██╔═══██╗██╔═══██╗╚══██╔══╝    ╚██║
██║     ███████╗██████╔╝██████╔╝██║██╔██╗ ██║██║  ███╗    ██████╔╝██║   ██║██║   ██║   ██║        ██║
██║     ╚════██║██╔═══╝ ██╔══██╗██║██║╚██╗██║██║   ██║    ██╔══██╗██║   ██║██║   ██║   ██║        ██║
███╗    ███████║██║     ██║  ██║██║██║ ╚████║╚██████╔╝    ██████╔╝╚██████╔╝╚██████╔╝   ██║       ███║
╚══╝    ╚══════╝╚═╝     ╚═╝  ╚═╝╚═╝╚═╝  ╚═══╝ ╚═════╝     ╚═════╝  ╚═════╝  ╚═════╝    ╚═╝       ╚══╝

```




<br>
<br>
<br>
<br>


## 🎁 build.gradle에 추가한 dependency


### 📦 Spring Boot DevTools 의존성 
```gradle
developmentOnly 'org.springframework.boot:spring-boot-devtools'
```
- 자동 재시작(Auto Restart)
  - 클래스 경로에 있는 파일이 변경될 때 자동으로 애플리케이션을 재기동 해 줍니다.
  - 코드를 수정하면 자동으로 서버가 재시작되어 변경사항이 바로 반영됩니다.
- 라이브 리로드(Live Reload)
  - 정적 자원(html, css, js 등)이 변경될 때 브라우저를 자동으로 새로고침 해 줍니다.
  - 라이브 리로드 기능을 사용하려면 브라우저에 별도 플러그인 설치가 필요합니다.
- 캐시 비활성화
  - 템플릿 캐싱을 자동으로 비활성화 합니다.
  - 개발 중에 변경사항이 바로 반영되도록 합니다.
