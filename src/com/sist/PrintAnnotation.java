package com.sist;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by sist on 2016-02-29.
 *   -annotation 의미 : Java class 파일에 meta정보를 기술해서
 *                      meta데이터 정보를 프로그래밍에 활용하는 방식
 *   -Annotation 용도 :
 *      - 컴파일러에게 코드 작성 문법 에러 체크 해보도록 정보제공
 *          예) @Override
 *      - 소프트웨어 개발툴이 빌드, 배치시 코드를 자동 생성하게 정보제공.
 *      - 실행(Run-Time)시 특정기능 실행하도록 정보제공.
 *   - Annotation target 종류
 *      - TYPE : class,interface,enum에서 사용가능.
 *      - FIELD : foeld에서 사용가능.
 *      - METHOD : method에서 사용가능.
 *
 *   - Annotation 타입 정의
 *      - 기본 엘리먼트 value
 *          - 어노테이션 적용할때 엘리먼트 이름 생략 가능
 *      - 두개이상의 속성을 기술할때는 value+값 형태로 기술
 *   - annotation 사용
 *
 *   - annotation 유지 정책
 *      - 어노테이션 적용코드가 유지되는 지점을 지정하는것
 *      - java.lang.annotation.RetentionPolicy; 열거 상수로 정의
 *
 *          - SOURCE
 *              - 소스상에서만 어노테이션 정보를 유지함
 *              - 소스 코드 분석할때만 의미가 있음
 *              - 바이트 코드 파일에는 정보가 남지않음
 *
 *          - CLASS
 *              - 바이트 코드파일까지 어노테이션 정보를 유지함
 *              - 하지만 리플랙션을 이용해서 어노테이션 정보를 얻을수 없음
 *
 *          - RUN-TIME
 *              - 바이트 코드 파일까지 어노테이션 정보를 유지함.
 *              - 리플렉션을 이용해서 런타임시에 어노테이션 정보를 얻을수 있음
 *   - Java Reflact란?
 *      - 리플렉션(Reflection) : 런타임에 클래스의 메타정보를 얻는 기능
 *
 */

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
    String value() default "-";
    int number() default 15;

}
