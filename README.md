# DayFlow

> 개인 기록 & 습관 관리 서비스 (Spring Boot + MySQL 기반)

---

## 📌 프로젝트 개요

DayFlow는 단순 To-Do가 아니라, **습관, 운동, 학습** 등을 기록하고 통계를 볼 수 있는 개인 기록 서비스입니다.  
JWT 인증, OAuth2 로그인, Refresh Token 등을 지원하며, 통계 대시보드 제공이 특징입니다.

---

## 🛠 기술 스택

- **Backend:** Spring Boot 3.x, Spring Security, JPA, QueryDSL
- **Database:** MySQL 8.x
- **Build Tool:** Gradle
- **Deployment:** Docker + EC2
- **Authentication:** JWT, OAuth2

---

## 기능

- 개인 기록 CRUD
- 습관 / 운동 / 학습 항목 관리
- 일별/주별 통계 조회
- JWT 인증 및 OAuth2 로그인
- Refresh Token 지원
- 글로벌 예외 처리
