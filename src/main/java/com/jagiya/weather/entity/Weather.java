package com.jagiya.weather.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.jagiya.juso.entity.JusoGroup;
import com.jagiya.weather.enums.WeatherCategory;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;

import java.util.Date;

@Data
@Entity(name = "Weather")
@Table(name = "Weather")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties()
@DynamicInsert
@Builder
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "날씨 정보 VO")
public class Weather {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "weatherId")
    @Schema(description = "날씨 id")
    private Long weatherId;

    @Column(name = "baseDate")
    @Schema(description = "발표일자")
    private String baseDate;

    @Column(name = "baseTime")
    @Schema(description = "발표시각")
    private String baseTime;

    @Column(name = "fcstDate")
    @Schema(description = "예보일자")
    private String fcstDate;

    @Column(name = "fcstTime")
    @Schema(description = "예보시각")
    private String fcstTime;

    @Column(name = "latX")
    @Schema(description = "X좌표")
    private String latX;

    @Column(name = "lonY")
    @Schema(description = "Y좌표")
    private String lonY;

    @Column(name = "pop")
    @Schema(description = "강수확률")
    private String pop;

    @Column(name = "pty")
    @Schema(description = "강수형태")
    private String pty;

    @Column(name = "pcp")
    @Schema(description = "1시간강수량")
    private String pcp;

    @Column(name = "sky")
    @Schema(description = "하늘상태")
    private String sky;

    @Column(name = "tmp")
    @Schema(description = "1시간기온")
    private String tmp;

    @Column(name = "tmn")
    @Schema(description = "일최저기온")
    private String tmn;

    @Column(name = "tmx")
    @Schema(description = "일최기온")
    private String tmx;

    @Column(name = "regDate")
    @Schema(description = "등록일")
    private Date regDate;

    @Column(name = "modifyDate")
    @Schema(description = "수정일")
    private Date modifyDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "jusoGroupId")
    private JusoGroup jusoGroup;

    // @PrePersist 메서드 정의 (최초 등록시 호출)
    @PrePersist
    public void prePersist() {
        this.regDate = new Date(); // 현재 날짜와 시간으로 등록일 설정
    }

    // @PreUpdate 메서드 정의 (업데이트 시 호출)
    @PreUpdate
    public void preUpdate() {
        this.modifyDate = new Date(); // 현재 날짜와 시간으로 수정일 업데이트
    }

    @Override
    public String toString() {
        return "{" +
                "발표일자='" + baseDate + '\'' +
                ", 발표시각='" + baseTime + '\'' +
                ", 예보일자='" + fcstDate + '\'' +
                ", 예보시각='" + fcstTime + '\'' +
                ", " + WeatherCategory.POP.getName() + "'="  + pop + WeatherCategory.POP.getUnits() + '\'' +
                ", " + WeatherCategory.PTY.getName() + "'="  + pty + WeatherCategory.PTY.getUnits() + '\'' +
                ", " + WeatherCategory.PCP.getName() + "'="  + pcp + WeatherCategory.PCP.getUnits() + '\'' +
                ", " + WeatherCategory.SKY.getName() + "'="  + sky + WeatherCategory.SKY.getUnits() + '\'' +
                ", " + WeatherCategory.TMP.getName() + "'="  + tmp + WeatherCategory.TMP.getUnits() + '\'' +
                ", " + WeatherCategory.TMX.getName() + "'="  + tmx + WeatherCategory.TMX.getUnits() + '\'' +
                ", " + WeatherCategory.TMN.getName() + "'="  + tmn + WeatherCategory.TMN.getUnits() + '\'' +
                '}';
    }

}
